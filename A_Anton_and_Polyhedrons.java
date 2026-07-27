import java.util.*;

public class A_Anton_and_Polyhedrons{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        for(int i=0; i<n ; i++){
            String s = sc.next();
            if(s.equals("Tetrahedron")) sum+=4;
            if(s.equals("Cube")) sum+=6;
            if(s.equals("Dodecahedron")) sum+=12;
            if(s.equals("Icosahedron")) sum+=20;
            if(s.equals("Octahedron")) sum+=8;
        }
        System.out.println(sum);
    }
}