import java.util.*;

public class BUpscaling{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- > 0) {

            int a = sc.nextInt();

            int size = 2 * a;

            for (int i = 0; i < size; i++) {

                for (int j = 0; j < size; j++) {

                    if ((i / 2 + j / 2) % 2 == 0) {
                        System.out.print("#");
                    }
                    else {
                        System.out.print(".");
                    }
                }

                System.out.println();
            }
        }
    }
}