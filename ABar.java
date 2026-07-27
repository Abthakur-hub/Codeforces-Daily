import java.util.*;

public class ABar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] drinks = {"ABSINTH", "BEER", "BRANDY", "CHAMPAGNE", "GIN", "RUM", "SAKE", "TEQUILA", "VODKA", "WHISKEY", "WINE"};
        HashSet<String> alcohol = new HashSet<>(Arrays.asList(drinks));
        int n = sc.nextInt();
        int count = 0;
        while(n-->0){
            String s = sc.next();
            if(Character.isDigit(s.charAt(0))){
                int age = Integer.parseInt(s);
                if(age < 18){
                    count++;
                }
            }
            else{
                if(alcohol.contains(s)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}