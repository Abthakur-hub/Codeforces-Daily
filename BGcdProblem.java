import java.util.Scanner;

public class BGcdProblem {

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int i = 2;
            while(gcd(n - i - 1, i) != 1){
                i++;
            }
            System.out.println((n - i - 1) + " " + i + " 1");
        }
    }
}