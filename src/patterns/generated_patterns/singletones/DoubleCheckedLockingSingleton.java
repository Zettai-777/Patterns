package patterns.generated_patterns.singletones;

/**
 *  Синглтон с двойной проверкой блокировки.
 */
public class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton INSTANCE = null;

    private DoubleCheckedLockingSingleton(){}

    public static synchronized DoubleCheckedLockingSingleton getINSTANCE() {
        if(INSTANCE == null){
            synchronized (DoubleCheckedLockingSingleton.class){
                if(INSTANCE == null)
                    INSTANCE = new DoubleCheckedLockingSingleton();
            }
        }
        return INSTANCE;
    }
}
