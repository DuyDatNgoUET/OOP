public class Test {
    public static void main(String[] args) {
        Person ps = new Person("Ngo Duy Dat", "Ha Noi");
        Car c = new Car("Mercerdes","S300 AMG", "30M 56789", ps, 4);

        MotorBike mb = new MotorBike("Harley","classic","30A 56789",ps,false);

        ps.addVehicle(c);
        ps.addVehicle(mb);
        System.out.println(ps.getVehicleInfo());

    }
}
