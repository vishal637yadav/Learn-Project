package sourceCode.java5.generics.hirarchy;

public class Box<T>
{
	private T t;

	public T getT()
	{
		return t;
	}

	public void setT(T t)
	{
		this.t = t;
	}
	
	public Box<?> getChildObject(Box<? extends T> t)
	{
		System.out.println(t);
		return t;
	}
	
	public Box<?> getParentObject(Box<? extends T> t)
	{
		return t;
	}

}
