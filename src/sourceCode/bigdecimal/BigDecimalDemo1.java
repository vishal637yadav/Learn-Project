package sourceCode.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalDemo1
{

	public static void main(String[] args)
	{
		System.out.println("------Financial Calculation with Float & Double-----------------------");
		double d1 = 374.56;
		double d2 = 374.26;
		//result would be d1 - d2 = 0.30000000000001137
		System.out.println(" d1 - d2 = "+(d1-d2));
		
		BigDecimal b1 = new BigDecimal("374.56");
		BigDecimal b2 = new BigDecimal("374.26");
		System.out.println(" b1 - b2 = "+b1.subtract(b2));
		
		//BigDicimal 
		BigDecimal b3 = new BigDecimal(374.56);
		BigDecimal b4 = new BigDecimal(374.26);
		System.out.println(" b3 - b4 = "+b3.subtract(b4));
		
	}

}
