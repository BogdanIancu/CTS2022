package ro.ase.cts.chain;

public class CommitteeDirector extends AdmissionCommitteeMember {

    @Override
    public void handleAdmission(boolean isAdmissionFileComplete, boolean hasAdmissionScore) {
        if(isAdmissionFileComplete && hasAdmissionScore) {
            System.out.println("The admission file is accepted");
            if(nextMember != null) {
                nextMember.handleAdmission(isAdmissionFileComplete, hasAdmissionScore);
            }
        } else {
            System.out.println("Please check your admission file again");
        }
    }
}
