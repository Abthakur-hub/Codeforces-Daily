import java.util.Scanner;

public class ABigrams{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int k = sc.nextInt();

            boolean flag = false;
            int two = 0;

            for(int i=0; i<k; i++){
                int x = sc.nextInt();

                if(x >= 3){
                    flag = true;
                }

                if(x >= 2){
                    two++;
                }
            }

            if(flag || two >= 2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}