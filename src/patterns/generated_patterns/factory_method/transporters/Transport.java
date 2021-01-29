package patterns.generated_patterns.factory_method.transporters;

import com.javarush.task.task37.patterns.generated_patterns.factory_method.transport_types.Deliverable;

public abstract class Transport implements Deliverable {

    //логика транспортировки
    public void getOrder(){
        System.out.println("Получен заказ на перевозку");
    }

    @Override
    public void deliver(){
        Deliverable deliverable = createTransportType();
        deliverable.deliver();
    }

    public void success(){
        System.out.println("Доставка успешно выполнена.");
    }

    public void fail(){
        System.out.println("Возникли непредвиденные трудности!");
    }

    public abstract Deliverable createTransportType();



}
