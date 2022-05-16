package ro.ase.cts.strategy;

public class ArraySum implements ArrayOperation {
    @Override
    public double compute(Double[] values) {
        double result = 0;
        if(values != null){
            for(int i=0;i<values.length;i++) {
                result +=values[i];
            }
        }
        return result;
    }
}
