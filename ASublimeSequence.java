import java.util.*;

public class ASublimeSequence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(b%2==0) System.out.println(0);
            else System.out.println(a);
        }
    }
}