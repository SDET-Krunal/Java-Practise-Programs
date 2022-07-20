package DSA_Practise.LinkedList;

public class LinkedList_Demo {

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    public void printLinkedList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedList_Demo lld = new LinkedList_Demo();

        // Add element at First
        lld.addFirst("r");
        lld.addFirst("K");

        System.out.println("After adding element at First");
        lld.printLinkedList();

        // Add element at Last
        lld.addLast("n");
        lld.addLast("a");
        lld.addLast("l");

        System.out.println("After adding element at Last");
        lld.printLinkedList();
    }
}
