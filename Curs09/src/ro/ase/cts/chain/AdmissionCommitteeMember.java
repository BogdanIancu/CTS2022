package ro.ase.cts.chain;

public abstract class AdmissionCommitteeMember {
    protected AdmissionCommitteeMember nextMember;

    public void setNextMember(AdmissionCommitteeMember nextMember) {
        this.nextMember = nextMember;
    }

    public abstract void handleAdmission(boolean isAdmissionFileComplete, boolean hasAdmissionScore);
}
