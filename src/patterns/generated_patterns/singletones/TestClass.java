package patterns.generated_patterns.singletones;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestClass {
    public static void main(String[] args) {
//        createSingleton();
        DumbSingleton dumbSingleton1 = DumbSingleton.getINSTANCE();
        DumbSingleton dumbSingleton2 = DumbSingleton.getINSTANCE();
        printMethod(dumbSingleton1, dumbSingleton2);

        SimpleLazySingleton simpleLazySingleton1 = SimpleLazySingleton.getINSTANCE();
        SimpleLazySingleton simpleLazySingleton2 = SimpleLazySingleton.getINSTANCE();
        printMethod(simpleLazySingleton1, simpleLazySingleton2);

        NotLazySingleton notLazySingleton1 = NotLazySingleton.getINSTANCE();
        NotLazySingleton notLazySingleton2 = NotLazySingleton.getINSTANCE();
        printMethod(notLazySingleton1, notLazySingleton2);
    }

    public static <T> void printMethod(T object1, T object2){
        if(object1 == object2){
            System.out.println("Один и тот же экземпляр класса " + object1.getClass().getSimpleName());
        }else {
            System.out.println("simpleSingleton1: " + object1);
            System.out.println("simpleSingleton2: " + object2);
        }
        System.out.println("==========================================");
    }

    public static  void createSingleton() {
        ExecutorService service = Executors.newFixedThreadPool(2);
        try{
            DumbSingleton dumbSingleton1 = service.submit(DumbSingleton::getINSTANCE).get();
            DumbSingleton dumbSingleton2 = service.submit(DumbSingleton::getINSTANCE).get();
            printMethod(dumbSingleton1, dumbSingleton2);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
