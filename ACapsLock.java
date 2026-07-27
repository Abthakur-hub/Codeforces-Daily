import java.util.*;

public class ACapsLock{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean flag = true;
        for (int i = 1; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i)))
                flag = false;
        }
        
        if (flag) {
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                sb.append(Character.isLowerCase(c)? Character.toUpperCase(c): Character.toLowerCase(c));
            }
            s = sb.toString();
        }
        System.out.println(s);
    }
}