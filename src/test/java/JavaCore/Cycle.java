package JavaCore;

/**
 * @author mateenkov
 */

public class Cycle {
    public static void main(String[] args) {

    }



    static void cycleForWithReturn() {
        for (int i = 0; i <= 10; i++) {
            if (i == 7) {
                return;
                /* Ключевое слово return позволяет немедленно закончить цикл и выйти из него */
            }
            System.out.println("Count: " + i);
        }
    }

    static void cycleFor() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Count: " + i);
        }
    }

    static void cycleForWithIf() {
        for (int i = 0; i <= 10; i++) {
            if (i == 9) {
                continue;
                /* Благодаря условию и слову continue мы пропустили итерацию с девяткой 9 */
            }
            System.out.println("Count: " + i);
        }
    }

    static void cycleWhile() {
        int i = 0;
        while (i <= 10) {
            System.out.println("Count: " + i);
            i++;
        }
    }

    static void cycleDoWhile() {
        int i = 0;
        do {
            System.out.println("Count: " + i);
            i++;
        } while (i <= 10);
    }

}
