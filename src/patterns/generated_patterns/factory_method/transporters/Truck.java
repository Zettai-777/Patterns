package patterns.generated_patterns.factory_method.transporters;

import com.javarush.task.task37.patterns.generated_patterns.factory_method.transport_types.Deliverable;
import com.javarush.task.task37.patterns.generated_patterns.factory_method.transport_types.OverlandTransportation;

public class Truck extends Transport {

    @Override
    public Deliverable createTransportType() {
        return new OverlandTransportation();
    }

    @Override
    public void deliver() {
        createTransportType().deliver();
        System.out.println("Вид транспорта: " + this.getClass().getSimpleName());
    }
}
