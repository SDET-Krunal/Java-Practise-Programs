package DSA_Practise.Stack;

import java.util.Stack;

public class Insert_at_bottom_in_stack {
    public static void insert_at_bottom(int data, Stack<Integer> st) {
        if (st.empty()) {
            st.push(data);
            return;
        }

        int top = st.pop();
        insert_at_bottom(data, st);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        insert_at_bottom(1, st);

        System.out.println("Stack after inserting element at bottom ::");
        Stack_Demo.print_stack(st);
    }
}
