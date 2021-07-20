package String_problem;

public class Count_Chara {

	public static void main(String[] args) {
		String st="hey humans";
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)!=' ')
				count++;
		}
		System.out.println("Number of character is:"+count);

	}

}
