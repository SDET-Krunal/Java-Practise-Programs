package DSA_Practise.Stack;

import java.util.Stack;

public class Stack_Demo {
    public static void print_stack(Stack<Integer> st) {
        while (!st.empty()) {
            System.out.println(st.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        // Print stack element
        print_stack(st);
    }
}
