
package priyathamlab12;

/**
 *
 * @author S544919
 */
public class PoweredVehicle extends Vehicle{
    //initializing poweredvehicle class variables
    private String fuelType;
        
    String brand =getBrand();
    // PoweredVehicle class Parameterized constructor
    public PoweredVehicle(String fuelType) {
        this.fuelType = fuelType;
    }
    // PoweredVehicle class Default constructor
    public PoweredVehicle() {
    }
    // PoweredVehicle class Parameterized constructor
    public PoweredVehicle(String fuelType, String brand, String model) {
        super(brand, model);
        this.fuelType = fuelType;
    }
    // Getter method to get the fuel type
    public String getFuelType() {
        return fuelType;
    }
    // Setter method to set Fuel type
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    //Getter method to get brand
    public String getA() {
        return brand;
    }
    // Setter method to set brand
    public void setA(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return (super.toString()+  "Fuel Type :" + fuelType + '}');
    }
    

  
    
}