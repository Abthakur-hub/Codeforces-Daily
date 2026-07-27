import java.util.*;

public class BIcpcBalloons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n-->0){
            int a = sc.nextInt();
            String s = sc.next();
            ArrayList<Character> list = new ArrayList<>();

            int count = 0;
            for(char ch:s.toCharArray()){
                if(!list.contains(ch)){
                    list.add(ch);
                    count+=2;
                }
                else count++;
                
            }
            System.out.println(count);
        }
    }
}