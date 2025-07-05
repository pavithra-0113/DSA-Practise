package com;

public class PrintInReverse {
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintInReverse list=new PrintInReverse();
		
		Node head=list.new Node(10);
		head.next=list.new Node(20);
		head.next.next=list.new Node(30);
		head.next.next.next=list.new Node(50);
		
		print(head);

	}
	static void print(Node node) {
		while(node!=null) {
			System.out.print(node.data+" ");
			node=node.next;
		}
	}

}
