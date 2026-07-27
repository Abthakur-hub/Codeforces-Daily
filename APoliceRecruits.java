import java.util.*;

public class APoliceRecruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int availablePolice = 0;
        int untreated = 0;
        
        for (int i = 0; i < n; i++) {
            int event = sc.nextInt();
            
            if (event == -1) {
                if (availablePolice > 0) {
                    availablePolice--;
                } else {
                    untreated++;
                }
            } else {
                availablePolice += event;
            }
        }
        
        System.out.println(untreated);
    }
}