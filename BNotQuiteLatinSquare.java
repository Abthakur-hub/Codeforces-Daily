import java.util.*;

public class BNotQuiteLatinSquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            for (int i = 0; i < 3; i++) {
                String s = sc.next();

                if (s.indexOf('?') != -1) {
                    boolean hasA = s.indexOf('A') != -1;
                    boolean hasB = s.indexOf('B') != -1;
                    boolean hasC = s.indexOf('C') != -1;

                    if (!hasA) {
                        System.out.println("A");
                    } else if (!hasB) {
                        System.out.println("B");
                    } else {
                        System.out.println("C");
                    }
                }
            }
        }
    }
}