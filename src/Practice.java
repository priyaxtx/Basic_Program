import java.util.Scanner;

public class Practice {
	void armstrong()
	{
		int quo,e_data,temp,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number which you want to check to armstrong");
		e_data=sc.nextInt();
		temp=e_data;
		while(temp!=0)
		{
			quo=temp%10;
			sum=sum+(quo*quo*quo);
			temp=temp/10;
		}
		System.out.println(sum);
		if(sum==e_data)
		{
			System.out.println("enter value is armstrong");
		}
		else
		{
			System.out.println("Enter value is not armstrong");
		}
	}
public static void main(String a[])
{
	Practice p_obj=new Practice();
	p_obj.armstrong();
}
}
