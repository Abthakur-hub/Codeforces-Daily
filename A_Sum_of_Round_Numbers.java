import java.util.*;

public class A_Sum_of_Round_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {

            int a = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; a > 0; i++) {
                int b = a % 10;

                if (b > 0) {
                    list.add(b * (int)Math.pow(10, i));
                }

                a = a / 10;
            }

            System.out.println(list.size());
            for (int ch : list) System.out.print(ch + " ");
            System.out.println();
        }
    }
}