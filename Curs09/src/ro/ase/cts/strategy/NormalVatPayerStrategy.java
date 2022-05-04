package ro.ase.cts.strategy;

public class NormalVatPayerStrategy implements VatStrategy{
    @Override
    public double computeVat(double amount) {
        return amount * 0.19;
    }
}
