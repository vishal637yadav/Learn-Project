package sourceCode.basics.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo
{

	public static void main(String[] args)
	{
		String fileName = "empSerialization.ser";
		//doSerialization(fileName);
		
		doDe_Serialization(fileName);
		
	}
	
	public static void doSerialization(String fileName)
	{
		System.out.println("");
		try(ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(new File(fileName))) )
		{
			Employee emp1 = new Employee(20032, "Vishal Yadav", "vishal.intellect@gami.com", "Raesh$5342");
			System.out.println(emp1);
			System.out.println("Before File written !!");
			oos.writeObject(emp1);
			System.out.println("After File written !!");
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void doDe_Serialization(String fileName)
	{
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(fileName))))
		{
			System.out.println("Before Reading the file");
			Object object= ois.readObject();
			Employee emp = (Employee)object;
			System.out.println(emp);
			System.out.println("After Reading the file");
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
