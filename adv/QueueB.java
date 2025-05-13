import java.util.*;

public class QueueB {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        // empty:
        public static boolean isEmpty() {
            return head == null && tail == null;
        }
        // add
        public static void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        // remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty");
                return -1;
            }
            int front = head.data;
            if (head == tail) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }
        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String args[]) {

    }
}
