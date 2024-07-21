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
    public Node middle(Node tempHead){
        Node slow = tempHead;
        Node fast = tempHead;
        //Node temp = tempHead;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next; 
        }

        return slow;
    }
    public boolean isPalindrome(Node head) {
        Node first = head;
        if(head.next==null){
            return true;
        }
        Node mid = middle(head);
        Node rev = reverse(mid);
        
        while(first!=null && rev != null){
            if(first.data != rev.data){
                return false;
            }

            first = first.next;
            rev = rev.next;
        }
        return true; 
    }

}
public class palindrome {
    //fillup
}
