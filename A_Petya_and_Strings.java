import java.util.*;

public class A_Petya_and_Strings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next().toLowerCase();
        String b = sc.next().toLowerCase();
        int s = 0;
        for(int i=0; i<a.length(); i++){
            char ch1 = a.charAt(i);
            char ch2 = b.charAt(i);
            if(ch1<ch2){
                s = -1;
                break;
            }
            else if(ch1>ch2){
                s = 1;
                break;
            }
        }
        System.out.println(s);

    }
}