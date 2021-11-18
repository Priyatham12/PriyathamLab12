
package priyathamlab12;

/**
 *
 * @author S544919
 */
public class Car extends PoweredVehicle{
    //initializing variables
   private String engineType;
   private int speed;
   String fuel=getFuelType();
  
   //Parameterized constructor 
    public Car(String fuelType, String brand, String model,String engineType,int speed) {
        super(fuelType, brand, model);
        this.engineType = engineType;
        this.speed = speed;
    }
    //Parameterized constructor with parameters enginetype, speed and fueltype
    public Car(String engineType, int speed, String fuelType) {
        super(fuelType);
        this.engineType = engineType;
        this.speed = speed;
    }
    //Default constructor
    public Car() {
    }
    //Parameterized constructor 
    public Car(String engineType, int speed) {
        this.engineType = engineType;
        this.speed = speed;
    }

    // Getter method to get the Type 
    public String getEngineType() {
        return engineType;
    }
    // Setter method to set the type of the engine
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    // getter method to get the speed
    public int getSpeed() {
        return speed;
    }
    // setter method to set or assign the speed
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    //getter method to get the fuel
    public String getS() {
        return fuel;
    }
    //Setter method to set or assign the fuel 
    public void setS(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return super.toString()+"Car{" + "Engine Size :" + engineType + ", Speed:" + speed + '}';
    }

   

    // Method with parameter speed
    public void carSpeed(int speed)
    {
        System.out.println("------Before Accelerating , the speed is:-----");
        System.out.println("Car Speed : "+speed+" miles/hour");
        System.out.println();
        System.out.println("------After Accelerating , the speed is:-----");
        setSpeed(speed+50);
        System.out.println("Car Speed after accelerating : "+getSpeed()+" miles/hour");
    }
}