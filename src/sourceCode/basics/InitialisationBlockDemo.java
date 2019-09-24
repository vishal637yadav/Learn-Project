package sourceCode.basics;

import java.util.ArrayList;

public class InitialisationBlockDemo
{
	public static final int b ;
	static {
		b = 98;
	}
	
	public final ArrayList<Integer> intArray ;
	
	public final int a ;
	
	{
		System.out.println("Initilisation Block Called");
		//a=10;
		intArray = new ArrayList<>();
	}
	
	InitialisationBlockDemo()
	{
		System.out.println("InitialisationBlockDemo Called !!");
		a=10;
	}
	
	public void diplay()
	{
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);
		System.out.println("Value of intArray : "+intArray);
		System.out.println("Value of Integer.toHexString(System.identityHashCode(intArray)) : "+Integer.toHexString(System.identityHashCode(intArray)));
		intArray.add(34);
		intArray.add(3234);
		System.out.println("Value of intArray : "+intArray);
		System.out.println("Value of intArray.hashCode() : "+intArray.hashCode());
		System.out.println("Value of System.identityHashCode(intArray) : "+System.identityHashCode(intArray));
		System.out.println("Value of Integer.toHexString(System.identityHashCode(intArray)) : "+Integer.toHexString(System.identityHashCode(intArray)));
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("this is main class !!");
		InitialisationBlockDemo m = new InitialisationBlockDemo();
		m.diplay();
	}
}
