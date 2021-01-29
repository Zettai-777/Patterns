package patterns.generated_patterns.factory_method.transport_types;

// Сухопутные перевозки
public class OverlandTransportation implements Deliverable {

    public final TransportType TYPE = TransportType.OVERLAND;

    @Override
    public void deliver() {
        System.out.println("Транспортировка груза осуществляется по: " + TYPE);
    }
}
