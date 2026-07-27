import java.util.*;

public class AVasyaTheHipster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        
        int differentDays = Math.min(a, b);
        int remaining = Math.abs(a - b);
        int sameDays = remaining / 2;
        
        System.out.println(differentDays + " " + sameDays);
    }
}