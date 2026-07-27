import java.util.*;

public class A_Amusing_Joke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        String d = a + b;  

        char[] ch = d.toCharArray();
        char[] ch1 = c.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);

        String s = new String(ch);     
        String s1 = new String(ch1);   

        if (s.equals(s1)) System.out.println("YES");
        else System.out.println("NO");
    }
}