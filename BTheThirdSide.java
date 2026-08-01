import java.util.ArrayList;
import java.util.Scanner;

public class BTheThirdSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<n; i++){
                list.add(sc.nextInt());
            }
            int i = 0;
            while(list.size()>1){
                if(i>=list.size()-1){
                    i = 0;
                }
                int c = list.get(i);
                int d = list.get(i + 1);
                int e = c + d - 1;

                list.remove(i + 1);
                list.remove(i);

                list.add(e);
            }

            System.out.println(list.get(0));
        }
    }
}