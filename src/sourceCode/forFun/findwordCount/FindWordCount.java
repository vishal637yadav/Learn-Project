package sourceCode.forFun.findwordCount;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FindWordCount {

	public static void main(String[] args) throws Exception 
	{
		String alphabetCharMatrix [][] = getUniversalDataSet() ;
		String wordSet = "HR";
		
		System.out.println("--"+wordSet.charAt(0));
		for(int i=0 ; i< alphabetCharMatrix.length;i++)
	    {
	    	for(int j=0;j<alphabetCharMatrix[i].length;j++)
	    	{
	    		String printChar = alphabetCharMatrix[i][j];
	    		printChar = "  "+alphabetCharMatrix[i][j];
	    		System.out.print(printChar);
	    	}
	    	System.out.println("-----------------------------");
	    }
	}
	
	public  String getNthCharacterString(int position)
	{
		return "";
	}
	@SuppressWarnings("resource")
	public static String[][] getUniversalDataSet() throws Exception 
	{
		
		
		/* Read file character by character
		fr = new FileReader("F:\\Programming\\Code\\JavaGUI_Workspace\\DesignPattern\\FindWordCount.txt"); 
		int i; 
		while ((i=fr.read()) != -1)
		System.out.print((char) i);
		*/
		// Read File Line by Line 
	    File file = new File("D:\\Work\\NewWorkSpace13Dec\\Learn Project\\FindWordCount.txt"); 
	    Scanner sc = new Scanner(file); 
	    String lineData = null;
	    ArrayList<String> alphabetMatrix = new ArrayList<String>();
	    boolean isAlphabetMatrix = false;
	    ArrayList<String> wordMatrix = new ArrayList<String>();
	    boolean isWordMatrix= false;
	    
	    while (sc.hasNextLine()) 
	    {
	    	lineData = sc.nextLine();
	    	System.out.println(" lineData =>> "+lineData); 
	    	if("ALPHABET_MATRIX".equals(lineData) || isAlphabetMatrix )
	    	{
	    		if("ALPHABET_MATRIX".equals(lineData) && !isAlphabetMatrix)
	    		{
	    			isAlphabetMatrix = true;
	    		}else if("ALPHABET_MATRIX".equals(lineData) && isAlphabetMatrix){
	    			isAlphabetMatrix = false;
	    		}
	    		
	    		if(isAlphabetMatrix && !"ALPHABET_MATRIX".equals(lineData)) {
	    			alphabetMatrix.add(lineData);
	    		}
	    		 
	    	}else if("WORD_MATRIX".equals(lineData) || isWordMatrix )
	    	{
	    		if("WORD_MATRIX".equals(lineData) && !isWordMatrix)
	    		{
	    			isWordMatrix = true;
	    		}else if("WORD_MATRIX".equals(lineData) && isWordMatrix){
	    			isWordMatrix = false;
	    		}
	    		
	    		if(isWordMatrix && !"WORD_MATRIX".equals(lineData)) {
	    			wordMatrix.add(lineData);
	    		}
	    	}
	    }
	    
	    System.out.println("alphabetMatrix  => "+alphabetMatrix);
	    System.out.println("wordMatrix  => "+wordMatrix);
	    
	    String alphabetCharMatrix [][] = new String[alphabetMatrix.size()][alphabetMatrix.size()];
	    int count = 0;
	    for(String rowAlphabet : alphabetMatrix )
	    {
	    	System.out.println(" a ==>"+rowAlphabet);
	    	alphabetCharMatrix [count++] = rowAlphabet.split(",");
	    }
	    
	    /*
	    for(int i=0 ; i< alphabetCharMatrix.length;i++)
	    {
	    	for(int j=0;j<alphabetCharMatrix[i].length;j++)
	    	{
	    		String printChar = alphabetCharMatrix[i][j];
	    		printChar = "  "+alphabetCharMatrix[i][j];
	    		System.out.print(printChar);
	    	}
	    	System.out.println("");
	    }
	    */
	    return alphabetCharMatrix ;
	}
}