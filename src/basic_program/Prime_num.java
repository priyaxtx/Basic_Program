package basic_program;

import java.util.Scanner;

public class Prime_num {
	public void prime_func()
	{
		System.out.println("Enter number: ");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
	//	System.out.println("Enter number: ");
		if((no%2)!=0)
		{
			if((no%3)!=0)
			{
				if(no/no==1)
				{
					System.out.println("this is prime number: "+no);
				}
			}
		}
		else
		{
			System.out.println("This is not a prime number");
		}
	}
	//public void prime_func_2()
	//{
	//	boolean flag;
	//	System.out.println("Enter number: ");
	//	Scanner sc=new Scanner(System.in);
		//int no=sc.nextInt();
		//if(no==1|| no==0)
		//{
		//	System.out.println("number is not a prime number");
			
			
	//	}
	//	else {
		//for(int i=2;i<=no;i++)
		///{
		//	if((no%i)==0)
	//		{
		//		break;
		//		
		//	}
		//	else
		//	{
		//	System.out.println("number is prime number");
			
		//	}
			
	//	System.out.println("number is not a prime number");
		//}
//	}
public static void main(String args[])
{
	Prime_num obj=new Prime_num();
	obj.prime_func();
	//obj.prime_func_2();
}
}
