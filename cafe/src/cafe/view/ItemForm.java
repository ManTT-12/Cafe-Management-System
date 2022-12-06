package cafe.view;

import cafe.DAO.CategoryDAO;
import cafe.DAO.ItemDAO;
import cafe.Modals.CBCategory;
import cafe.Modals.Category;
import cafe.Modals.Item;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.TableModel;

public class ItemForm extends javax.swing.JFrame {

    List<Item> listItem = new ArrayList<>();
    ItemDAO itemDAO = new ItemDAO();

    public ItemForm() {
        initComponents();
        setCBCategory();
        getListItem();
        showItemData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        cbCate = new javax.swing.JComboBox<>();
        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        RefreshBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbItem = new javax.swing.JTable();
        txtID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JButton();
        SellForm = new javax.swing.JLabel();
        ViewBills = new javax.swing.JLabel();
        LogoutBtn = new javax.swing.JLabel();
        Category = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Account = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(207, 190, 156));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Items Management");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Name");

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Category");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Price");

        txtPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cbCate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbCate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coffee", "Item 2", "Item 3", "Item 4" }));

        AddBtn.setText("Add");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        EditBtn.setText("Edit");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Items List");

        RefreshBtn.setText("Refresh");
        RefreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshBtnActionPerformed(evt);
            }
        });

        tbItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Category", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbItem.setRowHeight(25);
        tbItem.setShowHorizontalLines(true);
        tbItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbItemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbItem);

        txtID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ID");

        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(DeleteBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AddBtn))
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(EditBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RefreshBtn))
                                .addComponent(cbCate, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(270, 270, 270))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(301, 301, 301))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(EditBtn)
                    .addComponent(DeleteBtn)
                    .addComponent(RefreshBtn))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        SellForm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SellForm.setForeground(new java.awt.Color(0, 51, 204));
        SellForm.setText("Selling");
        SellForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SellFormMouseClicked(evt);
            }
        });

        ViewBills.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ViewBills.setForeground(new java.awt.Color(0, 51, 204));
        ViewBills.setText("View Billing");
        ViewBills.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewBillsMouseClicked(evt);
            }
        });

        LogoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LogoutBtn.setForeground(new java.awt.Color(0, 51, 204));
        LogoutBtn.setText("Logout");
        LogoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutBtnMouseClicked(evt);
            }
        });

        Category.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Category.setForeground(new java.awt.Color(0, 51, 204));
        Category.setText("Category");
        Category.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(249, 78, 52));
        jLabel2.setText("H&M");

        Account.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Account.setForeground(new java.awt.Color(0, 51, 204));
        Account.setText("Account");
        Account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SellForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(ViewBills, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(LogoutBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(Category, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Account, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210)
                        .addComponent(SellForm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ViewBills, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Account, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// </editor-fold>                        

//    getListItems
    public void getListItem() {
        listItem = itemDAO.getAllItems();
    }

//    show item data
    public void showItemData() {
        DefaultTableModel modal = (DefaultTableModel) tbItem.getModel();
        modal.setRowCount(0);
        for (Item item : listItem) {
            Vector vector = new Vector();

            vector.add(item.getId());
            vector.add(item.getName());
//            vector.add(item.getCategory());
            vector.add(item.getCategoryName());
            vector.add(item.getPrice());

            modal.addRow(vector);
        }
    }

//validated input
    public boolean validateInput() {
        CBCategory CBCate = (CBCategory) cbCate.getSelectedItem();
        if (txtName.getText().isEmpty() || CBCate.getId() == 0 || txtPrice.getText().isEmpty()) {
            return false;
        }
        return true;
    }

//    AddBtn OK
    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        if (!validateInput()) {
            JOptionPane.showMessageDialog(this, "Information must be required");
        } else {
            Item item = new Item();
//            item.setId(Integer.parseInt(txtID.getText()));
            item.setName(txtName.getText());
            CBCategory CBCate = (CBCategory) cbCate.getSelectedItem();
            item.setCategory(CBCate.getId());
            item.setPrice(Integer.parseInt(txtPrice.getText()));
            System.out.println(item.toString());
            
            boolean kq = itemDAO.AddProduct(item);
            if (kq) {
                listItem = itemDAO.getAllItems();
                showItemData();
                refreshInput();
                JOptionPane.showMessageDialog(this, "Item Added");
            } else {
                JOptionPane.showMessageDialog(this, "Item Add Fail");
            }
        }
    }//GEN-LAST:event_AddBtnActionPerformed

//    Sửa thông tin OK
    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        if (txtID.getText().isEmpty() || !validateInput()) {
            JOptionPane.showMessageDialog(this, "Choose Item , please");
        } else {
            int choose = JOptionPane.showConfirmDialog(this, "Do you want edit item " + txtID.getText(), "confirm", JOptionPane.YES_NO_OPTION);

//            Update action
            int id = Integer.parseInt(txtID.getText());
            if (choose == JOptionPane.YES_OPTION) {
                
                Item oldItem = itemDAO.searchItemById(id);
                System.out.println(oldItem.toString());
                
                Item item = new Item();
                item.setId(id);
                item.setName(txtName.getText());
                CBCategory CBCate = (CBCategory) cbCate.getSelectedItem();
                item.setCategory(CBCate.getId());
                item.setPrice(Integer.parseInt(txtPrice.getText()));

                if (itemDAO.updateProduct(item)) {
                    JOptionPane.showMessageDialog(this, "Updated Item : " + id);
                    listItem = itemDAO.getAllItems();
                    showItemData();
                    refreshInput();
                } else {
                    JOptionPane.showMessageDialog(this, "Update fail : " + id);
                }
            }
        }
    }//GEN-LAST:event_EditBtnActionPerformed

//    refresh input
    public void refreshInput() {
        txtID.setText(null);
        txtName.setText(null);
        cbCate.setSelectedIndex(0);
        txtPrice.setText(null);
    }

//    setComboCategory
    void setCBCategory(){
        List<Category> listCate = new ArrayList<>();
        CategoryDAO cateDAO = new CategoryDAO();
        
        listCate = cateDAO.getAllCategory();
        
        DefaultComboBoxModel cbModel = (DefaultComboBoxModel) cbCate.getModel();
        
        cbModel.removeAllElements();
        
//        cbModel.addElement(new Category(0,"select"));
        
        for(Category cate : listCate){
            int id = cate.getId();
            String name = cate.getName();
            CBCategory cbCate = new CBCategory(id, name);
            
            cbModel.addElement(cbCate);
        }
    }
    
//    refresh form btn
    private void RefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshBtnActionPerformed
        getListItem();
        refreshInput();
        showItemData();
    }//GEN-LAST:event_RefreshBtnActionPerformed

    private void tbItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbItemMouseClicked
        CategoryDAO cateDAO = new CategoryDAO();
        
        int i = tbItem.getSelectedRow();
        TableModel model = tbItem.getModel();
        
        txtID.setText(model.getValueAt(i,0).toString());
        txtName.setText(model.getValueAt(i,1).toString());

        //set combo box selected category by select row
        String cateName = model.getValueAt(i, 2).toString();
        Category cate = cateDAO.getCateByName(cateName);
        DefaultComboBoxModel defaultComboBoxModel = (DefaultComboBoxModel) cbCate.getModel();
        defaultComboBoxModel.setSelectedItem(new CBCategory(cate.getId(),cate.getName()));

        txtPrice.setText(model.getValueAt(i,3).toString());
    }//GEN-LAST:event_tbItemMouseClicked

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        if (txtID.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Choose Item");
        } else {
            int choose = JOptionPane.showConfirmDialog(this, "You want delete this item " + txtID.getText(), "confirm", JOptionPane.YES_NO_OPTION);

//            delete action
            int id = Integer.parseInt(txtID.getText());
            if (choose == JOptionPane.YES_OPTION) {
                if (itemDAO.deleteProduct(id)) {
                    JOptionPane.showMessageDialog(this, "Deleted " + id);
                    listItem = itemDAO.getAllItems();
                    showItemData();
                    refreshInput();
                } else {
                    JOptionPane.showMessageDialog(this, "Delete fail " + id);
                }
            }
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void SellFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SellFormMouseClicked
        new SellingForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SellFormMouseClicked

    private void ViewBillsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewBillsMouseClicked
        new ViewBills().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ViewBillsMouseClicked

    private void LogoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseClicked
        new LoginForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogoutBtnMouseClicked

    private void CategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryMouseClicked
        new CategoryForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CategoryMouseClicked

    private void AccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountMouseClicked
        new AccountForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AccountMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ItemForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Account;
    private javax.swing.JButton AddBtn;
    private javax.swing.JLabel Category;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JLabel LogoutBtn;
    private javax.swing.JButton RefreshBtn;
    private javax.swing.JLabel SellForm;
    private javax.swing.JLabel ViewBills;
    private javax.swing.JComboBox<String> cbCate;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbItem;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
