package sourceCode.basics.enumeration;

import java.io.Serializable;

/*
enum Color
{
	RED,GREEN,BLUE
}
*/

//* internally above enum Color is converted to
class Color
{
     public static final Color RED = new Color();
     public static final Color BLUE = new Color();
     public static final Color GREEN = new Color();
}
//*/

public class EnumDemo1 implements Serializable
{

	public static void main(String[] args)
	{
		Color c1 = Color.RED;
		System.out.println("c1 :"+c1);
		
	}
	
	private Object readResolve()  {
	    return null;
	}

}
