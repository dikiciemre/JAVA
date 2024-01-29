package LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void ekle(int data) {
        Node yeniDugum = new Node(data);

        if (head == null) {
            head = yeniDugum;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = yeniDugum;
        }
    }

    public void yazdir() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LinkedListOrnegi {
    public static void main(String[] args) {
        LinkedList liste = new LinkedList();

        liste.ekle(1);
        liste.ekle(2);
        liste.ekle(3);
        liste.ekle(4);

        System.out.println("Linked List Elemanları:");
        liste.yazdir();
    }
}
