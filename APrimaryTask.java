import java.util.*;

public class APrimaryTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            String s = sc.next();
            if(s.startsWith("10") && s.length() >= 3 && s.charAt(2) != '0' && !(s.length() == 3 && s.charAt(2) == '1')) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}