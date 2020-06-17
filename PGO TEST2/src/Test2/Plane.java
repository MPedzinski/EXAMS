package Test2;

public class Plane extends Vehicle implements Fly{

   double MaxSpeed;
   boolean IsFlying=false;

    public Plane(double maxSpeed, double TankCapacity, double LoadingSpace) {
        super(TankCapacity, LoadingSpace);
        MaxSpeed = maxSpeed;
    }




    @Override
    public void AddItem() {



    }


    @Override
    public void Fly() {
        if (IsFlying==true) {
            System.out.println("it is flying");
        } else {
            System.out.println("it is not flying");
        }
    }
}
