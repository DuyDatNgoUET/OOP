package Polymorphism.PrivateMethod;

public class Base {

    private void f(){
        System.out.println("base f()");
    }

    public void show(){
        f();

    }
}
