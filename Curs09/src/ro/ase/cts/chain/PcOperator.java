package ro.ase.cts.chain;

public class PcOperator extends AdmissionCommitteeMember {
    @Override
    public void handleAdmission(boolean isAdmissionFileComplete, boolean hasAdmissionScore) {
        if(isAdmissionFileComplete && hasAdmissionScore) {
            if(nextMember != null) {
                nextMember.handleAdmission(isAdmissionFileComplete, hasAdmissionScore);
            }
        } else {
            System.out.println("Please compute the admission score");
        }
    }
}
