package JavaCore.Constructors;

/**
 * @author mateenkov
 */

public class Car {

    String model;
    String color;
    int volumeFuel;
    int fuelLevel;
    /* Конструктор с определенными вхожными параметрами.*/
    /* Слово this хранит ссылку на текущий объект класса в котором оно напписано */

    /* Когда мы пишем свой конструктор, то конструктора по умолчанию уже не будет */

    public Car(String model, String color ) {
        this.model = model;
        this.color = color;
    }

    Car(int volumeFuel, int fuelLevel ) {
        this.volumeFuel = volumeFuel;
        this.fuelLevel = fuelLevel;
    }

   public  static void start() { // Статичный метод. Метод не изменяется и един для всех экземпляров класса
        System.out.println("BRRRRR");
    }

}
