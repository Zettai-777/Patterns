package patterns.generated_patterns.singletones;

/**
 * Простая реализация паттерна Singleton. Приватный конструктор, чтобы убрать возможность
 * создания экземпляров класса. GetInstance синхронизирован, чтобы убрать возможность создания
 * нескольких экземпляров SimpleSingleton в разных потоках.
 */

public class SimpleLazySingleton {
    private static SimpleLazySingleton INSTANCE = null;

    private SimpleLazySingleton() {
    }

    public static synchronized SimpleLazySingleton getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new SimpleLazySingleton();
        }
        return INSTANCE;
    }
}
