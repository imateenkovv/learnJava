package JavaCore.String;

/**
 * @author mateenkov
 */

public class Strings {


    public static void main(String[] args) {

        String str = "Hello";
        System.out.println(str);
        System.out.println(str.charAt(2));// Возвращает по индексу символ из строки
        /* contact - обеденяет строки
        * valueOf - преобразует объект в строковый вид
        * compareTo - сравнивает две строки
        * getChars - возвращает группу символов
        * equals - сравнивает строки с учетом регистра
        * startWith endWith - определяет, начинает/заканчивается строка со слов или символов
        * trim - удалаяет начальные и конечные пробелы
        * toLower toUppercase - приводит строку в нижний или верхний регситр    */

        char[] arr = str.toCharArray();
        System.out.println(arr);

        String stringChar = String.valueOf(arr);
        System.out.println(stringChar);

    }

}
