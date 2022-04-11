package ro.ase.cts.composite;

import java.util.ArrayList;
import java.util.List;

public class CallCenterManager implements AbstractEmployee {
    private List<AbstractEmployee> employeeList = new ArrayList<>();

    @Override
    public double getSalary() {
        double sum = 0;
        for(AbstractEmployee e : employeeList) {
            sum += e.getSalary();
        }
        return sum * 2;
    }

    @Override
    public void addEmployee(AbstractEmployee employee) {
        employeeList.add(employee);
    }

    @Override
    public void deleteEmployee(AbstractEmployee employee) {
        employeeList.remove(employee);
    }

    @Override
    public AbstractEmployee getEmployee(int id) {
        return employeeList.get(id);
    }
}
