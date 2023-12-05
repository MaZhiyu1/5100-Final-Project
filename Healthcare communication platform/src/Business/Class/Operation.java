package Business.Class;

public class Operation extends Drug {


    public Operation(String name, int quantity) {
        super(name, quantity);
        setType("Operation");
    }

    public Operation(String name, String description, String category) {
        super( name, description, category);
        setType("Operation");
    }
}
