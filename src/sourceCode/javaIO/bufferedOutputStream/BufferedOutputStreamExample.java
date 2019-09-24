package sourceCode.javaIO.bufferedOutputStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample
{

	public static void main(String[] args) throws IOException
	{
		FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "Welcome to javaTpoint.I am vishal";
		byte b[] = s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("success");
	}

}
