import java.util.*;

public class A_Word{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int uppercase = 0;
        int lowercase = 0;
        for(char ch:s.toCharArray()){
            if(ch>=65 && ch<=90) uppercase++;
            else lowercase++;
        }
        if(uppercase<=lowercase) System.out.println(s.toLowerCase());
        else System.out.println(s.toUpperCase());
        
    }
}