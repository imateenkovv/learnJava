package JavaCore.finalAndStatic;

import JavaCore.Constructors.Car;

/**
 * @author mateenkov
 */

public class FinalAndStatic {

    /* final - изменить нелья
     *
     * static - значение переменной или метода,
     * будет единый для всех экземпляров класса. Не создается дубликат для других экземпляров класса.
     * В памяти уже будет храитьсяЫ
     * */

    public static void main(String[] args) {
        Car bmw = new Car("BMW", "Black");
        Car volvo = new Car("volvo", "Black");
        Car reno = new Car("reno", "Black");
        Car.start(); // Так как метод статичен и един для всех экземпляров, его можно вызвать без объявления конструктора
        // и без инициализации

        reno.start();
        volvo.start();
        bmw.start();

        // У каждого из этих экземпляров машин будето единый метод старт
    }

}
