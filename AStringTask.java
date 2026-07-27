import java.util.*;

public class AStringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s=s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='y'){
                sb.append("");
            }
            else{
                sb.append(".");
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}