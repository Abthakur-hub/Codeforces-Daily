import java.util.*;

public class A_Hit_the_Lottery{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        
        if(n>=100) {
            int a = n/100;
            n=n-a*100; 
            count+=a;
        }
        if(n>=20) {
            int a = n/20 ; 
            n=n-a*20; 
            count+=a;
        }
        if(n>=10){
            int a = n/10 ; 
            n=n-a*10; 
            count+=a;
        } 
        if(n>=5) {
            int a = n/5 ; 
            n=n-a*5; 
            count+=a;
        }
        if(n>=1) {
            int a = n/1 ; 
            n=n-a*1; 
            count+=a;
        }
        System.out.println(count);


    }
}