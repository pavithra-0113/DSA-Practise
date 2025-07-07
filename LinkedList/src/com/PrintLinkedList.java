package com;

import com.CountNodes.Node;

public class PrintLinkedList {
	
	class Node{
		int data;
		Node next;
		
		Node(int newData){
			data=newData;
			next=null;
		}
		
	}
	
	static void Solution(Node head) {
		  
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintLinkedList ll=new PrintLinkedList();
		Node head=ll.new Node(10);
		head.next=ll.new Node(20);
		head.next.next=ll.new Node(30);
		head.next.next.next=ll.new Node(40);
		
		Solution(head);
		
		 

	}

}
