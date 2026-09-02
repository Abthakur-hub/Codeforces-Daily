import java.util.Scanner;

public class AStoneGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while(n-- > 0){
            int a = sc.nextInt();
            int[] arr = new int[a];

            for(int i = 0; i < a; i++)
                arr[i] = sc.nextInt();

            int b = 0;
            int c = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for(int i = 0; i < a; i++){
                if(arr[i] > max){
                    max = arr[i];
                    b = i;
                }

                if(arr[i] < min){
                    min = arr[i];
                    c = i;
                }
            }

            int l = Math.max(b, c) + 1;
            int r = a - Math.min(b, c);

            int lr = 0;

            if(b > c){
                lr = c + 1 + a - b;
            }
            else{
                lr = b + 1 + a - c;
            }

            int result = Math.min(l, Math.min(r, lr));

            System.out.println(result);
        }
    }
}