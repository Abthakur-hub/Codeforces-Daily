import java.util.*;

public class AConstructAnArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0) {
            int a = sc.nextInt();
            for (int i=a-1; i>=0; i--) {
                int b = 2*i+1;
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}