package ro.ase.cts.chainofresponsibility;

public class CallCenterManager extends CallCenterHandler{
    @Override
    public void refund(double sum) {
        if(sum < 2000){
            System.out.println("The total amount of "+ sum +" was returned by the Call center manager.");
        } else {
            if(nextHandler != null){
                nextHandler.refund(sum);
            }
        }
    }
}
