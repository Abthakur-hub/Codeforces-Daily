import java.util.Scanner;

public class AGennadyAndACardGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        char b = a.charAt(0);
        char c = a.charAt(1);

        boolean d = false;

        for(int i=0; i<5; i++){
            String card = sc.next();
            if(card.charAt(0) == b || card.charAt(1) == c){
                d = true;
            }
        }

        System.out.println(d ? "YES" : "NO");
    }
}