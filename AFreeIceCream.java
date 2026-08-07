import java.util.Scanner;

public class AFreeIceCream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Long b = sc.nextLong();
        
        int d = 0;
        while(a-->0){
            String ch = sc.next();
            long c = sc.nextLong();

            if(ch.charAt(0)=='+') b+=c;
            else {
                if(b>=c) b=b-c;
                else d++;
            }
        }
        System.out.println(b+" "+d);
    }
}
