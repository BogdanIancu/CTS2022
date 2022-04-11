package ro.ase.cts.composite;

public class CallCenterOperator implements AbstractEmployee {

    @Override
    public double getSalary() {
       return 2000;
    }

    @Override
    public void addEmployee(AbstractEmployee employee) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteEmployee(AbstractEmployee employee) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AbstractEmployee getEmployee(int id) {
        throw new UnsupportedOperationException();
    }
}
