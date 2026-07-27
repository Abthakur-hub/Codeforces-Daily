import java.util.*;

public class A_Wrong_Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        while(k>=1){
            if((num%10)==0){
                num=num/10;
            }
            else{
                num=num-1;
            }
            k--;
        }
        System.out.println(num);
    }
}
