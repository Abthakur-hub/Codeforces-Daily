import java.util.*;

public class AArpaSHardExamAndMehrdadSNaiveCheat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n == 0){
            System.out.println(1);
            return;
        }
        int[] cycle = {6, 8, 4, 2};
        System.out.println(cycle[(int)(n % 4)]);
    }
}