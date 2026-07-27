import java.util.*;

public class A_Word_Capitalization{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = s.toUpperCase();
        StringBuilder sb = new StringBuilder();
        char[] ch = s1.toCharArray();
        sb=sb.append(ch[0]);
        for(int i=1; i<s.length();i++){
            char c = s.charAt(i);
            sb.append(c);
        }
        System.out.println(sb);
    }
}