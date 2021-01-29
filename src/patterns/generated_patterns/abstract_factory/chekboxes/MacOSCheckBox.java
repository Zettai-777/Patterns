package patterns.generated_patterns.abstract_factory.chekboxes;

//Конкретная реализация интерфейса чек-бокс под MacOS
public class MacOSCheckBox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckBox");
    }
}
