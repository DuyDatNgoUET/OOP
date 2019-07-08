package Polymorphism.PrivateMethod;

public class Test {
    public static void main(String args[]) {
        Derived d = new Derived();
        Base b = d;
        b.show();
        d.show();

    }
}
