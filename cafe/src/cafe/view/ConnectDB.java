package cafe.view;

import java.sql.*;
import java.sql.DriverManager;

//DriverManager: ql drivers, Driver: kết nối vs database server
//connection: ql các kết nối, Statement: ql các câu lệnh
//ResultSet: tập kq trả về, SQLException: Lỗi ngoại lệ xảy ra
//jdbc:sqlserver://DESKTOP-Q7811UA\\SQLEXPRESS:1433;databaseName=CafeDB";
//jdbc:sqlserver://localhost:1433;databaseName=CafeDB
public class ConnectDB {

    private String url = "jdbc:sqlserver://localhost:1433;databaseName=CafeDB";
    private String user = "sa";
    private String pass = "123";

    public Connection connect = null;

    public ConnectDB() {
    }

    public void getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connect = DriverManager.getConnection(url, user, pass);
            System.out.println("Ket noi thanh cong!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void closeConnect(){
        if(connect != null){
            connect = null;
        }
        System.out.println("Da ngat ket noi");
    }
}
