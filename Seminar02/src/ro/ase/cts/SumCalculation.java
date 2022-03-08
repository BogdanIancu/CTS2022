package ro.ase.cts;

import ro.ase.cts.contracts.Calculation;

import java.util.List;

public class SumCalculation implements Calculation<Long> {

    @Override
    public Long calculate(List<Integer> list) {
        long sum = 0;
        for (int x : list) {
            sum += x;
        }
        return sum;
    }
}
