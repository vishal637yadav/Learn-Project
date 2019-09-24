package sourceCode.basics.innerClass;

public class ShadowTest
{
	public int x = 0;

	class FirstLevel
	{
		public int x = 3;

		void methodInFirstLevel(int x)
		{
			System.out.println("x = " + x);
			System.out.println("this.x = " + this.x);
			System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ShadowTest st = new ShadowTest();
		ShadowTest.FirstLevel fl = st.new FirstLevel();
		fl.methodInFirstLevel(23);

	}

}
