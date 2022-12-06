/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafe.Modals;

/**
 *
 * @author Nguye
 */
public class Bill {
    private int Id;
    private String Buyer;
    private String itemName;
    private String date;
    private int qty;
    private int total;
    
    @Override
    public String toString(){
        return "Bill{" +
                "Id=" + Id +
                ", Buyer=" + Buyer +
                ", ItemName=" + itemName +
                ", date='" + date + '\'' +
                ", Qty=" + qty +
                ", total=" + total +
                '}';
    }

    public Bill() {
    }

    public Bill(int Id, String Buyer, String itemName, String date, int qty, int total) {
        this.Id = Id;
        this.Buyer = Buyer;
        this.itemName = itemName;
        this.date = date;
        this.qty = qty;
        this.total = total;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getBuyer() {
        return Buyer;
    }

    public void setBuyer(String Buyer) {
        this.Buyer = Buyer;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
}
