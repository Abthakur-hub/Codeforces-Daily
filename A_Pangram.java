import java.util.*;

public class A_Pangram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] ch = sc.next().toLowerCase().toCharArray();

        ArrayList<Character> list = new ArrayList<>();

        for(int i = 0; i < 26; i++){
            list.add((char)(97 + i));
        }

        for(int i = 0; i < n; i++){
            if(list.contains(ch[i])) {
                list.remove((Character) ch[i]); 
            }
        }

        if(list.size() == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}