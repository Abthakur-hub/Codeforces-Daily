import java.util.*;

public class APetyaAndJava{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        if (n.length() < 3 || (n.length() == 3 && n.compareTo("127") <= 0))
            System.out.println("byte");

        else if (n.length() < 5 || (n.length() == 5 && n.compareTo("32767") <= 0))
            System.out.println("short");

        else if (n.length() < 10 || (n.length() == 10 && n.compareTo("2147483647") <= 0))
            System.out.println("int");

        else if (n.length() < 19 || (n.length() == 19 && n.compareTo("9223372036854775807") <= 0))
            System.out.println("long");

        else
            System.out.println("BigInteger");
    }
}