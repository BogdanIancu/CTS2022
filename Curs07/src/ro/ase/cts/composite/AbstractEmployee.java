package ro.ase.cts.composite;

public interface AbstractEmployee {
    double getSalary();
    void addEmployee(AbstractEmployee employee);
    void deleteEmployee(AbstractEmployee employee);
    AbstractEmployee getEmployee(int id);
}
