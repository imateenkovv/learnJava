package Tasks;

/**
 * @author mateenkov
 */

public class VK {

    public static void main(String[] args) {
        int i;
        String persik = "Персик ";
        String spotty = "Спотти";
        String privetKV = "Привет KV";

        char[] privetVK = privetKV.toCharArray();

        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(persik + spotty);

            } else if (i % 5 == 0) {
                System.out.println(spotty);
            } else if (i % 3 == 0) {
                System.out.println(persik);
            } else {
                System.out.println(i);
            }

        }
    }

}
