package sourceCode.collection.stack;

import java.lang.reflect.Array;

public class MyStackDemo
{

	public static void main(String[] args)
	{
		MyStack<String>	ms = new MyStack<String>();
		System.out.println("Top : "+ms.getTop());
		System.out.println("---push-----------------------------------");
		ms.push("Naveen");
		ms.display();
		System.out.println("Top : "+ms.getTop());
		System.out.println("---push-----------------------------------");
		ms.push("Vishal");
		ms.display();
		System.out.println("Top : "+ms.getTop());
		System.out.println("---push-----------------------------------");
		ms.push("Yadav");
		ms.display();
		System.out.println("Top : "+ms.getTop());
		System.out.println("---pop-----------------------------------");
		ms.pop();
		ms.display();
		System.out.println("Top : "+ms.getTop());
		System.out.println("---push-----------------------------------");
		ms.push("Priyansh");
		ms.display();
		System.out.println("Top : "+ms.getTop());
		System.out.println("--------------------------------------");

		MyStack<Integer> mi = new MyStack<Integer>();
		System.out.println("Top : "+mi.getTop());
		System.out.println("---push-----------------------------------");
		mi.push(23);
		mi.display();
		System.out.println("Top : "+mi.getTop());
		System.out.println("---push-----------------------------------");
		mi.push(24);
		mi.display();
		System.out.println("Top : "+mi.getTop());
		System.out.println("---push-----------------------------------");
		mi.push(25);
		mi.display();
		System.out.println("Top : "+mi.getTop());
		System.out.println("---push-----------------------------------");
		mi.push(26);
		mi.display();
		System.out.println("Top : "+mi.getTop());
		System.out.println("---pop-----------------------------------");
		mi.pop();
		mi.display();
		System.out.println("Top : "+mi.getTop());
		
	}

}

class MyStack<E>
{
	E[] elementArray;
	private  int DEFAULT_SIZE = 16;
	private int size =0;
	private int top = -1;
	
	
	@SuppressWarnings("unchecked")
	public MyStack()
	{
		this((Class<E>) Object.class);
	}
	
	@SuppressWarnings("unchecked")
	public MyStack(Class<E> c)
	{
		this.elementArray = (E[]) Array.newInstance(c, DEFAULT_SIZE);
	}
	
	@SuppressWarnings("unchecked")
	public MyStack(Class<E> c,int size)
	{
		this.elementArray = (E[]) Array.newInstance(c, size);
	}
	
	@SuppressWarnings("unchecked")
	public void constructArray(E[] a)
	{
		this.elementArray =(E[])java.lang.reflect.Array.newInstance(a.getClass().getComponentType(), DEFAULT_SIZE);
	}
	
	public void push(E element)
	{
		top++;
		size++;
		elementArray[top]=element;
	}
	
	public E pop()
	{
		E element = elementArray[top];
		top--;
		size--;
		return element;
	}
	
	public void display()
	{
		for(int i=top ;i >= 0;i--)
		{
			System.out.println(this.elementArray[i]);
		}
	}
	
	public int getTop()
	{
		return this.top;
	}
}