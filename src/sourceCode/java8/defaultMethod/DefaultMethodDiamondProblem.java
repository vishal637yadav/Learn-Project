package sourceCode.java8.defaultMethod;

interface Poet
{

	static void write()
	{
		System.out.println("Poet writes");
	}
	default void write(int a)
	{
		System.out.println("Poet writes");
	}
	
	void call();
}

interface Writer
{
	static void write()
	{
		
		System.out.println("Writer writes");
	}
	
	default void write(int a)
	{
		System.out.println("Writer writes");
	}
}
//The method write(int) in the type Poet is not applicable for the arguments ()
public class DefaultMethodDiamondProblem implements Poet,Writer
{
	
	public void write(int a)
	{
		//System.out.println("DefaultMethodDiamondProblem writes");
		Writer.write();
		Poet.write();
	}
	
	public static void main(String[] args)
	{
		System.out.println("This is main Class !!");
		DefaultMethodDiamondProblem a = new DefaultMethodDiamondProblem();
		Writer.write();
		Poet.write();
		a.write(3);
		a.write(34);
	}

	@Override
	public void call()
	{
		// TODO Auto-generated method stub
		
	}

}
