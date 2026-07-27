import java.util.*;

public class B_Equal_Candies{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int a = sc.nextInt();
            int min = Integer.MAX_VALUE;
            int[] arr = new int[a];
            for(int i=0; i<a; i++){
                arr[i]=sc.nextInt();
                if(arr[i]<min){
                    min=arr[i];
                }
            }
            int sum = 0;
            for(int i=0; i<a; i++){
                sum=sum + (arr[i]-min);
            }
            System.out.println(sum);
           
        }
    }
}