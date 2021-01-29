package patterns.generated_patterns.factory_method.transporters;

import com.javarush.task.task37.patterns.generated_patterns.factory_method.transport_types.AirTransportation;
import com.javarush.task.task37.patterns.generated_patterns.factory_method.transport_types.Deliverable;

public class Airplane extends Transport{


    @Override
    public Deliverable createTransportType() {
        return new AirTransportation();
    }

    @Override
    public void deliver() {
        createTransportType().deliver();
        System.out.println("Вид транспорта: " + this.getClass().getSimpleName());
    }
}
