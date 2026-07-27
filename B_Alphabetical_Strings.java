import java.util.*;

public class B_Alphabetical_Strings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n-->0){
            String s = sc.next();
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            int a = 0;
            for(int i=0;i<s.length();i++){
                
                char ch =(char)(97+i);
                sb1.append(ch);
                sb2.insert(0,ch);
                if(s.contains(sb1)) {
                    sb2 = sb1;
                }
                else if(s.contains(sb2)){
                    sb1 = sb2;
                }
                else{
                    a = 1;
                    break;
                }
            }
            System.out.println(a==0?"YES":"NO");
        }
    }
}