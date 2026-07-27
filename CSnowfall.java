import java.util.*;

public class CSnowfall {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            ArrayList<Integer> six = new ArrayList<>();
            ArrayList<Integer> two = new ArrayList<>();
            ArrayList<Integer> three = new ArrayList<>();
            ArrayList<Integer> other = new ArrayList<>();

            for (int i = 0; i < n; i++) {

                int x = sc.nextInt();

                if (x % 6 == 0) {
                    six.add(x);
                }
                else if (x % 2 == 0) {
                    two.add(x);
                }
                else if (x % 3 == 0) {
                    three.add(x);
                }
                else {
                    other.add(x);
                }
            }

            for (int x : six) System.out.print(x + " ");
            for (int x : two) System.out.print(x + " ");
            for (int x : other) System.out.print(x + " ");
            for (int x : three) System.out.print(x + " ");

            System.out.println();
        }
    }
}