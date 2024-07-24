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

    public boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while(slow!=null && fast!=null && fast.next!=null){             //Floyd’s Cycle-Finding Algorithm
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
        
    }
}
public class detectCycle {
    public static void main(String[] args) {
        //
    }
}
