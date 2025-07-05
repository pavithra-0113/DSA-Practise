package com;

public class FindMidLength {
	
	class Node{
		int data;
		Node next;
		
		
		Node(int x){
			this.data=x;
			this.next=null;
		}
	}
		
		static int getLength(Node head) {
			int len=0;
			while(head!=null) {
				len++;
				head=head.next;
			}
			return len;
		}
		
	 
		
	static int getMid(Node head) {
		
		int len=getLength(head);
		
		int mid_ind=len/2;
		while(mid_ind>0) {
			head=head.next;
			mid_ind--;
		}
		return head.data;
	}

	public static void main(String[] args) {
		
		FindMidLength list=new FindMidLength();
		
		Node head=list.new Node(10);
		head.next=list.new Node(20);
		head.next.next=list.new Node(30);
		head.next.next.next=list.new Node(40);
		head.next.next.next.next=list.new Node(50);
		head.next.next.next.next.next=list.new Node(60);
		
		System.out.println(getMid(head));
		
		

	}

}
