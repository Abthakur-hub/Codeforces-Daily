import java.util.*;

public class A_My_First_Sorting_Problem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int max = Math.max(x, y);
            int min = Math.min(x, y);
            System.out.println(min +" "+max);
        }
    }
}