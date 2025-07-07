package com;


class Node{
	int data;
	Node next;
	
	Node(int newData){
		data=newData;
		next=null;
	}
	
}

public class InserAtFirst {
     
	
 
		
		static void Print(Node head) {
			  
			while(head!=null) {
				System.out.print(head.data+" ");
				head=head.next;
				
			}
			System.out.println();
		}
		
		static Node Solution(Node head,int new_data) {
			
			
			Node new_node=new Node(new_data);
			
			new_node.next=head;
			
			return new_node;
			
		}
		

		public static void main(String[] args) {
			 
			Node head=new Node(10);
			head.next=new Node(20);
			head.next.next=new Node(30);
			head.next.next.next=new Node(40);
			
			System.out.println("Originala Linked List");
			Print(head);
			
			int data=100;
			head=Solution(head,data);
			System.out.println("After Inserting");
			Print(head);
			
	}
}



