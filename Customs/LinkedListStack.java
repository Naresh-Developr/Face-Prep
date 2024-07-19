package Customs;

import java.util.*;
class Node{
	int data;
  	Node next;
  	Node(int n){
    	this.data = n;
    }
}
class LinkedListStack{
	Node head,tail;
  	void add(int n){
    	Node newNode = new Node(n);
      	if(head==null){
        	head=tail=newNode;
          	return;
        }
      tail.next = newNode;
      tail = newNode;
    }
  
  	void delete(){
      	if(head==null){
        	return;
        }
      	if(head.next==null){
        	System.out.print(head.data+" ");
          	return;
        }
    	Node temp = head;
      	while(temp.next.next != null){
        	temp = temp.next;
        }
      	System.out.print(temp.next.data+" ");
      	temp.next =  null;
        tail = temp;
      	
    }

    boolean isEmpty(){
        return head==null;
    }

    int peek(){
        return tail.data;
    }
}
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    LinkedListStack ls  = new LinkedListStack();
    int size = 0;
    while(true){
    	int x = sc.nextInt();
      	if(x<0) 
          break;
      	ls.add(x);
      	size++;
    }
    for(int i=0;i<size;i++){
    	ls.delete();
    }
    sc.close();
  }
}
