package CompositePatternDemo2;

public interface Employee {

    public String getName();

    public double getSalary();

    public void print();

    public void add(Employee e);

    public void remove(Employee e);

    public Employee getChild(int i);

}
