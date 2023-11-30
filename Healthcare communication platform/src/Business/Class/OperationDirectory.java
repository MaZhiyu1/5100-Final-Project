package Business.Class;

import java.util.ArrayList;

public class OperationDirectory {


    ArrayList<Operation> operations;

    public OperationDirectory() {
        operations = new ArrayList<>();
    }

    public void addOperation(Operation e){
        operations.add(e);
    }

    public ArrayList<Operation> getOperations() {
        return operations;
    }

    public void setOperations(ArrayList<Operation> operations) {
        this.operations = operations;
    }
}
