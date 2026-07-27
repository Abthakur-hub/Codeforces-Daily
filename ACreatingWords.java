import java.util.*;

public class ACreatingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            String a = sc.next();
            String b = sc.next();

            char[] arr1 = a.toCharArray();
            char[] arr2 = b.toCharArray();

            char temp = arr1[0];
            arr1[0] = arr2[0];
            arr2[0] = temp;

            System.out.println(new String(arr1) + " " + new String(arr2));
        }
    }
}