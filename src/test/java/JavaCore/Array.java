package JavaCore;


import java.util.Arrays;
import java.util.Random;

/**
 * @author mateenkov
 */

public class Array {

    /* Есть одномерный массив и многомерный  */

    static Random random = new Random();

    /* Класс Random это утилита java для рандомизации. В данном случае для установки
     значения для элементов массива */

    public static void main(String[] args) {

    }


    /* Метод задает значения для элементов массива */
    static void setValueArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(array));
    }

    /* Метод прибавляет к значениям эелементов массива по 100 */
    static void set100ValueElementArrays() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] += 100;
        }
        System.out.println(Arrays.toString(array));
    }

    /*Функция сортировки значений элементов массива от > к < */
    static void sortArraysValue() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    /* Сложение знеачений всех элементов массива  */
    static void sumValueElementArrays() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5);
        }

        System.out.println(Arrays.toString(array));

        int sum = 0;
        for (int element : array) {
            sum += element;
        }

        System.out.println(sum);
    }


}
