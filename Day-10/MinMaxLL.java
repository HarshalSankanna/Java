import java.util.Scanner;

public class MinMaxLL {
    Scanner sc = new Scanner(System.in);
    int min = 0, max = 0;

    class Node {
        int data;
        Node next;

        public Node() {
            next = null;
        }
    }

    Node head = null;

    public void append() {
        System.out.println("Enter the data to be inserted: ");
        int element = sc.nextInt();
        Node newNode = new Node();
        newNode.data = element;

        if (newNode == null) {
            System.out.println("Memory is not present.");
        } else if (head == null) {
            head = newNode;
        } else {
            Node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = newNode;
        }
    }

    public void addAtBegin() {
        System.out.println("Enter the data to be inserted: ");
        int element = sc.nextInt();
        Node newNode = new Node();
        newNode.data = element;

        if (newNode == null) {
            System.out.println("Memory is not present.");
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addAfter() {
        System.out.println("Enter the data to be inserted: ");
        int element = sc.nextInt();

        System.out.println("Enter the element after which the new node is to be inserted: ");
        int afterThis = sc.nextInt();

        Node newNode = new Node();
        newNode.data = element;

        if (newNode == null) {
            System.out.println("Memory is not present.");
        } else {
            Node ptr = head;
            while (ptr.data != afterThis) {
                ptr = ptr.next;
            }
            newNode.next = ptr.next;
            ptr.next = newNode;

        }
    }

    public void deleteAtEnd() {
        Node ptr = head;
        while (ptr.next.next != null) {
            ptr = ptr.next;
        }
        ptr.next = null;
        System.out.println("Last element deleted successfully.");
    }

    public void deleteAfter() {
        System.out.println("Enter the element after which the node is to be deleted: ");
        int afterThis = sc.nextInt();

        Node ptr = head;
        while (ptr.data != afterThis) {
            ptr = ptr.next;
        }
        ptr.next = ptr.next.next;
        System.out.println("Element deleted successfully.");
    }

    public void deleteAtBegin() {
        head = head.next;
        System.out.println("Element deleted successfully.");
    }

    public void traverse() {
        Node ptr = head;
        System.out.println("The linked list is as follows: ");
        while (ptr != null) {
            System.out.print(ptr.data + "-->");
            ptr = ptr.next;
        }
        System.out.print("X");
        System.out.println();
    }

    public void findMinMax() {
        Node ptr = head;
        min = ptr.data;
        System.out.println("The linked list is as follows: ");
        while (ptr != null) {
            if (ptr.data < min) {
                min = ptr.data;
            }
            if (ptr.data > max) {
                max = ptr.data;
            }
            ptr = ptr.next;
        }
        System.out.println("Min is: " + min);
        System.out.println("Max is: " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MinMaxLL ll = new MinMaxLL();

        for (int i = 0; i < 5; i++) {
            ll.append();
        }
        ll.findMinMax();
    }
}