enum Enums
	{
	    A, B;
	 
	    private Enums()
	    {
	        System.out.println(10);
	    }
	}
	 
	public class MainClass{

	    public static void main(String[] args)
	    {
	        Enum en = Enums.A;
	    }
	}

