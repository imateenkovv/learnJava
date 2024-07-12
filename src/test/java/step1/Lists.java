package step1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mateenkov
 */

public class Lists {

        public static void main(String[] args) {

        /*
        Создание и инициализация списка
         */

        List<Integer> list = new ArrayList<>();

        // Добавление элементов в список
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(list);


        /*
        Доступ к элементам списка
         */
        int element = list.get(1); // Получение значения второго элемента

        System.out.println(list.get(3));



        /*
        Изменение значений в списке
        */

        list.set(1, 10); // Установка нового значения для второго элемента

        System.out.println(list);

        int size = list.size(); // Возвращает количество элементов в списке

        System.out.println(list.size());


        //Итерация по списку
        for (int value : list){
            System.out.println(value);
        }


        list.remove(1); // Удаление элемента по индексу
        System.out.println(list);
    }

}
