package patterns.generated_patterns.abstract_factory;

import com.javarush.task.task37.patterns.generated_patterns.abstract_factory.apps.Application;
import com.javarush.task.task37.patterns.generated_patterns.abstract_factory.factories.GUIFactory;
import com.javarush.task.task37.patterns.generated_patterns.abstract_factory.factories.MacOSFactory;
import com.javarush.task.task37.patterns.generated_patterns.abstract_factory.factories.WindowsFactory;

import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {
        Application application = configureApplication();
        application.paint();
    }

    private static Application configureApplication(){
        Application application;
        GUIFactory factory;
        Scanner scanner = new Scanner(System.in);
        String osName = scanner.next().toLowerCase();
        if(osName.contains("mac")){
            factory = new MacOSFactory();
            application = new Application(factory);
        }else if(osName.contains("windows")){
            factory = new WindowsFactory();
            application = new Application(factory);
        }else{
            application = null;
        }
        return application;
    }
}
