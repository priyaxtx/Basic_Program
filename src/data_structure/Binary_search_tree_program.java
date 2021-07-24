package data_structure;

public class Binary_search_tree_program{
	
	void BinarySearchTree(int a[],int first,int last,int key,int mid)
	{
		//int m=mid;
		while(first<=last){
			if(a[mid]<key)
			{
				
			}
			if(key==mid)
			{
			System.out.println("the value of the search number is this :"+key);	
			}
			else
			{
				
			}
			
		}
	}
	
	
public static void main(String[] args) {
	int a[]= {12,13,14,15,16,17,18,19,20};
	int last=a.length-1;
int mid=a.length/2;
int key=17;
Binary_search_tree_program s=new Binary_search_tree_program();
s.BinarySearchTree(a,0,last,key,mid);
	}

}
