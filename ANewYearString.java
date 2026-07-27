import java.util.*;

public class ANewYearString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            int n = Integer.parseInt(sc.nextLine());
            String s = sc.nextLine();
            int fir = s.indexOf("2026");
            int sec = s.indexOf("2025");
            if (fir!=-1 || sec==-1) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
    }
}