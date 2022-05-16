package ro.ase.cts.chainofresponsibility;

public class FinancialManager extends CallCenterHandler{
    @Override
    public void refund(double sum) {
        if(sum < 10000){
            System.out.println("The total amount of "+ sum +" was returned by the Financial manager.");
        } else {
            if(nextHandler != null){
                nextHandler.refund(sum);
            }
        }
    }
}
