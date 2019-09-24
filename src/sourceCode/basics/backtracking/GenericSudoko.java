package sourceCode.basics.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class GenericSudoko
{
	Integer[][] sudokoState ;
	int size;
	private final int DEFAULT_SIZE = 9;
	
	public GenericSudoko()
	{
		this.sudokoState = (Integer[][]) Array.newInstance(Integer.class,DEFAULT_SIZE,DEFAULT_SIZE);
		System.out.println("Default Method >>");
	}
	
	public GenericSudoko(int size)
	{
		this.size = size;
		this.sudokoState = (Integer[][]) Array.newInstance(Integer.class, this.size,this.size);
	}
	
	public void display()
	{
		String currValue =" ";
		for(int i = 0 ;i<this.sudokoState.length;i++)
		{
			for(int j=0;j<this.sudokoState[i].length;j++)
			{
				this.sudokoState[i][j]= 0;
				currValue = currValue+this.sudokoState[i][j]+" ";
			}
			System.out.println(currValue);
			currValue =" ";
		}
	}
	
	public LinkedHashSet<Integer> getInsertableNoSet(int rowIndex, int colIndex)
	{
		//System.out.println(" rowIndex=" + rowIndex + ", colIndex=" + colIndex);
		
		//Set<Integer> nonInsertableNoSet = new HashSet<Integer>();
		LinkedHashSet<Integer> nonInsertableNoSet = new LinkedHashSet<Integer>();
		int temRowValues, temColValues;

		for (int k = 0; k < this.sudokoState.length; k++)
		{
			temRowValues = sudokoState[rowIndex][k];
			temColValues = sudokoState[k][colIndex];
				
			//System.out.println("temRowValues :"+temRowValues);
			//System.out.println("temColValues :"+temColValues);
			nonInsertableNoSet.add(temRowValues);
			nonInsertableNoSet.add(temColValues);
		}
		nonInsertableNoSet.remove(0);
		
		//System.out.println("nonInsertableNoSet : "+nonInsertableNoSet);
		
		LinkedHashSet<Integer> insertableNoSet = new LinkedHashSet<Integer>();
		//Set<Integer> insertableNoSet = new HashSet<Integer>();
		for (int k = 1; k <= this.sudokoState.length; k++)
		{
			insertableNoSet.add(k);
		}
			
		for(Integer a :nonInsertableNoSet)
		{
			insertableNoSet.remove(a);
		}
		
		//System.out.println("insertableNoSet :"+insertableNoSet);
		
		return insertableNoSet;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		System.out.print("Enter the size of Sudoko :");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		System.out.println("size :=>> "+size);
		
		GenericSudoko n = new GenericSudoko(size);
		n.display();
		//System.out.println("n.getInsertableNoSet(0,0) := "+n.getInsertableNoSet(0,0));
		
		n.permuateSudoko(0,0,n.getInsertableNoSet(0, 0));
		
	}
	
	
	public void permuateSudoko(int i,int j,LinkedHashSet<Integer> insertableNoSet)
	{
		insertableNoSet = getInsertableNoSet(i,j);
		System.out.println("(i,j) : ("+i+","+j+")   Options : "+insertableNoSet);
		
		//next index to be inserted.
		if(j < (size))
		{
			if(j==(size-1))
			{
				if(i != (size-1))
				{	
					i++;
					j=0;
					permuateSudoko(i,j,insertableNoSet);
				}else
				{	
					display();
				}	
			}else
			{
				j++;
				permuateSudoko(i,j,insertableNoSet);
			}
		}
	}
}
