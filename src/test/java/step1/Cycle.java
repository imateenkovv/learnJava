package step1;

/**
 * @author mateenkov
 */

public class Cycle {

    /*
    Циклы- есть следующие - for,while ,do while.
     */


    public static void main(String[] args) {

        // Как читать - пока i = 0 и i меньше 5, то прибавлять к i один.
        //Пока Х в этом состоянии , и {условие}, то делать это

        for (int i = 0; i < 5; i++) {
            System.out.println("Итерация " + i);
        }

        /*
        Как чиитать - А равно 0,
        пока А меньше 5, то выводить в консоль сообщение,
         прибавлять к А один
         */

        int a = 0;
        while (a < 5) {
            System.out.println("Итерация " + a);
            a++;
        }

        /*
         Как читать - i равен 0,
         вывести сообщение с i,
         прибавить к i один,
         проверить i больше 5 или нет,
         если нет, повторить снова
         */

        int i = 0;
        do {
            System.out.println("Итерация: " + i);
            i++;
        } while (i < 5);


    }
}
