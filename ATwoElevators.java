import java.util.Scanner;

public class ATwoElevators {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while(n-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int d = Math.abs(b-c) + c -1;
            int e = a-1;
            if(e<d){
                System.out.println("1");
            }
            else if(d<e){
                System.out.println("2");
            }
            else System.out.println("3");
        }
    }
}