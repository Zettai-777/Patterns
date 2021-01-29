package patterns.generated_patterns.factory_method.transport_types;

public enum TransportType {
    OVERLAND ("СУШЕ"),
    SEA ("МОРЮ"),
    AIR("ВОЗДУХУ");

    private String typeOfTransport;

    TransportType(String typeOfTransport){
        this.typeOfTransport = typeOfTransport;
    }

}
