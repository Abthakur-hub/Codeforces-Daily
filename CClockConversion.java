import java.util.*;

public class CClockConversion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            String s = sc.next();

            int hour = Integer.parseInt(s.substring(0, 2));
            String minute = s.substring(3, 5);

            String period;

            if (hour == 0) {
                hour = 12;
                period = "AM";
            }
            else if (hour < 12) {
                period = "AM";
            }
            else if (hour == 12) {
                period = "PM";
            }
            else {
                hour -= 12;
                period = "PM";
            }

            System.out.printf("%02d:%s %s\n", hour, minute, period);
        }
    }
}