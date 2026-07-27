import java.util.*;

public class ASkibidusAndAmogU{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n-->0){
            String s = sc.next();

            StringBuilder sb = new StringBuilder();
            for(int i=0; i<s.length()-2; i++){
                sb.append(s.charAt(i));
            }
            sb.append("i");
            System.out.println(sb);
        }
    }
}