package step1;

/**
 * @author mateenkov
 */

public class Condition {

     /*
    Условие if , else или else if. Работает так- если условие удов. то делаем это, иначе делаем это.
    Или Если условие удов. то делаем так, иначе если условие такое ,то вот так .
     */

    public static void main(String[] args) {

        int i = 1;

        if (i > 0) {
            System.out.println("Число положительное");
        }


        if (i > 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }

}
