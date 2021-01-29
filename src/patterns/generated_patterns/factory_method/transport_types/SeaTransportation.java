package patterns.generated_patterns.factory_method.transport_types;

//Морские перевозки
public class SeaTransportation implements Deliverable {

    public static final TransportType TYPE = TransportType.SEA;

    @Override
    public void deliver() {
        System.out.println("Транспортировка груза осуществляется по: " +  TYPE);

    }
}
