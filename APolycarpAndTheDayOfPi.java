import java.util.Scanner;

public class APolycarpAndTheDayOfPi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while(n-->0){
            String a = sc.next();
            String b = "3141592653589793238462643383279";
            int count = 0;
            int i = 0;
            while( i<a.length() && a.charAt(i)==b.charAt(i) ){
                count++;
                i++;
            }
            System.out.println(count);
        }
    }
}
