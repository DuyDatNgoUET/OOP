import java.util.ArrayList;


public class Person {
    private String name;
    private String address;

    private ArrayList<Vehicle> vehicleList;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicleList.add(vehicle);
    }

    public void removeVehicle(String registrationNumber){
        this.vehicleList.remove(registrationNumber);
    }

    public String getVehicleInfo(){
        String infoAllVehicle = null;
        for(int i=0;i<vehicleList.size();i++){
            infoAllVehicle += this.vehicleList.get(i).getInfo();
        }
        return getName()+" has:\n"+infoAllVehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
