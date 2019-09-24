package sourceCode.java9.privateinteface;

public interface Sayable
{
	default void saySomething()
	{
		System.out.println("Saysomething Called ()!!");
	}
	
	default void joke()
	{
		
	}
}
