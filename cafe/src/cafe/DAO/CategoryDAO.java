package cafe.DAO;

import cafe.Modals.Category;
import cafe.view.ConnectDB;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CategoryDAO {

    ConnectDB conn;

    public CategoryDAO() {
        conn = new ConnectDB();
    }

//    get all category
    public List<Category> getAllCategory() {
        List<Category> listCate = new ArrayList<>();

        conn.getConnection();

        try {
            Statement st = (Statement) conn.connect.createStatement();
            String query = "select * from category";

            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Category cate = new Category();
                cate.setId(rs.getInt(1));
                cate.setName(rs.getString(2));
                listCate.add(cate);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            conn.closeConnect();
        }
        return listCate;
    }

//    add category
    public boolean InsertCategory(Category cate) {
        conn.getConnection();

        try {
            String query = "insert into category values(?,?)";

            PreparedStatement st = conn.connect.prepareStatement(query);
            st.setInt(1, cate.getId());
            st.setString(2, cate.getName());

            st.executeUpdate();
//            System.out.println("Inserted: " + cate.getName());
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conn.closeConnect();
        }
        return false;
    }

//    get category by id
    public Category getCateById(int id) {
        conn.getConnection();

        Category cate = new Category();

        try {
            Statement st = conn.connect.createStatement();
            String query = "SELECT * FROM category WHERE id = " + id;

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int Id = rs.getInt(1);
                String name = rs.getString(2);

                cate = new Category(Id, name);

            }
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            conn.closeConnect();
        }
        return cate;
    }

//    get category by name
    public Category getCateByName(String name) {
        conn.getConnection();

        Category cate = new Category();
        try {
            Statement st = conn.connect.createStatement();
            String query = "select * from category WHERE cateName = \'" + name + "\'";

            System.out.println(query);

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String nameCate = rs.getString("cateName");

                cate = new Category(id, nameCate);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            conn.closeConnect();
        }
        return cate;
    }

//    delete category
    public boolean deleteCategory(int id) {

        conn.getConnection();

        try {

            String query = "delete from category where id =  ?";

            PreparedStatement st = conn.connect.prepareStatement(query);

            st.setInt(1, id);

            st.executeUpdate();

            System.out.println("Deleted: " + id);
            return true;

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            conn.closeConnect();
        }
        return false;
    }

//    update category
    public boolean updateCategoryById(Category cate) {

        conn.getConnection();

        try {

            String query = "update category set cateName=? where id=?";

            PreparedStatement st = conn.connect.prepareStatement(query);
            st.setString(1, cate.getName());
            st.setInt(2, cate.getId());

            st.executeUpdate();

            System.out.println("Update complete " + cate.getId());
            return true;

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            conn.closeConnect();
        }
        return false;
    }
}
