package Modul2.Praktikum.Kegiatan2;

public class LinkNode {

    Node head = null;
    Node tail = null;

    public void add(int data){

        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }



    public Node sortData(Node head) {
        for (int i = 0; i < length(head); i++) {
            Node curr = head;

            // 6      0      2
            // head          tail

            /*  if head < next
                    head = next
               0      6       2
            */

            for (int j = 0; j < length(head) - i - 1; j++) {
                if (curr.data > curr.next.data) {
                    int temp = curr.data;
                    curr.data = curr.next.data;
                    curr.next.data = temp;
                }
                curr = curr.next;
            }
        }

        return head;
    }

    public int length(Node head) {
        int count = 0;
        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    public void showData(Node head){
        Node current = head;

        if (head == null){
            System.out.println("LinkNode is Empty");
            return;
        }

        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

}
