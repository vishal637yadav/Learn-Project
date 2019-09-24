package sourceCode.javaIO.sequenceInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class ReadingDataFrom2Files_Writeto3rdFiles
{

	public static void main(String[] args) throws IOException
	{
		FileInputStream fin1 = new FileInputStream("D:\\testin.txt");
		FileInputStream fin2 = new FileInputStream("D:\\testin2.txt");
		FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
		SequenceInputStream sis = new SequenceInputStream(fin1, fin2);
		int i;
		while ((i = sis.read()) != -1)
		{
			fout.write(i);
		}
		sis.close();
		fout.close();
		fin1.close();
		fin2.close();
		System.out.println("Success..");

	}

}
