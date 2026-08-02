import java.util.Scanner;

public class AMaximumInTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        int[][] mat = new int[t][t];
        int max = Integer.MIN_VALUE;
        if(t<=2) {
            System.out.println(t);
        }
        else {
            for(int i=0; i<t; i++){
                for(int j=0; j<t; j++){
                    if(j==0 || i==0) mat[i][j]=1;
                    else {
                        mat[i][j]=mat[i][j-1]+mat[i-1][j];
                        max = Math.max(max,mat[i][j]);
                    }
                }
            }
            System.out.println(max);
        }
        
    }
}