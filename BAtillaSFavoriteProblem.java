import java.util.*;

public class BAtillaSFavoriteProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while(n-->0){
            int a = sc.nextInt();
            String s = sc.next();
            int max = 0;

            for(int i=0; i<a; i++){
                int c = s.charAt(i)-'a';
                max = Math.max(max, c);
            }
            System.out.println(max+1);
        }
    }
}