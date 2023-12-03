package Business.Class;

public class Transfer extends Drug{

    public Transfer(String name, int quantity) {
        super(name, quantity);
        setType("Transfer");
    }

    public Transfer(String name, String id, String description, String category) {
        super(id, name, description, category);
        setType("Transfer");
    }

}
