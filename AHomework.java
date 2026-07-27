import java.util.*;

public class AHomework{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0) {
            int n = sc.nextInt();
            String a = sc.next();

            int m = sc.nextInt();
            String b = sc.next();
            String c = sc.next();

            Deque<Character> d = new ArrayDeque<>();

            for(char ch : a.toCharArray()) {
                d.addLast(ch);
            }

            for(int i=0; i<m; i++) {
                if(c.charAt(i) == 'V') {
                    d.addFirst(b.charAt(i));
                } else {
                    d.addLast(b.charAt(i));
                }
            }
            StringBuilder s = new StringBuilder();
            while(!d.isEmpty()) {
                s.append(d.pollFirst());
            }
            System.out.println(s);
        }
    }
}