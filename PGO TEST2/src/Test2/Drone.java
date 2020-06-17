package Test2;
import java.util.Scanner;
public class Drone extends Vehicle implements DrivenFly {

    int coordinate1;
    int coordinate2;
    boolean DroneFlies;
    boolean DroneDrive;


    Scanner scan=new Scanner(System.in);

    public Drone(double tankCapacity, double loadingSpace) {
        super(tankCapacity, loadingSpace);
    }

    public void EnterCoordinates() throws EngineWorkException{
        System.out.println("enter coordinate x");
       int coordinate1 =scan.nextInt();
       if(coordinate1<0) {
           throw new EngineWorkException("coordinate must be a positive number");
       }

           System.out.println("enter coordinate y");
           int coordinate2 = scan.nextInt();
           if (coordinate2 < 0) {
               throw new EngineWorkException("coordinate must be a positive number");
           }
        System.out.println("setting route to " + coordinate1 + "," + coordinate2);
       }





    @Override
    public void Drive() throws EngineWorkException {
        if (DroneDrive == true) {
            throw new EngineWorkException("It is already driving");
        } else {
            System.out.println("Driving...");
            DroneDrive = true;
        }
    }


    @Override
    public void Stop() throws EngineWorkException {
        if (DroneDrive == false) {
            throw new EngineWorkException("It has already stopped");
        } else {
            System.out.println("Stopping...");
            DroneDrive = false;
        }
    }

    @Override
    public void Fly() {
        if (DroneFlies == true) {
            System.out.println("it is flying");
        } else {
            System.out.println("it is not flying");
        }
    }
}







