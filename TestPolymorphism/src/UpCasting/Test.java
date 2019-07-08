package UpCasting;

public class Test {
    public static void main(String []args){
        /*// test upcasting
        Person p;
        Employee e = new Employee();
        p = (Person)e;*/


        /*// test polymorphism
        Person p1 = new Person();
        Person p2 = new Employee();
        Person p3 = new Manager();
        System.out.println(p1.getDetail());
        System.out.println(p2.getDetail());
        System.out.println(p3.getDetail());*/


        // test dowcasting
        Employee e = new Employee();
        Person p = (Person)e; // Upcasting - up len cha
        Employee ee = (Employee)p ; // Dowcasting = dow xuong con

        // test instanceof



    }
}
