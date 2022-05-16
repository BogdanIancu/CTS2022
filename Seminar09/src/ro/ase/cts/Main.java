package ro.ase.cts;

import ro.ase.cts.chainofresponsibility.CallCenterManager;
import ro.ase.cts.chainofresponsibility.CallCenterOperator;
import ro.ase.cts.chainofresponsibility.FinancialManager;
import ro.ase.cts.state.VendingMachine;
import ro.ase.cts.strategy.ArrayMultiplication;
import ro.ase.cts.strategy.ArraySum;
import ro.ase.cts.strategy.Calculator;

public class Main {
    public static void main(String[] args) {
        CallCenterOperator callCenterOperator = new CallCenterOperator();
        CallCenterManager callCenterManager = new CallCenterManager();
        FinancialManager financialManager = new FinancialManager();
        callCenterOperator.setNextHandler(callCenterManager);
        callCenterManager.setNextHandler(financialManager);
        //callCenterOperator.refund(200);
        //callCenterOperator.refund(700);
        //callCenterOperator.refund(2000);
        callCenterOperator.refund(20000);


        Calculator calculator = new Calculator();
        calculator.setOperation(new ArraySum());
        calculator.adValues(2d,3d,5d);
        System.out.println(calculator.compute());
        calculator.setOperation(new ArrayMultiplication());
        System.out.println(calculator.compute());
        calculator.setOperation((a -> {
            double difference = a[0];
            for(int i=1;i<a.length;i++)
                difference-=a[i];
            return difference;
        }));
        System.out.println(calculator.compute());

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.inputMoney(5d);
        vendingMachine.selectProduct(3d);

    }
}