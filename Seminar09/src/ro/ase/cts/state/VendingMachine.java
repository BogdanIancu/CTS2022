package ro.ase.cts.state;

public class VendingMachine {
    private double amount;
    private double change;
    private VendingMachineState state;

    public VendingMachine() {
        state = new AcceptingMoneyState();
        state.doAction();
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void inputMoney(double amount) {
        this.amount = amount;
        setState(new ProductSelectionState());
        state.doAction();
    }
    public void selectProduct(double price) {
        if (price < amount) {
           change = amount - price;
           setState(( new DeliveringProductState()));
           state.doAction();
           setState(new ReturningChangeState());
           state.doAction();
           System.out.println("Change = "+change);
        } else {
            setState( new AcceptingMoneyState());
            state.doAction();
        }
    }
}
