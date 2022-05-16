package ro.ase.cts.strategy;

public class ArrayMultiplication implements ArrayOperation{
    @Override
    public double compute(Double[] values) {
        double product = 1;
        if(values != null){
            for(int i=0;i<values.length;i++){
                product = product*values[i];
            }
        }
        return product;
    }
}
