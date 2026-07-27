import java.util.*;

public class AGiftCarpet{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            char[][] a = new char[n][m];

            for(int i=0; i<n; i++)
                a[i] = sc.next().toCharArray();

            String s = "vika";
            int p = 0;

            for(int j=0; j<m && p<4; j++){
                for(int i=0; i<n; i++){
                    if(a[i][j] == s.charAt(p)){
                        p++;
                        break;
                    }
                }
            }

            System.out.println(p == 4 ? "YES" : "NO");
        }
    }
}