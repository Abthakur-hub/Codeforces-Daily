import java.util.*;

public class CWordGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- > 0) {

            int a = sc.nextInt();

            String[][] arr = new String[3][a];

            HashMap<String, Integer> map = new HashMap<>();

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < a; j++) {

                    arr[i][j] = sc.next();

                    map.put(arr[i][j],
                            map.getOrDefault(arr[i][j], 0) + 1);
                }
            }

            int[] score = new int[3];

            for (int i = 0; i < 3; i++) {

                for (int j = 0; j < a; j++) {

                    int freq = map.get(arr[i][j]);

                    if (freq == 1)
                        score[i] += 3;

                    else if (freq == 2)
                        score[i] += 1;
                }
            }

            System.out.println(score[0] + " "
                             + score[1] + " "
                             + score[2]);
        }
    }
}