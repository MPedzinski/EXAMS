package Test2;

public class Train extends Vehicle implements Drive {

   boolean isDriving = false;

    public Train(double tankCapacity, double loadingSpace) {
        super(tankCapacity, loadingSpace);
    }


    @Override
    public void Drive() throws EngineWorkException {

            if (isDriving==true){
                throw new EngineWorkException("It is already driving");
            } else {
                System.out.println("Driving...");
                isDriving = true;
            }
        }



    @Override
    public void Stop() throws EngineWorkException {
        if (isDriving==false){
            throw new EngineWorkException("It has already stopped");
        } else {
            System.out.println("Stopping...");
            isDriving = false;
        }
    }

}

