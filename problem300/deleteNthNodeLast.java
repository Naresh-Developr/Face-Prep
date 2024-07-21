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

    public Node removeNthFromEnd(Node head, int n) {                  // Logic  //bruteForce 
        Node temp = head;
        Node t  = head;
        int size=0;
        while(t!=null){
            size++;
            t = t.next;
        }
        int num = size-n-1;

        if(size==n){
            Node newNode = head.next;
            head = null;
            return newNode;
        }
        while(num!=0){
            num--;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}






public class deleteNthNodeLast {
    
}
