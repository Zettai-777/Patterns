package patterns.generated_patterns.singletones;

/**
 * Enum Singleton. Из коробки потокобезопасен, сериализуем, может быть в switch-statement,
 * может быть использован в EnumSet и EnumMap, но инициализация не ленивая.
 */

public enum  EnumSingleton {
    ENUM_SINGLETON;
}
