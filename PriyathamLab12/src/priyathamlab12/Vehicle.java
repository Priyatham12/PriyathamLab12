
package priyathamlab12;

/**
 *
 * @author S544919
 */
public class Vehicle {
    //initializing vehicle class variables
            private String brand;
            private String model;
    //vehicle class default constructor
     public Vehicle() {
      }
    //vehicle class Paramterized constructor with parameters brand and model
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    // Getter method to get the brand
    public String getBrand() {
        return brand;
    }
    //getter method to get the model
    public String getModel() {
        return model;
    }
    // Setter method to set brand
    public void setBrand(String brand) {
        this.brand = brand;
    }
    // Setter method to set model
    public void setModel(String model) {
        this.model = model;
    }

   // overridden toString method 
    public String toString() {
        return ("VehicleBrand:" + brand + ", Vehicle Model :" + model);
    }
            
            
}