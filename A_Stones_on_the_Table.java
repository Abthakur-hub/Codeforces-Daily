import java.util.*;

public class A_Stones_on_the_Table{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] ch = sc.next().toCharArray();
        int count = 0;
        for(int i=1; i<ch.length; i++){
            if(ch[i]==ch[i-1]) count++;
        }
        System.out.println(count);
    }
}