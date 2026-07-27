import java.util.*;

public class D1DEraser{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            String s = sc.next();
            int count = 0;

            for(int i=0; i<a; i++){
                if(s.charAt(i)=='B') {
                    i+=b-1;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}