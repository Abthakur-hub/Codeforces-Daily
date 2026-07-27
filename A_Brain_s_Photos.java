import java.util.*;

public class A_Brain_s_Photos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = 0;
        String[][] ch = new String[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                ch[i][j]=sc.next();
                if(ch[i][j].equals("C" ) || ch[i][j].equals("M") || ch[i][j].equals("Y")) {
                    a=1;
                    break;
                }
            }
        }
        if(a==0)System.out.println("#Black&White");
        else System.out.println("#Color");
    }
}