import java.util.*;

public class APlayingWithDice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = 0;
        int y = 0;
        int z = 0;
        for(int i=1; i<=6; i++){
            int d1 = Math.abs(a - i);
            int d2 = Math.abs(b - i);
            if(d1<d2){
                x++;
            } else if(d1==d2){
                y++;
            } else{
                z++;
            }
        }
        System.out.println(x + " " + y + " " + z);
    }
}