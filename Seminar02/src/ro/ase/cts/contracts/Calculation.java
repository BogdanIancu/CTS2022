package ro.ase.cts.contracts;

import java.util.List;

public interface Calculation<T> {
    T calculate(List<Integer> list);
}
