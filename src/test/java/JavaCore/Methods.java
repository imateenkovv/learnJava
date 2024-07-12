package JavaCore;


/**
 * @author mateenkov
 */

public class Methods {


    public static void main(String[] args) {
        print("Hello");
        System.out.println(prints("World!"));
        System.out.println("Chetnost chisla - " + isEvan(341));
        System.out.println(printInt(777));

    }

    static void print(String str) {
        System.out.println(str);
    }

    static boolean isEvan(int i) {
        return (i % 2) == 0;
    }

    static String prints(String str) {
        return str;
    }

    static int printInt(int i) {
        return i;
    }


}
