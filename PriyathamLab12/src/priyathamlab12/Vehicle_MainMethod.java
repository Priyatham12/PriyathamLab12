
package priyathamlab12;

import java.util.Scanner;

/**
 *
 * @author S544919
 */
public class Vehicle_MainMethod {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        //initializing vehicle class variables
        String brand;
        String model;
        String type;
        String powType;
        Vehicle vehicle = new Vehicle();
        //Taking the input from user
        System.out.print("Enter the vehicle Brand:");
        vehicle.setBrand(scan.next());
        System.out.print("Enter the vehicle Model:");
        vehicle.setModel(scan.next());
        System.out.print("Enter if it is PoweredVehicle or Bicycle or Skateboard: ");
        type=scan.next();
        //print if user enters input as poweredvehicle
        if(type.equalsIgnoreCase("poweredvehicle")){
            //constructor
            PoweredVehicle poweredvehicle = new PoweredVehicle();
            System.out.print("Enter Fuel Type:");
            poweredvehicle.setFuelType(scan.next());
            System.out.println(poweredvehicle.getFuelType());
            //ask user if the input is jet or car
            System.out.print("Please enter if it is a car or jet ");
            powType=scan.next();
            //print if user enters car
            if(powType.equalsIgnoreCase("car")){
                Car c = new Car();
                System.out.print("Please Enter Engine Size: ");
                c.setEngineType(scan.next());
                System.out.print("Please Enter Car Speed ");
                c.setSpeed(scan.nextInt());
                c.carSpeed(c.getSpeed());
                System.out.println("----toString method:Car --------");
                
                Car c1 = new Car(poweredvehicle.getFuelType(),vehicle.getBrand(),vehicle.getModel(),c.getEngineType(),c.getSpeed());
                System.out.println(c1.toString());  
            }
            //print if user enters jet
            else if(powType.equalsIgnoreCase("jet")){
                Jet j = new Jet();
                System.out.print("Enter Engine Count: ");
                j.setEngineCount(scan.nextInt());
                System.out.print("Enter the passenger Count ");
                j.setPassengerCount(scan.nextInt());
                j.jetType(j.getPassengerCount());
                System.out.println("----toString method:Jet --------");
                Jet j1 = new Jet(j.getEngineCount(),poweredvehicle.getFuelType(),vehicle.getBrand(),vehicle.getModel());
                System.out.println(j1.toString());
            }
            else{
                //if user enters other than car poweredvehicle,bicycle 
                System.out.println("Please Enter a Valid Option");
            }
            
        }
        //print if user enters Bicycle
        else if(type.equalsIgnoreCase("Bicycle")){
            Bicycle b = new Bicycle();
            System.out.print("Enter Gear Count: ");
            b.setGearCount(scan.nextInt());
            System.out.println("----toString method:Bicycle --------");
            Bicycle b1 = new Bicycle(b.getGearCount(), vehicle.getBrand(), vehicle.getModel());
            System.out.println(b1.toString());
            
        }
        //print if user enters Skateboard
        else if(type.equalsIgnoreCase("Skateboard")){
            Skateboard sb = new Skateboard();
            System.out.print("Enter BoardLength: ");
            sb.setBoardlength(scan.nextDouble());
            System.out.println("----toString method:SkateBoard --------");
            //double boardlength, String brand, String model
            Skateboard sb1 = new Skateboard(sb.getBoardlength(),vehicle.getBrand(), vehicle.getModel());
            System.out.print(sb1.toString());
            
        }
        else{
            System.out.println("Please Enter a valid Option");
        }
    }
    
}

