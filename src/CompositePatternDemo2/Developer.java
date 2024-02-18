package CompositePatternDemo2;

public class Developer implements Employee {

    private String name;

    private double salary;

    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("Name=" + getName());
        System.out.println("Salary=" + getSalary());
    }

    @Override
    public void add(Employee e) {
    }

    @Override
    public void remove(Employee e) {
    }

    @Override
    public Employee getChild(int i) {
        return null;
    }

}
