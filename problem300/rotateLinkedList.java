package problem300;
class Node{
    int data;
    Node next;

    Node(int n){
        this.data = n;
    }

}

class linkedList{
    Node head,tail,head1,tail1;
    int size=0,size1=0;
    
    void add(int n){
        if(head==null){
            Node newNode = new Node(n);
            head = tail = newNode;
            size+=1;
        }
        else{
            Node newNode = new Node(n);
            tail.next = newNode;
            tail = newNode;
            size+=1;
        }
    }
    void traverse(Node hd){
        if(hd==null){
            System.out.println("There is no element!!");
            return;
        }
        Node temp = hd;
        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public Node rotateRight(Node head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int size = 1;
        Node tail = head;
        while(tail.next!=null){
            tail = tail.next;
            size++;
        }

        tail.next = head;
        k = k%size;
        for(int i=0;i<size-k;i++){
            tail = tail.next;
        }
        head = tail.next;
        tail.next = null;

        return head;
    }
}
public class rotateLinkedList {
    
}
