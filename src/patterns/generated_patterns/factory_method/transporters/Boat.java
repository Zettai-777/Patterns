package patterns.generated_patterns.factory_method.transporters;

import com.javarush.task.task37.patterns.generated_patterns.factory_method.transport_types.Deliverable;
import com.javarush.task.task37.patterns.generated_patterns.factory_method.transport_types.SeaTransportation;

public class Boat extends Transport {

    @Override
    public Deliverable createTransportType() {
        return new SeaTransportation();
    }

    @Override
    public void deliver() {
        createTransportType().deliver();
        System.out.println("Вид транспорта: " + this.getClass().getSimpleName());
    }
}
