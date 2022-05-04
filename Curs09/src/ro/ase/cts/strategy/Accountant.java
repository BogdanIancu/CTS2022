package ro.ase.cts.strategy;

public class Accountant {
    private VatStrategy strategy;

    public void setVatStrategy (VatStrategy strategy) {
        this.strategy = strategy;
    }

    public void issueInvoice(double amount) {
        if(strategy != null) {
            double vat = strategy.computeVat(amount);
            System.out.println("Final amount: "
                    + (amount + vat));
        }
    }
}
