package ro.ase.cts.orchestrators;

import ro.ase.cts.contracts.Calculation;
import ro.ase.cts.contracts.ValuesReader;

import java.util.List;

public class Orchestrator {
    private final ValuesReader reader;
    private final Calculation calculation;

    public Orchestrator(ValuesReader reader, Calculation calculation){
        this.reader = reader;
        this.calculation = calculation;
    }

    public void execute() {
        List<Integer> list = reader.readValues(5);
        var result = calculation.calculate(list);
        System.out.println(result);
    }
}
