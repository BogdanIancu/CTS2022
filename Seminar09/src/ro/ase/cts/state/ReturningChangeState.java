package ro.ase.cts.state;

public class ReturningChangeState implements VendingMachineState{
    @Override
    public void doAction() {
        System.out.println("Please pick your change.");
    }
}
