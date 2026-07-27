import java.util.*;

public class BNormalProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            String s = sc.next();
            int i = s.length()-1;
            StringBuilder sb = new StringBuilder();

            while(i>=0){
                if(s.charAt(i)=='q')sb.append('p');
                else if(s.charAt(i)=='p')sb.append('q');
                else sb.append(s.charAt(i));
                i--;
            }
            System.out.println(sb); 
        }
    }
}