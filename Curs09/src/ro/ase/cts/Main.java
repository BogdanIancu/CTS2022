package ro.ase.cts;

import ro.ase.cts.chain.CommitteeDirector;
import ro.ase.cts.chain.PcOperator;
import ro.ase.cts.chain.StudentVolunteer;
import ro.ase.cts.state.AutonomousCar;
import ro.ase.cts.strategy.Accountant;
import ro.ase.cts.strategy.NormalVatPayerStrategy;
import ro.ase.cts.strategy.VatExemptedStrategy;

public class Main {

    public static void main(String[] args) {
        StudentVolunteer student = new StudentVolunteer();
        PcOperator operator = new PcOperator();
        CommitteeDirector director = new CommitteeDirector();
        student.setNextMember(operator);
        operator.setNextMember(director);
        student.handleAdmission(true, true);

        Accountant accountant = new Accountant();
        accountant.setVatStrategy(new VatExemptedStrategy());
        accountant.issueInvoice(100);
        accountant.setVatStrategy(new NormalVatPayerStrategy());
        accountant.issueInvoice(50);
        accountant.setVatStrategy(x -> x * 0.05);
        accountant.issueInvoice(10);

        AutonomousCar autonomousCar = new AutonomousCar();
        autonomousCar.driveMeToDestination("CSIE");
    }
}
