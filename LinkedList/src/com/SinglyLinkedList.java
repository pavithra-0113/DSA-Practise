package com;

public class SinglyLinkedList {
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
			
		}
	}
	
	public static void printList(Node node) {
		while(node!=null) {
			System.out.print(node.data+" ");
			node=node.next;
		}
	}
		
 public static void main(String[] args) {
	 
	 SinglyLinkedList list=new SinglyLinkedList();
			
			Node head=list.new Node(10);
			head.next=list.new Node(20);
			head.next.next=list.new Node(30);
			
			printList(head);
		} 
		
	 
		
	}


