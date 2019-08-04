public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    public MotorBike(String brand, String model, String registrationNumber, Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    @Override
    String getInfo() {
        return "MotorBike:\n\t"+
                "Brand: "+getBrand()+
                "\n\tModel: "+getModel()+
                "\n\tRegistrationNumber: "+getRegistrationNumber()+
                "\n\tHas Side Car: "+isHasSidecar()+
                "\n\tBelongs to "+getOwner().getName() + " "+getOwner().getAddress();
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
