package patterns.generated_patterns.abstract_factory.chekboxes;

//Конкретная реализация интерфейса чек-бокса под WindowsOS
public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox");
    }
}
