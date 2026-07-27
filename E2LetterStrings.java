import java.util.*;

public class E2LetterStrings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            long a = 0;

            HashMap<String, Integer> m = new HashMap<>();

            for(int i = 0; i < n; i++){
                String s = sc.next();

                for(char j = 'a'; j <= 'k'; j++){
                    if(j == s.charAt(0))
                        continue;

                    String tp = j + s.substring(1);

                    if(m.containsKey(tp))
                        a += m.get(tp);
                }

                for(char j = 'a'; j <= 'k'; j++){
                    if(j == s.charAt(1))
                        continue;

                    String tp = s.charAt(0) + String.valueOf(j);

                    if(m.containsKey(tp))
                        a += m.get(tp);
                }

                m.put(s, m.getOrDefault(s, 0) + 1);
            }

            System.out.println(a);
        }
    }
}