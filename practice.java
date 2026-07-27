import java.util.Scanner;
import java.util.Stack;

public class practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        int ele = 50;
        pushtobottom(st,ele);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }

    public static void reverse(Stack<Integer> s){
        if(s.size()<=1) return;
        int top = s.pop();
        reverse(s);
        pushtobottom(s, top);
    }
    public static void pushtobottom(Stack<Integer> st , int a){
        if(st.size() == 0){
            st.push(a);
            return;
        }
        int b = st.pop();
        pushtobottom(st , a);
        st.push(b);
    }
}
