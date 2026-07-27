import java.util.*;

public class APolycarpAndCoins{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int a = n / 3;
            int b = n / 3;
            if (n%3==1) {
                a++;
            }
            else if (n%3==2) {
                b++;
            }
            System.out.println(a + " " + b);
        }
    }
}