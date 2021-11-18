
package priyathamlab12;

/**
 *
 * @author S544919
 */
public class Jet extends PoweredVehicle{
    //initializing Jet class variables
            private int engineCount;
            private int passengerCount;
              
            String fuel=getFuelType();
    @Override
    public String toString() {
        return super.toString() + "engineCount:" + engineCount + ", passengerCount:" + passengerCount;
    }
    // Getter method to get Enginecount
    public int getEngineCount() {
        return engineCount;
    }
    // Setter method to set the enginecount
    public void setEngineCount(int engineCount) {
        this.engineCount = engineCount;
    }
    // Getter method to get the Passenger count
    public int getPassengerCount() {
        return passengerCount;
    }
    // Setter method to set the Passenger count
    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }
    // Jet class Default Constructor
    public Jet() {
    }
    // Jet class Parameterized Constructor with parameters enginecount and passenger count
    public Jet(int engineCount, int passengerCount) {
        this.engineCount = engineCount;
        this.passengerCount = passengerCount;
    }
    // Jet class Parameterized Constructor with parameters enginecount,fuel type,brand,model
    public Jet(int engineCount, String fuelType, String brand, String model) {
        super(fuelType, brand, model);
        this.engineCount = engineCount;
    }
    // Method with parameter count
    public void jetType(int count){
        if(count<=2){
            System.out.println("Ultralight aviation- The Number of passengers in the jet are "+count);
        }
        else if(count<100){
            System.out.println("Regional Jet- The Number of passengers in the jet are "+count);
        }
        else{
            System.out.println("Airbus- The Number of passengers in the jet are "+count);
        }
    }
}