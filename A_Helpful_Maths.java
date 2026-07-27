import java.util.*;

public class A_Helpful_Maths{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for(int i=0; i<ch.length-1;i++){
            if(ch[i]!='+')System.out.print(ch[i]+"+");
        }
        System.out.print(ch[ch.length-1]);

    }
}