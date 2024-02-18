package CompositePatternDemo2;

public class CompositeDesignPatternMain {
    public static void main(String[] args) {
        Employee emp1 = new Developer("Ali",10000);
        Employee emp2 = new Developer("Salah",15000);

        Employee manager1 = new Developer("Abdo",25000);

        manager1.add(emp1);
        manager1.add(emp2);

        Employee emp3 = new Developer("Hasan",20000);

        Manager generalManager = new Manager("Khalid", 50000);
        generalManager.add(emp3);
        generalManager.add(manager1);

        generalManager.print();
    }
}
