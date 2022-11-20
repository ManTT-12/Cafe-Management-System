/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafe.DAO;

import cafe.Modals.Account;
import cafe.view.ConnectDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AccountDAO {

    Account acc;
    ConnectDB conn;

    public AccountDAO() {
        conn = new ConnectDB();
    }

    public Account getAccount(String username, String password) {
        conn.getConnection();
        Account acc = null;

        try {
            Statement st = conn.connect.createStatement();
            String query = "SELECT * FROM Account WHERE  username = '" +
                    username + "\' AND " + "password = \'" + password + "\'";

            ResultSet rs = st.executeQuery(query);
//            System.out.println(query);

            if (rs.next()) {
                int id = rs.getInt("id");
                acc = new Account(id, username, password);
                System.out.println(acc.getId());
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Loi truy van");
        } finally {
            conn.closeConnect();
        }
        return acc;
    }

    public boolean LoginSuccess(String username, String password) {

        Account acc = getAccount(username, password);

        if (acc == null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean InsertAccount(Account acc) {
        conn.getConnection();

        try {
            String query = "insert into Account values(?,?,?)";

            PreparedStatement st = conn.connect.prepareStatement(query);

            st.setInt(1, acc.getId());
            st.setString(2, acc.getUsername());
            st.setString(3, acc.getPassword());

            st.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conn.closeConnect();
        }
        return false;
    }
}
