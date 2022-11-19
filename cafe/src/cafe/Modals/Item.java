/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafe.Modals;

/**
 *
 * @author Nguye
 */
public class Item {
    private int Id;
    private String Name;
    private String Category;
    private int price;

    public Item() {
    }

    public Item(int Id, String Name, String Category, int price) {
        this.Id = Id;
        this.Name = Name;
        this.Category = Category;
        this.price = price;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "Item{" + 
                "PId" + Id +
                ", PName='" + Name + '\'' +
                ", price=" + price +
                ", Category=" + Category + '}';                
    }
}
