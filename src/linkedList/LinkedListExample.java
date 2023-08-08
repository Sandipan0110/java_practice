package linkedList;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListExample {
    Node head;

    public static void main(String[] args) {

        LinkedListExample list = new LinkedListExample();
        list.head = new Node(1);
        Node first = new Node(2);
        Node second = new Node(3);

        list.head.next = first;
        first.next = second;
        second.next = null;

        System.out.println(list);
    }
}
