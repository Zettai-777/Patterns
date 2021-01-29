package patterns.generated_patterns.abstract_factory.factories;

//Абстрактная фабрика, которая знает обо всех абстрактных типах продуктов

import com.javarush.task.task37.patterns.generated_patterns.abstract_factory.buttons.Button;
import com.javarush.task.task37.patterns.generated_patterns.abstract_factory.chekboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
