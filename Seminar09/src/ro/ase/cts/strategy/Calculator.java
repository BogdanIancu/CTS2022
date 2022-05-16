package ro.ase.cts.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {
    private List <Double> values = new ArrayList<>();
    private ArrayOperation operation;

    public void setOperation(ArrayOperation operation) {
        this.operation = operation;
    }

    public void adValues (Double... numbers){
        values.addAll(Arrays.asList(numbers));
    }
    public void clearValues() {
        values.clear();
    }

    public Double compute(){
        double result = 0;
        if(operation != null) {
            result = operation.compute(values.toArray(new Double[0]));
        }
        return result;
    }


}
