package patterns.generated_patterns.abstract_factory.apps;

import com.javarush.task.task37.patterns.generated_patterns.abstract_factory.buttons.Button;
import com.javarush.task.task37.patterns.generated_patterns.abstract_factory.chekboxes.Checkbox;
import com.javarush.task.task37.patterns.generated_patterns.abstract_factory.factories.GUIFactory;

//Код, использующий фабрику, которому не важно с какой конкретно фабрикой работать,
//потому что клиенты работают с продуктами через интерфейс
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
