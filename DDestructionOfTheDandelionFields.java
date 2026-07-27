import java.util.*;

public class DDestructionOfTheDandelionFields {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            long ans = 0;

            ArrayList<Long> odd = new ArrayList<>();

            for (int i = 0; i < n; i++) {

                long x = sc.nextLong();

                if (x % 2 == 0) {
                    ans += x;
                } else {
                    odd.add(x);
                }
            }

            odd.sort(Collections.reverseOrder());

            if(odd.size()==0) System.out.println(0);
            else{
                if(odd.size()%2==0){
                    for(int i=0; i<odd.size()/2; i++){
                        ans+=odd.get(i);
                    }
                }
                else{
                    for(int i=0; i<=odd.size()/2; i++) ans+=odd.get(i);
                }
                System.out.println(ans);
            }


        }
    }
}