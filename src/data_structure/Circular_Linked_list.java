package data_structure;

public class Circular_Linked_list {
	
	
	public class Node
	{
		int data;
		Node nextNode;   //ref 
	public Node(int data)
		{
			this.data=data;
		}
	}
	
	public Node head = null;  
    public Node tail = null;  
    
	public void add(int data)
	{
		Node newNode=new Node(data);
		  if(head==null)
		{
			head=newNode;
			tail=newNode;
			tail.nextNode=head;
		}
		  else
		{
			tail.nextNode=newNode;
			tail=newNode;
			tail.nextNode=head;
			//System.out.println(tail.nextNode.data);
		}
		
		tail=newNode;
		tail.nextNode=head;
	}

	
	public  void display()
	{
		Node currentNode=head;
		if(head==null)
		{
			System.out.println("list is Empty");
		}
		else
		{
			do {
				
				System.out.println(currentNode.data+" ");
				
				currentNode=currentNode.nextNode;
			    }while(currentNode!=head);
			
		}
		
	}
	
	public static void main(String[] args) {
		Circular_Linked_list c=new Circular_Linked_list();
c.add(3);
c.add(8);
c.add(9);
c.add(2);
c.add(4);
c.add(6);

c.display();

	}

}
