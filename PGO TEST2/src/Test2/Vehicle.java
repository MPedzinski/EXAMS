package Test2;

import java.sql.SQLOutput;


abstract class Vehicle implements EngineWork, AddItems{


    double TankCapacityL;
    double LoadingSpace;
    boolean IsEngineON = false;

    public Vehicle(double tankCapacity, double loadingSpace) {
    }


    @Override
    public void AddItem() throws  EngineWorkException{
            int item= 2;
            if (item>LoadingSpace){
                throw new EngineWorkException("item has greater capacity than LoadingSpace ");
            } else {
                this.LoadingSpace=LoadingSpace+item;
            }

    }

    @Override
    public void StartEngine() throws EngineWorkException {

        if (IsEngineON==true){
            throw new EngineWorkException("Engine is already on");
        } else {
            System.out.println("Starting the Engine");
            IsEngineON = true;
        }
    }

    @Override
    public void StopEngine() throws EngineWorkException{

        if (IsEngineON==false){
            throw new EngineWorkException("Engine is already off");
        }else {
            System.out.println("Stopping the Engine");
            IsEngineON = false;
        }
    }
}
