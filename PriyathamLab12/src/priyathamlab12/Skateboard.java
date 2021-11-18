
package priyathamlab12;

/**
 *
 * @author S544919
 */
public class Skateboard extends Vehicle{
     //initializing SkateBoard class variables
    private double boardlength;
    String b =getBrand();
    String a=toString();
    //Skateboard class Parameterized constructor
    public Skateboard(double boardlength) {
        this.boardlength = boardlength;
    }
    //Skateboard class Parameterized constructor
    public Skateboard(double boardlength, String brand, String model) {
        super(brand, model);
        this.boardlength = boardlength;
    }
    
    // Getter method to get the Boardlength
    public double getBoardlength() {
        return boardlength;
    }
    // Setter method to set boardlength
    public void setBoardlength(double boardlength) {
        this.boardlength = boardlength;
    }
    
    // Skateboard class Default Constructor
    public Skateboard() {
    }
    //Skateboard class Parameterized constructor
    public Skateboard(String brand, String model) {
        super(brand, model);
    }

    @Override
    public String toString() {
        return  super.toString()+ "boardlength=" + boardlength + '}';
    }
}