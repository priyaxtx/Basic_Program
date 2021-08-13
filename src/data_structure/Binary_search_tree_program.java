package data_structure;

public class Binary_search_tree_program{
	
	void BinarySearchTree(int a[],int first,int last,int key,int mid)
	{
		//int temp;
		
		
	
		while(first<=last){
			if(a[mid]<key)
			{
				first=mid+1;
				mid=mid+1;
				//temp=a[first];
			}
			else if(key==a[mid])
			{
			System.out.println("the value of the search number index is :"+mid);	
			break;
			}
			
			else
			{
				first=mid-1;
				mid=mid-1;
				//temp=a[first];
			}
			
		}
	}
	
	
public static void main(String[] args) {
	int a[]= {12,13,14,15,16,17,18,19,20};
	int last=a.length-1;
int mid=a.length/2;
System.out.println(mid+" "+a[mid]);
int key=12;
Binary_search_tree_program s=new Binary_search_tree_program();
s.BinarySearchTree(a,0,last,key,mid);
	}

}
