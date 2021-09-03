import java.math.BigDecimal;

public class BigDecimal_double {
	public static void main(String arg[]) {
	 double a = 0.02;
	   double b = 0.03;
	   double c = b - a;
	   //System.out.println(c);
	 
	   BigDecimal _a = new BigDecimal("0.02");
	   BigDecimal _b = new BigDecimal("0.03");
	   BigDecimal _c = _b.subtract(_a);
	   System.out.println(_c);
	}
}
