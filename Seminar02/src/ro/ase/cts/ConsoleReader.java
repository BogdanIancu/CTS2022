package ro.ase.cts;

import ro.ase.cts.contracts.ValuesReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ConsoleReader implements ValuesReader {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public List<Integer> readValues(int size) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int value = scanner.nextInt();
            list.add(value);
        }
        return list;
    }
}
