import java.util.Scanner;

public class ADimaAndFriends{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += sc.nextInt();
        }
        int count = 0;
        for(int i=1; i<=5; i++){
            int position = (sum+i)%(n+1);
            if(position!=1){
                count++;
            }
        }
        System.out.println(count);
    }
}