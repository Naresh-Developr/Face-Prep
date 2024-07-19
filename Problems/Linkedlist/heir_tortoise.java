package Problems.Linkedlist;

import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

class LinkedList{
    Node head,tail;

    void add(int n){
        Node newNode = new Node(n);
        if (head==null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode; 
    }

    Node  divide(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //System.out.println(slow.data);
        return slow; 
    }
    void display(Node Lhead){
        Node temp = Lhead;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();

    }
}
public class heir_tortoise {
    public static void main(String[] args) {
        LinkedList List1 = new LinkedList();
        Scanner sc = new Scanner(System.in);
        List1.add(1);
        List1.add(2);
        List1.add(3);
        List1.add(4);
        List1.add(3);
        List1.add(2);
        List1.add(1);
        Node List2 = List1.divide();
        List1.display(List2);
        sc.close();

    }
    
}
