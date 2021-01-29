package patterns.generated_patterns.singletones;

/**
 * Держатель по требованию. Ленивая инициализация объекта при первом вызове метода getInstance().
 * Проблема синхронизации перенесена на уровень загрузчика класса. Но при нескольких загрузчиках
 * класса или в распределённой системе с несколькими JVM могут возникнуть проблемы.
 */

public class OnDemandHolderSingleton {

    public static class SingletonHolder {
        public static final OnDemandHolderSingleton INSTANCE =
                new OnDemandHolderSingleton();
    }

    public static OnDemandHolderSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
