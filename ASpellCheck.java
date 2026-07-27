import java.util.*;

public class ASpellCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        while(n-->0){
            int a = sc.nextInt();
            char[] b = sc.next().toCharArray();
            String c = "Timur";
            
            char[] ch = c.toCharArray();
            Arrays.sort(b);
            Arrays.sort(ch);

            Boolean flag = true;
            if(a==5){
                for(int i=0; i<5; i++){
                    if(ch[i]!=b[i]) flag = false;
                }
            }
            else flag = false;

            System.out.println(flag?"YES":"NO");
        }
    }
}