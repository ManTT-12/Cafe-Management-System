package cafe.DAO;

import cafe.Modals.Item;
import cafe.view.ConnectDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ItemDAO {

    ConnectDB conn;

    public ItemDAO() {
        conn = new ConnectDB();
    }

//    search item by id
    public Item searchItemById(int id){
        conn.getConnection();
        Item item = new Item();
        try{
            String query = "select * from ProductTbl where PId =" + id;
            Statement st = conn.connect.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()){
                item.setId(rs.getInt(1));
                item.setName(rs.getString(2));
                item.setCategory(rs.getString(3));
                item.setPrice(rs.getInt(4));
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            conn.closeConnect();
        }
        return item;
    }
    
//    get all items
    public List<Item> getAllItems() {
        List<Item> listItem = new ArrayList<>();
        conn.getConnection();

        try {
            Statement st = conn.connect.createStatement();
            String query = "select * from ProductTbl";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Item item = new Item();
                item.setId(rs.getInt(1));
                item.setName(rs.getString(2));
                item.setCategory(rs.getString(3));
                item.setPrice(rs.getInt(4));

                listItem.add(item);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conn.closeConnect();
        }
        return listItem;
    }

//    add product
    public boolean AddProduct(Item item) {
        conn.getConnection();

        try {
            String query = "INSERT INTO ProductTbl VALUES(?,?,?,?)";

            PreparedStatement st = conn.connect.prepareStatement(query);
            st.setInt(1, item.getId());
            st.setString(2, item.getName());
            st.setString(3, item.getCategory());
            st.setInt(4, item.getPrice());

            st.executeUpdate();

            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();

        } finally {
            conn.closeConnect();
        }
        return false;
    }

//    update product
    public boolean updateProduct(Item item) {
        conn.getConnection();

        try {
            String query = ("update ProductTbl set PName=?, Category=?, price=? where PId=?");

            PreparedStatement st = conn.connect.prepareStatement(query);
            st.setInt(4, item.getId());
            st.setString(1, item.getName());
            st.setString(2, item.getCategory());
            st.setInt(3, item.getPrice());

            st.executeUpdate();
            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();

        } finally {
            conn.closeConnect();
        }
        return false;
    }

//    delete product
    public boolean deleteProduct(int id) {
        conn.getConnection();

        try {
            String query = "delete from ProductTbl where PId=?";
            PreparedStatement st = conn.connect.prepareStatement(query);
            st.setInt(1, id);

            st.executeUpdate();
            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();

        } finally {
            conn.closeConnect();
        }
        return false;
    }
}

