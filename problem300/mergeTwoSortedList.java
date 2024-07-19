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
    void add1(int x){
        if(head1==null){
            Node newNode = new Node(x);
            head1 = tail1 = newNode;
            size1+=1;
        }
        else{
            Node newNode = new Node(x);
            tail1.next = newNode;
            tail1 = newNode;
            size1+=1;
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

    Node merge(Node n1 ,Node n2){
        Node ans = new Node(0);
        Node newList = ans;
        while(n1 !=null && n2 !=null){
            if(n1.data <= n2.data){
                newList.next = n1;
                n1 = n1.next;
            }
            else{
                newList.next = n2;
                n2 = n2.next;
            }
            newList = newList.next;
        }

        while(n1!=null){
            newList.next = n1;
            n1 = n1.next;
        }
        while(n2!=null){
            newList.next = n2;
            n2 = n2.next;
        }


        return ans.next;
    }
}

public class mergeTwoSortedList {
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.add(0);
        ll.add1(1);
        ll.add(2);
        ll.add1(3);
        ll.add(4);
        ll.add1(5);
        ll.add(6);
        ll.traverse(ll.head);
        ll.traverse(ll.head1);
        ll.traverse(ll.merge(ll.head, ll.head1));
        
    }
    
}
