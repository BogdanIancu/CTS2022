package ro.ase.cts.chain;

public class StudentVolunteer extends AdmissionCommitteeMember {
    @Override
    public void handleAdmission(boolean isAdmissionFileComplete,
                                boolean hasAdmissionScore) {
        if(isAdmissionFileComplete) {
            if(nextMember != null) {
                nextMember.handleAdmission(isAdmissionFileComplete, hasAdmissionScore);
            }
        } else {
            System.out.println("The admission file is incomplete");
        }
    }
}
