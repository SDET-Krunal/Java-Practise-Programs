package DSA_Practise.Stack;

import java.util.Stack;

public class Reverse_stack {

    public static void reverse_stack(Stack<Integer> st) {
        if (st.empty()) {
            return;
        }

        int top = st.pop();
        reverse_stack(st);
        Insert_at_bottom_in_stack.insert_at_bottom(top, st);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        reverse_stack(st);

        System.out.println("Stack after reverse it ::");
        Stack_Demo.print_stack(st);
    }
}
