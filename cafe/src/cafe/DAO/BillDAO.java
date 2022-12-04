/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafe.DAO;

import cafe.view.ConnectDB;
import cafe.Modals.Bill;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class BillDAO {

    public ConnectDB conn;

    public BillDAO() {
        conn = new ConnectDB();
    }

    //    get all bill
    public List<Bill> getAllBill() {
        List<Bill> listBill = new ArrayList<>();
        conn.getConnection();

        try {
            String query = "select a.id, a.seller, b.name, a.bDate, a.bQty, a.total " +
                    "from bill a join product b on a.pName = b.name";
            Statement st = conn.connect.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                Bill bill = new Bill();
                bill.setId(rs.getInt(1));
                bill.setSeller(rs.getString(2));
                bill.setItemName(rs.getString(3));
                bill.setDate(rs.getString(4));
                bill.setQty(rs.getInt(5));
                bill.setTotal(rs.getInt(6));

                listBill.add(bill);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.closeConnect();
        }
        return listBill;
    }

//    insert bill
    public boolean InsertBill(Bill bill) {
        conn.getConnection();

        try {
            String query = "insert into bill values(?,?,?,?,?,?)";

            PreparedStatement st = conn.connect.prepareStatement(query);
            st.setInt(1, bill.getId());
            st.setString(2, bill.getSeller());
            st.setString(3, bill.getItemName());
            String datetime = LocalDateTime.now().toString();
            st.setString(4, datetime);
            st.setInt(5, bill.getQty());
            st.setInt(6, bill.getTotal());

            st.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conn.closeConnect();
        }
        return false;
    }

//    delete bill
    public boolean DeleteBill(int id) {
        conn.getConnection();

        try {
            String query = "delete from bill where id=?";
            PreparedStatement st = conn.connect.prepareStatement(query);
            st.setInt(1, id);

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
