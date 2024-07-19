package Problems.Linkedlist;

import java.util.*;
class Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data = data;
    }
}
class Linkedlist{
    Node head,tail;
  	void add(int n){
      	Node newNode = new Node(n);
    	if(head == null){
        	head = tail = newNode;
          	return;
        }
      	tail.next = newNode;
      	newNode.prev = tail;
      	tail = newNode;
    }
  
  	void rotateKTimes(int n){
    	Node temp = head;
      	int k=0;
      	while(k<n-1){
        	temp = temp.next;
          	k++;
        }
      	temp.next.prev = null;
      	Node newHead = temp.next;
      	Node temp1 = temp.next;
      	while(temp1.next!=null){
        	temp1 = temp1.next;
          	//System.out.println(temp1.data);
        }
      	
      	temp1.next = head;
      	head.prev = temp1;
      	temp.next = null;
      	head = newHead;
    }
  
  	void display(){
    	Node temp = head;
      	while(temp!=null){
        	System.out.print(temp.data+" ");
          	temp = temp.next;
        }
      System.out.println();
    }
   
}
class rotateDoublyLinkedList
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    Linkedlist ll = new Linkedlist();
    int t = sc.nextInt();
   for(int j=0;j<t;j++){
   	   	int n = sc.nextInt();
    	int k = sc.nextInt();
    	for(int i=0;i<n;i++){
      		int temp = sc.nextInt();
    		ll.add(temp);
    	}
    	ll.rotateKTimes(k);
    	ll.display();
   }
   sc.close();
  }
}
