package sourceCode.basics.hashCode;

public class HashCodeExample {

	public static void main(String[] args) 
	{
		System.out.println("this is main");
		for(char i='a';i<123;i++)
		{
			System.out.println("i ="+i);
			for(char j='a';j<123;j++)
			{
				StringBuilder sb = new StringBuilder();
				sb.append(i).append(j);
				
				//System.out.println("i ="+i);
				//System.out.println("j ="+j);
				System.out.println("sb ="+sb);
				System.out.println("Upper String    :=>>"+sb.toString().toUpperCase());
				System.out.println(sb);
				System.out.println("First Character :=>>"+sb.charAt(0));
				System.out.println("Upper Case First Character :=>>"+(char)(sb.charAt(0)-32));
				
				char c = sb.charAt(0);
				// 065 = 'A';
				// 097 = 'a'; 
				int charSetDifference  = 97-65;
				System.out.println("charSetDifference :=>"+charSetDifference);
				final int y;
				
				y = 23;
				m(y);
				//y 
				System.out.println(y);
			}
			
		}
		new String("sdf").toUpperCase();
		
	}

	public static void m(final int a)
	{
		//a = 42;
		//a = 543;
		System.out.println(a);
	
	}
	
	
}
