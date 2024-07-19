package Problems.Linkedlist;

//import java.util.List;
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
        System.out.println(slow.data);
        return slow; 
    }

    Node reverse(Node listHead){
        Node prev = null;
        Node cur = head;
        while(cur!=null){
            Node nextNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextNode; 
        }
        head = prev;
        return head;
    } 

    boolean palindrome(Node list1, Node list2){
        Node p1 = list1;
        Node p2 = list2;

        while(p1!=null && p2!=null){
            if(p1.data != p2.data){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }
}
public class palindrome_singly {
    public static void main(String[] args) {
        LinkedList List1 = new LinkedList();
        Scanner sc = new Scanner(System.in);
        // for(int i=0;i<10;i++){
        //     List1.add(i);
        // }
        List1.add(1);
        List1.add(2);
        List1.add(3);
        List1.add(4);
        List1.add(3);
        List1.add(2);
        List1.add(1);
        Node List2 = List1.divide();
        List2  = List1.reverse(List2);
        sc.close();
        //System.out.println(List1.head.next.next.next.data);
        System.out.println(List1.palindrome(List1.head, List2));
        
    }
    
}
