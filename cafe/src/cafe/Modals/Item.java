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
    private int Category;
    private String CategoryName;
    private int price;

    public Item() {
    }

    public Item(int Id, String Name, int Category, String CategoryName, int price) {
        this.Id = Id;
        this.Name = Name;
        this.Category = Category;
        this.CategoryName = CategoryName;
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

    public int getCategory() {
        return Category;
    }

    public void setCategory(int Category) {
        this.Category = Category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    @Override
    public String toString(){
        return "Item{" + 
                "PId" + Id +
                ", PName='" + Name + '\'' +
                ", price=" + price +
                ", Category=" + Category +
                ", CategoryName='" + CategoryName + '\'' +
                '}';                
    }
    
    public Item(int Id, String Name, int price, int Category) {
        this.Id = Id;
        this.Name = Name;
        this.price = price;
        this.Category = Category;
    }

    public Item(int id, String name, int price, int category, String categoryName) {
        Id = id;
        Name = name;
        price = price;
        Category = category;
        CategoryName = categoryName;
    }
}
