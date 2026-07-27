import java.util.*;

public class A_In_Search_of_an_Easy_Problem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            if(a==1) flag = false;
        }
        System.out.println(flag==true?"EASY":"HARD");

    }
}