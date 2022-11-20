/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafe.DAO;

import cafe.Modals.Account;
import cafe.view.ConnectDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AccListDAO {

    ConnectDB conn;

    public AccListDAO() {
        conn = new ConnectDB();
    }

//    get list account
    public List<Account> getAllAccount() {
        List<Account> listAcc = new ArrayList<>();
        conn.getConnection();

        try {
            String query = "select * from Account";
            Statement st = conn.connect.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Account acc = new Account();
                acc.setId(rs.getInt(1));
                acc.setUsername(rs.getString(2));
                acc.setPassword(rs.getString(3));

                listAcc.add(acc);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            conn.closeConnect();
        }
        return listAcc;
    }
}
