package String_problem;

import java.util.Scanner;

public class String_anagram {

	public static void main(String[] args) {
		System.out.println("ENTER THE TWO STRING");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		for(int i=0;i<s1.length();i++)
		{
			
			for(int j=0;j<s2.length();j++)
			{
				if(s2.charAt(i)==s1.charAt(j))
				{
					
				}
				else
				{
					j++;
				}
			}
			i++;
			
		}
		
	}

}
