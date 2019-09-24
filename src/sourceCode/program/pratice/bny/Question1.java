package sourceCode.program.pratice.bny;

public class Question1
{

	public static void main(String[] args)
	{
		//int a[]={9,-1,-3,4,5};
		int a[]={-3,2,4,-1,-2,-5};
		setMaxSum(a);
	
	}

	public static int setMaxSum(int a[])
	{
		int size = a.length;
		int b[]= new int [a.length];
		int bcnt = 0;
		for(int i=0;i<size;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
			if(a[i]>0)
			{
				b[bcnt++]= a[i];
			}if((i+2)<size && a[i]<0 && a[i+1]<0 && a[i+2]<0)
			{
				// i  i+1 i+2
				int acSum = a[i]+a[i+2];
				if(a[i+1] > acSum)
				{
					b[bcnt++]=a[i+1];
				}else
				{
					b[bcnt++]= acSum;
				}
				i=i+2;
			}else if((i+1)<size && a[i]<0)
			{
				if(a[i+1]>0)
				{
					b[bcnt++]=a[i+1];
				}else
				{
					b[bcnt++]= (a[i]>a[i+1]?a[i]:a[i+1]);
				}
				i=i+1;
			}
		}
		System.out.println("Max Sum :"+calcSum(b));
		return calcSum(b);
	}
	
	public static int calcSum(int a[])
	{	
		int sum = 0;
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			sum = sum +a[i];
		}
		System.out.println();
		return sum;
	}
	
}
