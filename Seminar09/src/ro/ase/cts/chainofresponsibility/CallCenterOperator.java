package ro.ase.cts.chainofresponsibility;

public class CallCenterOperator extends CallCenterHandler {
    @Override
    public void refund(double sum) {
        if(sum < 500){
            System.out.println("The total amount of "+ sum +" was returned by the Call center operator.");
        } else {
            if(nextHandler != null){
                nextHandler.refund(sum);
            }
        }
    }
}
