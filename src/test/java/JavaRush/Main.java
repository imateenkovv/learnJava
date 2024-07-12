package JavaRush;

/**
 * @author mateenkov
 */

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i <= 50; i++) {
            if(i % 15 == 0){
                System.out.println("Кратное 15");
            }else if (i % 2 == 0) {
                System.out.println("Четное число");
            }
            else {
                System.out.println(i);
            }
        }


    }

}
