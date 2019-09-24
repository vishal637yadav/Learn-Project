package sourceCode.array;

import java.lang.reflect.Array;

public class GenericDynamicArray
{

	public static void main(String[] args)
	{
		System.out.println("This is the Main Method()!!");
		Object objArray[] = creatGenericArray(34);
		System.out.println(" objArray : "+objArray);
		System.out.println(" objArray :"+objArray.length);
		
	}
	
	
	@SuppressWarnings("unchecked")
	public static <T> T[] creatGenericArray()
	{
		System.out.println("This is Generic Array := ");
		return (T[]) Array.newInstance(Object.class, 10);
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T[] creatGenericArray(int size)
	{
		System.out.println("This is Generic Array := ");
		return (T[]) Array.newInstance(Object.class, size);
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T[] creatGenericArray(Class<T> c,int size)
	{
		System.out.println("This is Generic Array := ");
		return (T[]) Array.newInstance(c, size);
	}
}


/*
@Component
public class Boo {

    private static Foo foo;
    @Autowired
    private Foo tFoo;

    @PostConstruct
    public void init() {
        Boo.foo = tFoo;
    }

    public static void randomMethod() {
         foo.doStuff();
    }
}
*/