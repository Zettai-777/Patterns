package patterns.generated_patterns.abstract_factory.buttons;

//Конкретная реализация интерфейса кнопки под WindowsOS
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton");
    }
}
