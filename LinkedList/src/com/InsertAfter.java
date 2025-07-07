package com;
 

public class InsertAfter {
     
	
 
		
		static void Print(Node head) {
			  
			while(head!=null) {
				System.out.print(head.data+" ");
				head=head.next;
				
			}
			System.out.println();
		}
		
		static Node Solution(Node head,int key,int new_data) {
			
			Node curr=head;
			
			while(curr!=null) {
				if(curr.data==key) {
					break;
					 
				}
				curr=curr.next;
			}
			if(curr==null) {
				System.out.println("Not Found");
				return head;
			}
			
		  Node new_node=new Node(new_data);
		  
		  new_node.next=curr.next;
		  curr.next=new_node;
		  
		  return head;
		  
			
		}
		
		

		public static void main(String[] args) {
			 
			Node head=new Node(10);
			head.next=new Node(20);
			head.next.next=new Node(30);
			head.next.next.next=new Node(40);
			
			System.out.println("Originala Linked List");
			Print(head);
			
			int data=100;
			head=Solution(head,20,data);
			System.out.println("After Inserting");
			Print(head);
			
	}
}



