
import java.util.Scanner;

class Node {
    int data;
    Node link;

    Node() {
        data = 0;
        link = null;
    }

    void create() {
        // creating linked list
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first data");
        this.data = in.nextInt();
        System.out.println("Enter number of nodes");
        n = in.nextInt();
        Node temp;
        Node ptr = this;
        for (int i = 0; i < n; i++) {
            temp = new Node();
            System.out.println("Enter next data");
            temp.data = in.nextInt();
            temp.link = null;
            ptr.link = temp;
            ptr = ptr.link;
        }
    }

    Node insertBeg(Node start, int x) {
        // inserting the list in the beginning
        Node temp = new Node();
        // Entering the data into the new list
        temp.data = x;
        temp.link = start;
        return temp;
    }

    Node insertMid(Node start, int x, int n) {
        // create temp
        Node temp = new Node();
        temp.data = x;
        Node ptr = start;
        int c = 0;
        while (c < n) {
            ptr = ptr.link;
            c++;
        }
        temp.link = ptr.link;
        ptr.link = temp;
        start = ptr;
        return start;
    }

    void insertEnd(Node start, int x) {
        Node temp = new Node();
        temp.data = x;
        Node ptr = start;
        while (ptr.link != null) {
            ptr = ptr.link;
        }
        ptr.link = temp;
    }

    void delete(Node start, int n) {
        Node ptr = start;
        Node ptr1 = start;
        int c = 0;
        while (c < n) {
            ptr1 = ptr;
            ptr = ptr.link;
            c++;
        }
        ptr1.link = ptr.link;
        ptr.link = null;
    }

    void display() {
        Node ptr = this;
        int counter = 0;
        while (ptr != null) {
            System.out.println(ptr.data);
            if (checkEven(ptr.data)) {
                counter++;
            }
            ptr = ptr.link;
        }
        System.out.println("The number of even nodes are " + counter);
    }

    boolean checkEven(int number) {
        return number % 2 == 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Node node = new Node();
        node.create();
        node = node.insertBeg(node, 253);
        node = node.insertMid(node, 233, 1);
        node.insertEnd(node, 2000);
        // node.delete(node, 2);
        System.out.println("Displaying the data");
        node.display();
    }
}
