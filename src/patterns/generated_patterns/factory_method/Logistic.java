package patterns.generated_patterns.factory_method;

import com.javarush.task.task37.patterns.generated_patterns.factory_method.transport_types.TransportType;
import com.javarush.task.task37.patterns.generated_patterns.factory_method.transporters.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Logistic {
    static Transport transport;

    public static void initialize() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Каким образом Вы бы желали доставить груз?");
//            System.out.print("По ");
            while (true) {
                String answer = reader.readLine();
                if(answer.equalsIgnoreCase("exit")){
                    break;
                }
                TransportType typeOfTransport;
                try {
                    typeOfTransport = TransportType.valueOf(answer.toUpperCase());
                }catch (IllegalArgumentException iae){
                    System.out.println("Пожалуйста, повторите ввод:");
                    continue;
                }
                switch (typeOfTransport) {
                    case AIR:
                        transport = new Airplane();
                        break;
                    case SEA:
                        transport = new Boat();
                        break;
                    case OVERLAND:
                        transport = new Truck();
                        break;
                    default:
                        transport.fail();
                        System.out.println("Пожалуйста, повторите ввод:");
                        continue;
                }
                transport.getOrder();
                transport.deliver();
                transport.success();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void main(String[] args) {
        initialize();
    }

}
