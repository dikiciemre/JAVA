package LinkedListAddDeletee;

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

    // Eleman ekleme
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
        System.out.println(data + " değeri linked list'e eklendi.");
    }

    // Eleman silme
    public void sil(int data) {
        if (head == null) {
            System.out.println("Linked list boş, silme işlemi yapılamaz.");
            return;
        }

        if (head.data == data) {
            head = head.next;
            System.out.println(data + " değeri silindi.");
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println(data + " değeri bulunamadı.");
        } else {
            temp.next = temp.next.next;
            System.out.println(data + " değeri silindi.");
        }
    }

    // Linked list'i yazdırma
    public void yazdir() {
        if (head == null) {
            System.out.println("Linked list boş.");
            return;
        }

        Node temp = head;
        System.out.print("Linked List Elemanları: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LinkedListAddDelete {
    public static void main(String[] args) {
        LinkedList liste = new LinkedList();

        liste.ekle(1);
        liste.ekle(2);
        liste.ekle(3);
        liste.ekle(4);

        liste.yazdir();
        System.out.println("Değerler ekrana yazdırıldı.."+"\n");

        liste.sil(3); // 3. elemanı sil
        liste.yazdir();
        System.out.println("Değerler ekrana yazdırıldı.."+"\n");


        liste.ekle(5); // 5'i ekle
        liste.yazdir();
        System.out.println("Değerler ekrana yazdırıldı.."+"\n");

    }
}

