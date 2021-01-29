package patterns.generated_patterns.singletones;

/**
 * Простая версия реализации паттерна Singleton. Экземпляр класса создаётся сразу
 * во время загрузки класса, что лишает возможности ленивой инициализации, но нет
 * необходимости синхронизировать геттер.
 */
public class NotLazySingleton {
    private static final NotLazySingleton INSTANCE = new NotLazySingleton();

    private NotLazySingleton(){}

    public static NotLazySingleton getINSTANCE() {
        return INSTANCE;
    }
}
