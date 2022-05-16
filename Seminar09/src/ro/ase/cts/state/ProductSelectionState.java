package ro.ase.cts.state;

public class ProductSelectionState implements VendingMachineState{
    @Override
    public void doAction() {
        System.out.println("Please select your prooduct (1-30)");
    }
}
