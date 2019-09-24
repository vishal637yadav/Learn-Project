package sourceCode.javaIO.fileInputStream;

import java.io.FileInputStream;

public class DataStreamExample
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Reading File");
			//FileInputStream fin = new FileInputStream("D:\\A.java");
			//FileInputStream fin = new FileInputStream("D:\\A.class");
			FileInputStream fin = new FileInputStream("D:\\test.JPG");
			
			int i = 0;
			
			while ((i=fin.read())!=-1)
			{
				//i = fin.read();
				System.out.print((char) i);
			}
			
			
			fin.close();
		} catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
