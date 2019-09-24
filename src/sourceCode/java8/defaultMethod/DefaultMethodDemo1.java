package sourceCode.java8.defaultMethod;

@FunctionalInterface
interface Sayble
{
	default void defaultSay()
	{
		System.out.println("defaultSay Method");
	}
	
	void sayMore();
}
public class DefaultMethodDemo1
{

	public static void main(String[] args)
	{
		Sayble s = ()-> System.out.println("Say More called");
		s.sayMore();
		s.defaultSay();
	}

}
