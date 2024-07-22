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

    public Node reverse(Node Head){
        Node prev = null;
        //
        Node cur = Head;
        while(cur!=null){
            Node nextNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextNode;
        }
        
        return prev;
    }
    public Node reverseBetween(Node head, int left, int right) {
        if (head == null || head.next == null || left == right) {
            return head;
        }
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
        Node start = prev.next;
        Node end = start;
        for (int i = left; i < right; i++) {
            end = end.next;
        }
        Node tail = end.next;
        end.next = null; 
        prev.next = reverse(start);
        start.next = tail;

        return dummy.next;
    }
}
public class rotateInTheRange {
    public static void main(String[] args) {
        //fill it
    }
}
