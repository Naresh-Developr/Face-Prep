package Customs;

import java.util.*;

class Node{
  int data;
  Node next;
  Node(int n){
  	this.data = n;
  }
}
class circularLinkedList{
  Node head, tail;
  void add(int n){
    Node newNode = new Node(n);
    if(head == null){
  	head = tail = newNode;
    tail.next = head;
    return;
  }
  tail.next = newNode;
  tail = newNode;
  tail.next = head;
  }
  
  void traverse(){
  	Node temp = head.next;
    System.out.print(head.data+" ");
    while(temp!=head){
    	System.out.print(temp.data+" ");
      	temp = temp.next;
    }
  }

}
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    circularLinkedList cll = new circularLinkedList();
    int choice;
    do{
    	int data = sc.nextInt();
      	choice = sc.nextInt();
      	cll.add(data);

    }while(choice != 0);
    
    cll.traverse();
    sc.close();
  }
}