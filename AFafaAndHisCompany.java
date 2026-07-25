import java.util.Scanner;

public class AFafaAndHisCompany{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for(int i=1; i*i<=n; i++){
            if(n % i == 0){
                if(i != n)count++;

                int other = n / i;
                if(other != i && other != n) count++;
            }
        }

        System.out.println(count);
    }
}