
package priyathamlab12;

/**
 *
 * @author S544919
 */
public class Bicycle extends Vehicle
{
    //initializing Bicycle class variables
    private int gearCount;
    String brand =getBrand();
    public Bicycle() {
    }
    // Bicycle class Parameterized constructor with parameter gearCount
    public Bicycle(int gearCount) {
        this.gearCount = gearCount;
    }
    // Bicycle class Parameterized constructor with parameters string  and string1
    public Bicycle(String string, String string1)
    {
        super(string, string1);
    }
    // Bicycle class Parameterized constructor with parameters gearCount, string  and string1
    public Bicycle(int gearCount, String string, String string1) {
        super(string, string1);
        this.gearCount = gearCount;
    }
    //Getter method to get the gearcount
    public int getGearCount() {
        return gearCount;
    }
    // setter method to set gearcount
    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }
    //over-ridden toString method that returns String
    @Override
    public String toString() {
        return super.toString()+"Bicycle" + "gearCount=" + gearCount;
    }

    
    
    
}