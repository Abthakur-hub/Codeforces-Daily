import java.util.*;

public class AMagicNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.replace("144", " ").replace("14", " ").replace("1", " ").replace(" ", "");
        System.out.println(s.length() == 0 ? "YES" : "NO");
    }
}