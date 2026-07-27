import java.io.*;
import java.util.*;

public class A_123_sequence {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        
        int one = 0, two = 0, three = 0;
        
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(input[i]);
            if (a == 1) one++;
            else if (a == 2) two++;
            else three++;
        }
        
        int max = Math.max(one, Math.max(two, three));
        System.out.println(n - max);
    }
}