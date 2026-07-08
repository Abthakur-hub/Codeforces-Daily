import java.util.*;

public class BTenWordsOfWisdom{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int maxQuality = -1;
            int answer = 1;

            for(int i=1; i<=n; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();

                if(a <= 10 && b > maxQuality) {
                    maxQuality = b;
                    answer = i;
                }
            }
            System.out.println(answer);
        }
    }
}