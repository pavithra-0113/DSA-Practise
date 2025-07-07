package com;

public class CountNodes {
	
	class Node{
		int data;
		Node next;
		
		
		Node(int newData){
			data=newData;
			next=null;
		}
	}
		
	static int Solution(Node head) {
			int count=0;
			Node curr=head;
			
			while(curr!=null) {
				count++;
				curr=curr.next;
			}
			 
			 
			return count;
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountNodes ll=new CountNodes();
		Node head=ll.new Node(10);
		head.next=ll.new Node(20);
		head.next.next=ll.new Node(30);
		head.next.next.next=ll.new Node(40);
		
		System.out.println(Solution(head));
	}

}
