import java.math.*;


public class AddDemo {

	public static void main(String args[]) 
    {
	BigDecimal b = new BigDecimal("23.43");
	BigDecimal br = new BigDecimal("24");
	BigDecimal bres = b.add(new BigDecimal("450.23"));
	System.out.println("Add: "+bres);

	MathContext mc = new MathContext(2, RoundingMode.DOWN);
	BigDecimal bdecMath = b.add(new BigDecimal("450.23"), mc);
	System.out.println("Add using MathContext: "+bdecMath);
	
	
}
}
