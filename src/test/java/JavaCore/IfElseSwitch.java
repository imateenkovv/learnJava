package JavaCore;

import java.util.Scanner;

/**
 * @author mateenkov
 */

public class IfElseSwitch {
    public static void main(String[] args) {
        week();
    }

    static String isEvan(int i) {
        boolean isEvan = (i % 2) == 0;
        if (isEvan) {
            return "Четное число";
        } else {
            return "НЕ четное число";
        }
    }

    static void week() {
        Scanner scan = new Scanner(System.in); // Класс сканер служит для чтения данных
        int dayNumber = scan.nextInt(); // В этой строке благодаря сканеру, мы можем вводить в консоли при выполнении кода руками день недели
        switch (dayNumber) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Такого дня недели не существует");
        }
    }
}
