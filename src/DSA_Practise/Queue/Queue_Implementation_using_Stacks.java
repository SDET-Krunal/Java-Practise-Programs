package DSA_Practise.Queue;

import java.util.Stack;

public class Queue_Implementation_using_Stacks {
    public static void main(String[] args) {
        Queue<Integer> qi = new Queue<>();

        qi.add(1);
        qi.add(2);
        qi.add(3);
        qi.add(4);
        qi.add(5);

        System.out.println("Integer elements in Queue :: ");
        qi.printQueue();

        System.out.println();
        Queue<String> qs = new Queue<>();

        qs.add("A");
        qs.add("B");
        qs.add("C");
        qs.add("D");

        System.out.println("String elements in Queue :: ");
        qs.printQueue();
    }

    public static class Queue<E> {
        public Stack<E> st1 = new Stack<>();
        public Stack<E> st2 = new Stack<>();

        public void add(E data) {
            while (!st1.empty()) {
                st2.push(st1.pop());
            }

            st1.push(data);

            while (!st2.empty()) {
                st1.push(st2.pop());
            }
        }

        public boolean isEmpty() {
            return st1.empty();
        }

        public <T> Object peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue.");
                return -1;
            }

            return st1.peek();
        }

        public <T> void remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue.");
                return;
            }

            st1.pop();
        }

        public void printQueue() {
            while (!st1.isEmpty()) {
                System.out.println(st1.peek());
                st1.pop();
            }
        }
    }
}
