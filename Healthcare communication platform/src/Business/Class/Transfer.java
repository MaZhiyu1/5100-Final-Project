package Business.Class;

public class Transfer extends Drug{

    public Transfer(String name, int quantity) {
        super(name, quantity);
        setType("Transfer");
    }

    public Transfer(String name,String description, String category) {
        super(name, description, category);
        setType("Transfer");
    }

}
