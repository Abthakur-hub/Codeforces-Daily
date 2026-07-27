import java.util.*;

public class AMahmoudAndEhabAndTheEvenOddGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if(n%2==0){
            System.out.println("Mahmoud");
        }
        else{
            System.out.println("Ehab");
        }
    }
}