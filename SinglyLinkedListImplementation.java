package linkedlist;

//creating the node here
class Node{
	 String data;
	 Node next;
	 
	 public void print() {
		 System.out.print(data+">>");
	 }	
}


class SinglyLinkedList{
	 //creating the head of list 
	 Node head;
	 
	  //checking the list is empty or not
		 public boolean isEmpty() {
			 return(head==null);
		 }
		 
	 
	 //inserting the node at the  beginning
	 
	 public void insertFirst(String d) {
		 Node n=new Node();
		 n.data=d;
		 n.next=head;
		 head=n;		 
	 }
	 
	 
	 //deleting the first node in the list
	 
	 public void deleteFirst() {
		 head=head.next;
	 }
	 
	 //inserting the element at the last 	 
	 void insertLast(String d) {
		 //creating the node
		 Node n=new Node();
		 n.data=d;
		 n.next=null;
		 
		 //checking the list is empty or not
		 if(isEmpty())
			 head=n;
		 
		 //Traversing the list
		 else{
		    Node curr=head;	 
		    while(curr.next!=null) {
		    	curr=curr.next;
		    }
		    
		    //inserting the address of the newly created node to the last node of list
		    curr.next=n;
		 }			 
	 }
	 
	 //printing the whole linked list
	 void printElements() {
		 Node curr=head;
		 while(curr!=null) {
			 curr.print();
			 curr=curr.next;
		 }		 
	 } 
}


public class SinglyLinkedListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating the list and adding the two nodes at the beginning  of the list
		SinglyLinkedList s1=new SinglyLinkedList();
		
		System.out.println("\n\nThe initaily list is empty and head is also ");
		System.out.println(s1.head+"\n\n");
		s1.insertFirst("Infosys");
		s1.insertFirst("Cognizant");
		
		//printing the list data
		System.out.println("List after adding the two element at the begining \n");
		s1.printElements();
		
		//inserting the element in the last of linked list
		s1.insertLast("Sachin");
		s1.insertLast("nana");
		System.out.println("\n \n List after adding the two element at the  last of linked list \n");
		s1.printElements();	
		
		//deleting the first element of the list
		System.out.println("\n \n List after deleting the first element of linked list \n");
		s1.deleteFirst();
		s1.printElements();
	}

}
