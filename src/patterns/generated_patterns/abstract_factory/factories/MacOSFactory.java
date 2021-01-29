package patterns.generated_patterns.abstract_factory.factories;

import com.javarush.task.task37.patterns.generated_patterns.abstract_factory.buttons.Button;
import com.javarush.task.task37.patterns.generated_patterns.abstract_factory.buttons.MacOSButton;
import com.javarush.task.task37.patterns.generated_patterns.abstract_factory.chekboxes.Checkbox;
import com.javarush.task.task37.patterns.generated_patterns.abstract_factory.chekboxes.MacOSCheckBox;

//Конкретная реализация фабрики, которая создаёт разные варианты функционала,
// но только строго определённого типа (MasOS)
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckBox();
    }
}
