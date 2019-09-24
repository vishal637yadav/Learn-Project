package sourceCode.basics.serialisation;

import java.io.*;
import java.util.logging.Logger;

public class SerialVersionUID_Demo implements Serializable
{
	//Default serial version uid
	private static final long serialVersionUID = 4L;
	//Any random name
    private static final String fileName = "DemoClassBytes.ser"; 
    public static final  String path = "C:\\Users\\vishal.yadav\\Desktop\\LearnJS\\Java\\Seralisation\\";
	
    
    private static final Logger logger = Logger.getLogger("");
    //Few data fields
    
    //Able to serialize
    private static String staticVariable;
    private int intVariable;
    
    
    //Not able to serialize
    transient private String transientVariable = "this is a transient instance field";
    private Thread threadClass;
    
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
	    //Serialization
	     
		SerialVersionUID_Demo test = new SerialVersionUID_Demo();
        test.intVariable = 1;
        staticVariable = "this is a static variable";
        writeOut(test);
        System.out.println("DemoClass to be saved: " + test);
     
        //De-serialization
         
        System.out.println("DemoClass deserialized: " + readIn());
    
	}
	
	private static Object readIn() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(path+fileName)));
        return ois.readObject();
    }
      
    private static void writeOut(java.io.Serializable obj) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(path+fileName)));
        oos.writeObject(obj);
        oos.close();
    }
      
    @Override public String toString() {
        return "DemoClass: final static fileName=" + fileName + ", final static logger=" + logger
                + ", non-final static staticVariable=" + staticVariable + ", instance intVariable=" + intVariable
                + ", transient instance transientVariable=" + transientVariable + ", non-serializable instance field threadClass:=" + threadClass;
    }
}
