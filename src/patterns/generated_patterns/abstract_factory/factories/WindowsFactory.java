package patterns.generated_patterns.abstract_factory.factories;

import com.javarush.task.task37.patterns.generated_patterns.abstract_factory.buttons.Button;
import com.javarush.task.task37.patterns.generated_patterns.abstract_factory.buttons.WindowsButton;
import com.javarush.task.task37.patterns.generated_patterns.abstract_factory.chekboxes.Checkbox;
import com.javarush.task.task37.patterns.generated_patterns.abstract_factory.chekboxes.WindowsCheckbox;

//Конкретная реализация фабрики, которая создаёт разные варианты функционала,
// но только строго определённого типа (Windows)
public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
