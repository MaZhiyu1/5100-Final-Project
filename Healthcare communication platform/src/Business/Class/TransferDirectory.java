package Business.Class;

import java.util.ArrayList;

public class TransferDirectory {

    ArrayList<Transfer> transfers;

    public TransferDirectory() {
        transfers = new ArrayList<>();
    }

    public void addOperation(Transfer e){
        transfers.add(e);
    }


    public ArrayList<Transfer> getTransfers() {
        return transfers;
    }

    public void setTransfers(ArrayList<Transfer> transfers) {
        this.transfers = transfers;
    }
}
