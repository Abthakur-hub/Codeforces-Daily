import java.util.*;

public class CLuckyNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((1L<<(n + 1))-2);
    }
}