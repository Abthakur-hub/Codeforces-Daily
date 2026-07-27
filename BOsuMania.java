import java.util.*;

public class BOsuMania {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<n; i++){
                String s = sc.next();
                for(int j=0; j<s.length(); j++){
                    if(s.charAt(j)=='#') {
                        list.add(j+1);
                        break;
                    }
                }
            }
            Collections.reverse(list);
            for(int i=0; i<n; i++){
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
        }
    }
}