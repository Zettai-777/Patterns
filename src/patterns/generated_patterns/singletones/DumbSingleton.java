package patterns.generated_patterns.singletones;

public class DumbSingleton{
    private static DumbSingleton INSTANCE;

    private DumbSingleton(){}

    public static DumbSingleton getINSTANCE() {
        if(INSTANCE == null)
            INSTANCE = new DumbSingleton();
        return INSTANCE;
    }
}
