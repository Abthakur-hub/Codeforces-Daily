import java.util.*;

public class A_Fox_And_Snake{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i%2==0){
                    System.out.print("#");
                }
                else{
                    if(i%4==3){
                        System.out.print(j==0?"#":".");
                    }
                    else{
                        System.out.print(j<m-1?".":"#");
                    }
                    
                }
            }
            System.out.println();
        }
    }
}