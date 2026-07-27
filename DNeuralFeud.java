import java.util.*;

public class DNeuralFeud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());

        String[] ans = {
            "",
            "walk",
            "no",
            "no",
            "no",
            "yes",
            "yes",
            "backwards",
            "seven"
        };

        System.out.println(ans[n]);
    }
}