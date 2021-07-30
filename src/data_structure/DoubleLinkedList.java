package data_structure;

public class DoubleLinkedList {
	Node head;
	Node tail;
 class Node
 {
	 public Node next;
	public  Node prev;
	 int data;
	 public Node(int data)
	 {
		 this.data=data;
	 }
	 
 }
 
 public void insert(int data)
 {
	 Node NewNode=new Node(data);
	  if(head==null)
	  {
		  
		  head=NewNode;
		  tail=NewNode;
		  head.prev = null; 
		    tail.next = null;  
		//System.out.println(head.data);

	  }
	  else
	  {
		    tail.next=NewNode;
		   NewNode.prev=tail;
           tail=NewNode;
		  //System.out.println(tail.data);
	  }
	 }
	
	
	public void display() {  
       
        Node temp = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(temp != null) {  
        
            System.out.print(temp.data + " ");  
            temp =temp.next;
        }
       
        }  
	
	
	public static void main(String[] args) {
		DoubleLinkedList dll=new DoubleLinkedList();
		dll.insert(12);
		dll.insert(2);
		dll.insert(121);
		dll.insert(02);
		dll.insert(56);
		dll.insert(78);
		
		dll.display();
	}

}
