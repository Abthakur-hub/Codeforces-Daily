import java.util.*;

public class ATrippiTroppi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n-->0){
            String a = sc.next();
            String b = sc.next();
            String c = sc.next();

            StringBuilder sb = new StringBuilder();

            sb.append(a.charAt(0));
            sb.append(b.charAt(0));
            sb.append(c.charAt(0));
            System.out.println(sb);

        }
    }
}