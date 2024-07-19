package Customs;


class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}
class Linkedlist{

    Node head,tail;

    void addInFront(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        tail = newNode;

    }

    void deleteInFront(){
        if(head==null){
            System.out.println("Nothing to Delete");
            return;
        }
        head = head.next;
    }

    void deleteLast(){
        if(head==null){
            System.out.println("Nothing to Delete");
            return;
        }
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }

        temp.next =null; 
    }

    void deletePosition(int pos){
        if(head==null || pos==0){
            System.out.println("Nothing to Delete");
            return;
        }
        Node temp = head;
        int count = 1;
        while(count<pos-1){
            count++;
            temp= temp.next; 
        }
        temp.next = temp.next.next;


    }

    void addInLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            addInFront(data);
            //head = newNode;return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode; 
        

    }

    void addInPos(int pos,int data){
        Node newNode = new Node(data);
        if(pos==1){
            newNode.next = head;
            head = newNode;
            tail = newNode;
        }
        Node temp = head;
        int count = 1;
        while(count<pos-1){
            count++;
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    // void addInTail(int data){
    //     Node newNode = new Node(data);
    //     if(head == null){
    //         head = newNode;
    //         tail = newNode;
    //     }

    //     tail.next = newNode;
    //     tail = newNode;
    // }

    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();

    }

    

}


public class singlyLinkedList {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        // ll.head=new Node(1);
        // ll.head.next = new Node(2);
        // ll.head.next.next = new Node(3);
        // ll.head.next.next.next = new Node(4);
        for(int i=10;i>=0;i--){
            ll.addInFront(i);
        }
        // ll.addInFront(0);
        // ll.addInFront(1);
        // ll.addInLast(2);
        // ll.addInPos(2, 5);
        // ll.addInFront(0);

        //
        ll.display();
        ll.deleteInFront();
        ll.deleteLast();
        ll.deletePosition(5);

        ll.display();
    }
    
    
}
