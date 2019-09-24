package sourceCode.javaIO.sequenceInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class ReadingDatafromMorethan2Files
{

	public static void main(String[] args) throws IOException
	{
		// creating the FileInputStream objects for all the files
		FileInputStream fin1 = new FileInputStream("D:\\a.txt");
		FileInputStream fin2 = new FileInputStream("D:\\b.txt");
		FileInputStream fin3 = new FileInputStream("D:\\c.txt");
		FileInputStream fin4 = new FileInputStream("D:\\d.txt");
		// creating Vector object to all the stream
		Vector<FileInputStream> v = new Vector<FileInputStream>();
		v.add(fin1);
		v.add(fin2);
		v.add(fin3);
		v.add(fin4);
		// creating enumeration object by calling the elements method
		Enumeration<FileInputStream> e = v.elements();
		// passing the enumeration object in the constructor
		SequenceInputStream bin = new SequenceInputStream(e);
		int i = 0;
		while ((i = bin.read()) != -1)
		{
			System.out.print((char) i);
		}
		bin.close();
		fin1.close();
		fin2.close();
		fin3.close();
		fin4.close();
	}

}
