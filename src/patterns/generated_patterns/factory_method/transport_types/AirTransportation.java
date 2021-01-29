package patterns.generated_patterns.factory_method.transport_types;

//Воздушные перевозки
public class AirTransportation implements Deliverable{

    public static final TransportType TYPE = TransportType.AIR;

    @Override
    public void deliver() {
        System.out.println("Транспортировка груза осуществляется по: " + TYPE);
    }


}
