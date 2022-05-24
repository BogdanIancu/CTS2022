package ro.ase.cts;

import ro.ase.cts.exceptions.NullListException;

import java.util.List;

public class Main {

    public static void main(String[] args) {
    }

    public static long sum(List<Integer> elements) throws NullListException {
        long sum = 0;
        if(elements == null) {
            throw new NullListException();
        } else {
            for (int i = 0; i < elements.size(); i++) {
                sum += elements.get(i);
                if (sum > 100_000) {
                    return 100_000;
                }
            }
        }
        return sum;
    }
}
