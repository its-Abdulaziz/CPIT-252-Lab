package abstractfactorydemo;

public class CSDiploma extends Diploma {
    public CSDiploma() {
        duration = 3;
        fee=8000;
    }


    @Override
    void compute() {
        System.out.println("The fees is " + fee);
    }
}
