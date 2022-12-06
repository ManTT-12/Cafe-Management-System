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
    public Item searchItemById(int id) {
        conn.getConnection();
        Item item = new Item();
        try {
            String query = "select * "
                    + "from product a join category b "
                    + "on a.id = b.id "
                    + "where a.id = " + id;
            Statement st = conn.connect.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                item.setId(rs.getInt(1));
                item.setName(rs.getString(2));
                item.setCategory(rs.getInt(3));
                item.setCategoryName(rs.getString(4));
                item.setPrice(rs.getInt(5));
            }
        } catch (SQLException e) {
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
            String query = "select a.id, a.name, b.id, b.cateName, a.price " +
                    "from product a join category b on a.category_id = b.id";
            Statement st = conn.connect.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                Item item = new Item();
                item.setId(rs.getInt(1));
                item.setName(rs.getString(2));
                item.setCategory(rs.getInt(3));
                item.setCategoryName(rs.getString(4));
                item.setPrice(rs.getInt(5));

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
            String query = "insert into product values(?,?,?,?)";

            PreparedStatement st = conn.connect.prepareStatement(query);
            st.setInt(1, item.getId());
            st.setString(2, item.getName());
            st.setInt(3, item.getCategory());
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
            String query = "update product set name=?, category_id=?, price=? where id=?";

            PreparedStatement st = conn.connect.prepareStatement(query);
            st.setString(1, item.getName());
            st.setInt(2, item.getCategory());
            st.setInt(3, item.getPrice());
            st.setInt(4, item.getId());

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
            String query = "delete from product where id=?";
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
