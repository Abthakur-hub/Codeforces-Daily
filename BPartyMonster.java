import java.util.Scanner;

public class BPartyMonster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n-->0){
            int a = sc.nextInt();
            String s = sc.next();

            int left = 0, right = 0;

            for(char ch : s.toCharArray()){
                if(ch=='(') left++;
                else right++;
            }
            if(right==left) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
