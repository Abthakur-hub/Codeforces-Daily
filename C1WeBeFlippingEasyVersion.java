import java.util.*;

public class C1WeBeFlippingEasyVersion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a-->0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
            }
            ArrayList<Integer> list = new ArrayList<>();
            int f = 0;
            for(int i=n-1;i>=0;i--){
                long c = arr[i];
                if(f%2==1){
                    c = -c;
                }
                if(c>0){
                    list.add(i+1);
                    f ^= 1;
                }
            }
            System.out.println(list.size());
            for(int d:list){
                System.out.print(d+" ");
            }
            System.out.println();
        }
    }
}