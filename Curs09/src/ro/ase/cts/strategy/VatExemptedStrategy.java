package ro.ase.cts.strategy;

public class VatExemptedStrategy implements VatStrategy{
    @Override
    public double computeVat(double amount) {
        return 0;
    }
}
