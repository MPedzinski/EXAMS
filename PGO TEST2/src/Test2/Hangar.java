package Test2;
import java.util.List;
import java.util.ArrayList;
public class Hangar {

    int Capacity;

    public Hangar(int capacity) {
        Capacity = capacity;
    }

    List<Vehicle> Vehicles = new ArrayList<Vehicle>(Capacity);

    public void StoreVehicle(Vehicle v){
        Vehicles.add(v);
    }


}
