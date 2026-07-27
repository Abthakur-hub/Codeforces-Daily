import java.util.Scanner;

public class AWalkingMaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if(b>d){
                System.out.println(-1);
                continue;
            }
            int count = d - b;
            a+=count;
            if(a<c){
                System.out.println(-1);
                continue;
            }
            else{
                count+= a-c;
                System.out.println(count);
            }
        }
    }
}
