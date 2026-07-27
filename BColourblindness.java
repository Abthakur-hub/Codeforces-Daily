import java.util.*;

public class BColourblindness{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n-->0){
            int a = sc.nextInt();
            char[] ch1 = sc.next().toCharArray();
            char[] ch2 = sc.next().toCharArray();

            Boolean flag = true;

            for(int i=0; i<a; i++){
                if(ch1[i]!=ch2[i]){
                    if(ch1[i]=='B' && ch2[i]=='G' || ch1[i]=='G' && ch2[i]=='B') flag = true;
                    else {
                        flag = false;
                        break;
                        
                    }
                }
            }
            System.out.println(flag?"YES":"NO");
        }
    }
}