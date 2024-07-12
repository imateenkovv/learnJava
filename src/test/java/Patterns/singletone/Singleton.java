package Patterns.singletone;

/**
 * @author mateenkov
 */

public class Singleton {

    /* Создается когда необходимо обращаться к одному и тому же классу без множественного сздания его экземпляров
     *
     * То есть один класс и один экземпляр , для всех точек использования */

    private static Singleton instance; /* Инстанс класса  */

    private Singleton() {} /* Пустой ПРИВАТНЫЙ конструктор */

    /* Логика которая если инстанс создан юто возвращает его */
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
