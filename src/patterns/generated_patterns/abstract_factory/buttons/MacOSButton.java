package patterns.generated_patterns.abstract_factory.buttons;

//Конкретная реализация интерфейса кнопки под MacOS
public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton");
    }
}
