package sourceCode.java8.methodReference;

interface Messageable
{
	Message getMessage(String msg);
}
class Message
{
	Message(String msg)
	{
		System.out.println("Constructor Called -:-"+msg);
	}
} 

public class ConstructorReference
{

	public static void main(String[] args)
	{
		System.out.println("This is Main()!!");
		
		Messageable hello = Message::new ;
		hello.getMessage("Hello Vishal ");
		
	}

}
