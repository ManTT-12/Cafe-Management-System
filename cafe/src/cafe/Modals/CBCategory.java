package cafe.Modals;

public class CBCategory {
    public Object id;
    public Object name;

    public int getId() {
        return Integer.parseInt(id.toString());
    }

    public void setId(Object id) {
        this.id = id;
    }

    public String getName() {
        return name.toString();
    }

    public void setName(Object name) {
        this.name = name;
    }

    public CBCategory(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name.toString();
    }

    public int idInt(){
        return Integer.parseInt(id.toString());
    }

    public String nameString(){
        return name.toString();
    }
}
