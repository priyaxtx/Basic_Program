import java.util.Scanner;
public class PrimeNumber {
public static void main(String a[])
{
	int flag=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int number=sc.nextInt();
	//int reminder=number/2;
	if(number==0 || number==1)
	{
		System.out.println(number+" this number is not a prime number");
		flag=1;
	}
	else
	{
		for(int i=2;i<number;i++)
		{
			
		int temp_num=number%i;
		 if(temp_num==0)
		 {
			 System.out.println("number "+number+ " is not a prime number");
			 flag=1;
			 break;
		 }
		
		}
		}
	
	if(flag==0)
	{
		System.out.println(number+" number is prime");
	}
}
}
