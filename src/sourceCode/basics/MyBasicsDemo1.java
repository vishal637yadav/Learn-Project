package sourceCode.basics;

import java.math.BigInteger;

public class MyBasicsDemo1 {

	public static void main(String[] args) {
		
		String str7 = "MyName";
		String str1 = "TestString";
		String str2 = "TestString";
		String str3 = new String("TestString");
		String str4 = new String("TestString");
		String str5 = new String("MyName");
		String str6 = "MyName";
		
		
		System.out.println("str1 = 'TestString'            : "+Integer.toHexString(System.identityHashCode(str1)));
		System.out.println("str2 = 'TestString'            : "+Integer.toHexString(System.identityHashCode(str2)));
		System.out.println("str3 =new String('TestString') : "+Integer.toHexString(System.identityHashCode(str3)));
		System.out.println("str4 =new String('TestString') : "+Integer.toHexString(System.identityHashCode(str4)));
		System.out.println("str5 =new String('MyName')     : "+Integer.toHexString(System.identityHashCode(str5)));
		System.out.println("str6 = 'MyName'                : "+Integer.toHexString(System.identityHashCode(str6)));
		System.out.println("str7 = 'MyName'                : "+Integer.toHexString(System.identityHashCode(str7)));
		
		Transaction tran1 = new Transaction(45);
		Transaction tran2 = new Transaction(45);
		Transaction tran3 = new Transaction(45);
		System.out.println("tran1 = new Transaction(45)    : "+tran1);
		System.out.println("tran2 = new Transaction(45)    : "+tran2);
		System.out.println("tran3 = new Transaction(45)    : "+tran3);
		
		BigInteger b = null;
		System.out.println("b"+b);
		int a = 07;
		System.out.println(" print a = "+a);
		
	}
	
	
}


class Transaction
{
	int amount;
	Transaction(int amount)
	{
		this.amount=amount;
	}
	
	/*public int hashCode()
	{
		return 15;
	}
	*/
	/*
	public String toString()
	{
		return amount+"";
	}*/
}
