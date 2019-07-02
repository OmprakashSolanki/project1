package com.ops.linkedlist;

import javax.sound.midi.Soundbank;

public class LinkedList {
	
	private static Node head;
	
	


	@Override
	public String toString() {
		return "LinkedList [head=" + head.item + "]";
	}


	public static   class Node {

		private Object item;
		private Node next;
		
		public Node(Object item) {
			
			this.item = item;
			this.next = null;
		}
	} 
	
	
	public static void main(String[] args) {

	
		Node second=new Node("Item2");
		
		Node third= new Node("Item3");
		
		Node forth= new Node("Item4");
		
		Node fifth= new Node("Item5");
		
		//add to list
		LinkedList llist=new LinkedList();
		
			llist.head=	new Node("Item1");
			
			//add more element
			head.next=second;
			second.next=third;
			third.next=forth;
			forth.next=fifth;
		
			System.out.println(llist);
			
			int length=0;
			Node current=head;
			Node middle=head;
			while(current.next!=null) {
				length++;
				if(length%2==0) {
					middle=middle.next;
					
				}
				current=current.next;
			}
			 if(length%2==1)
				middle=middle.next;
			
			 System.out.println(middle.item);
	}

}
