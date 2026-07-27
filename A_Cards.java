import java.util.*;

public class A_Cards{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = sc.next();
        int n = 0,z = 0;
        for(char ch : s.toCharArray()){
            if(ch=='n') n++;
            else if(ch=='z') z++;
        }
        StringBuilder sb  = new StringBuilder();
        while(n>0 || z>0){
            if(n>0) {
                sb.append('1');
                n--;
            }
            else if(z>0){
                sb.append('0');
                z--;
            }
            else{
                break;
            }
            sb.append(" ");
        }
        System.out.println(sb);
    }

}