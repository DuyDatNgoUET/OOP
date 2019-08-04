public class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String brand, String model, String registrationNumber, Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    String getInfo() {
        return "Car:\n\t"+
                "Brand: "+getBrand()+
                "\n\tModel: "+getModel()+
                "\n\tRegistrationNumber: "+getRegistrationNumber()+
                "\n\tNumber of Doors: "+getNumberOfDoors()+
                "\n\tBelongs to "+getOwner().getName() + " "+getOwner().getAddress();
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
