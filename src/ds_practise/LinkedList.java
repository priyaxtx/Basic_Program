package ds_practise;

public class LinkedList {
	
	public Node head=null;
	public Node tail=null;
	public Node temp=null;
	public class Node
	{
	Node next;
	int data;
	public Node(int data)
	{
	this.data=data;
	}
	}

	public void Insert(int data)
	{ 
	Node newnode=new Node(data);

	if(head==null)
	{
	newnode=head;
	newnode=tail;
	}

	else
	{
	tail.next=newnode;
	tail=newnode;
	System.out.println(tail);
	}
	}


	void display()
	{
      temp=head;
      System.out.println(temp.data);
	while(temp!=null)
	{
	System.out.println(temp.data);
	temp=temp.next;
	}
	}
	
	
	 public void InsertInBetWeen(int data,int prev_data)
	 {
		 Node newnode=new Node(data); 
      temp=head;
      
      try {
	 while(temp.data!=prev_data)
	 {
       temp=temp.next;
       
	 }
	 
	
	 newnode.next=temp.next;
	 newnode=temp;
	 }
      finally {
  		System.out.println("not worked");
  	}
	 }
	
	
	
	public static void main(String a[])
{
		LinkedList ll=new LinkedList();
		ll.Insert(60);
		ll.Insert(79);
		ll.Insert(12);
		ll.Insert(34); 
		ll.Insert(43); 
		ll.Insert(11);
		ll.Insert(20);
		//ll.display();
		//ll.InsertInBetWeen(90,34);
	//	ll.display();
}
}
