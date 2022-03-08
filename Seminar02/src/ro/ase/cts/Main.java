package ro.ase.cts;

import ro.ase.cts.contracts.Calculation;
import ro.ase.cts.contracts.ValuesReader;
import ro.ase.cts.orchestrators.Orchestrator;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) {
        ValuesReader reader = new ConsoleReader();
        Calculation calculation = null;
        try {
            calculation = (Calculation) Class.forName("ro.ase.cts.SumCalculation").getDeclaredConstructor().newInstance();
            Orchestrator orchestrator = new Orchestrator(reader, calculation);
            orchestrator.execute();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
