import java.util.*;

public class B_Queue_at_the_School {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int t = sc.nextInt();
        char[] arr = sc.next().toCharArray();

        while (t-- > 0) {
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] == 'B' && arr[i + 1] == 'G') {
                    
                    char temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    i++; 
                }
            }
        }

        System.out.println(new String(arr));
    }
}