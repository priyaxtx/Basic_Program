package String_problem;

import java.util.Scanner;

public class Count_vowels_and_consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter sentence:");
Scanner sc=new Scanner(System.in);
String string=sc.nextLine();
System.out.println(string);
		//String string ="hello beautiful world";
int count=0,count1=0;

for(int i=0;i<string.length();i++)
{
	if(string.charAt(i)!=' ')
	{
		if(string.charAt(i)=='a' || string.charAt(i)=='e' || string.charAt(i)=='i' || string.charAt(i)=='o' || string.charAt(i)=='u')
		{
			count++;
		}
		else
		{
			
				count1++;
			
		}
	}
	
}
System.out.println("the sentence have this number of vowels: "+count);
System.out.println("the sentence have this number of consonant: "+count1);

	}

}
