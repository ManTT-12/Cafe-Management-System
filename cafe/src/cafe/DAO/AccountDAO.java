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
import java.util.ArrayList;
import java.util.List;

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
                int lv = Integer.parseInt(rs.getString("Level"));
                acc = new Account(id, username, password, lv);
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
            String query = "insert into Account values(?,?,?,?)";

            PreparedStatement st = conn.connect.prepareStatement(query);

            st.setInt(1, acc.getId());
            st.setString(2, acc.getUsername());
            st.setString(3, acc.getPassword());
            st.setInt(4, acc.getLevel());

            st.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conn.closeConnect();
        }
        return false;
    }
    
//    get list account
    public List<Account> getAllAccount() {
        List<Account> listAcc = new ArrayList<>();
        conn.getConnection();

        try {
            String query = "select * from account";
            Statement st = conn.connect.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Account acc = new Account();
                acc.setId(rs.getInt(1));
                acc.setUsername(rs.getString(2));
                acc.setPassword(rs.getString(3));
                acc.setLevel(rs.getInt(4));

                listAcc.add(acc);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            conn.closeConnect();
        }
        return listAcc;
    }
    
//    search acc by id
    public Account searchAccById(int id){
        conn.getConnection();
        Account acc = new Account();
        try {
            String query = "select * from account where id =" + id;
            Statement st = conn.connect.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()){
                acc.setId(rs.getInt(1));
                acc.setUsername(rs.getString(2));
                acc.setPassword(rs.getString(3));
                acc.setLevel(rs.getInt(4));
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            conn.closeConnect();
        }
        return acc;
    }
}
