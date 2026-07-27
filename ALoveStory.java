import java.util.*;

public class ALoveStory{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while(n-->0){
            String a = sc.next();
            String b = "codeforces";

            int count = 0;

            for(int i=0; i<10; i++){
                if(a.charAt(i)!=b.charAt(i)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}