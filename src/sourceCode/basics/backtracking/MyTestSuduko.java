package sourceCode.basics.backtracking;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MyTestSuduko
{

	public static void main(String[] args)
	{
		MySudoko m = new MySudoko();
		m.displaySudoko();
		//System.out.println(m.validatePuttingValue(0, 1, 7));
		//System.out.println(m.getInsertableNoSet(0, 1));
		//System.out.println(m.getInsertableNoSet(0, 4));
		m.printAvailableCandidateForInsertion();
		
	}

}

class MySudoko
{
	int sudoko[][] = new int[9][9];

	public MySudoko()
	{
		sudoko[0][0] = 3;
		sudoko[0][2] = 6;
		sudoko[0][3] = 5;
		sudoko[0][5] = 8;
		sudoko[0][6] = 4;

		sudoko[1][0] = 5;
		sudoko[1][1] = 2;

		sudoko[2][1] = 8;
		sudoko[2][2] = 7;
		sudoko[2][7] = 3;
		sudoko[2][8] = 1;

		sudoko[3][2] = 3;
		sudoko[3][4] = 1;
		sudoko[3][7] = 8;

		sudoko[4][0] = 9;
		sudoko[4][3] = 8;
		sudoko[4][4] = 6;
		sudoko[4][5] = 3;
		sudoko[4][8] = 5;

		sudoko[5][1] = 5;
		sudoko[5][4] = 9;
		sudoko[5][6] = 6;

		sudoko[6][0] = 1;
		sudoko[6][1] = 3;
		sudoko[6][6] = 2;
		sudoko[6][7] = 5;

		sudoko[7][7] = 7;
		sudoko[7][8] = 4;

		sudoko[8][2] = 5;
		sudoko[8][3] = 2;
		sudoko[8][5] = 6;
		sudoko[8][6] = 3;
	}

	public void displaySudoko()
	{
		String currentValue = "  ";

		for (int i = 0; i < sudoko.length; i++)
		{
			for (int j = 0; j < sudoko[i].length; j++)
			{
				currentValue = currentValue + "  " + sudoko[i][j];
			}
			System.out.println(currentValue);
			currentValue = "  ";
		}
	}

	public boolean validatePuttingValue(int rowIndex, int colIndex, int value)
	{
		//System.out.println(" rowIndex=" + rowIndex + ", colIndex=" + colIndex+ ", value=" + value);
		int temRowValues, temColValues;
		boolean returnFlag = true;

		for (int k = 0; k < this.sudoko.length; k++)
		{
			temRowValues = sudoko[rowIndex][k];
			temColValues = sudoko[k][colIndex];
			if (value == temRowValues || value == temColValues)
			{
				returnFlag = false;
				break;
			}
		}
		return returnFlag;
	}

	public Set<Integer> getInsertableNoSet(int rowIndex, int colIndex)
	{
		//System.out.println(" rowIndex=" + rowIndex + ", colIndex=" + colIndex);
		
		Set<Integer> nonInsertableNoSet = new HashSet<Integer>();
		int temRowValues, temColValues;

		for (int k = 0; k < this.sudoko.length; k++)
		{
			temRowValues = sudoko[rowIndex][k];
			temColValues = sudoko[k][colIndex];
			nonInsertableNoSet.add(temRowValues);
			nonInsertableNoSet.add(temColValues);
		}
		nonInsertableNoSet.remove(0);
		
		//System.out.println("nonInsertableNoSet : "+nonInsertableNoSet);
		Set<Integer> insertableNoSet = new HashSet<Integer>();
		Collections.addAll(insertableNoSet, new Integer("1"), new Integer("2"),
				new Integer("3"), new Integer("4"), new Integer("5"),
				new Integer("6"), new Integer("7"), new Integer("8"),
				new Integer("9"));
		
		for(Integer a :nonInsertableNoSet)
		{
			insertableNoSet.remove(a);
		}
		
		//System.out.println("insertableNoSet :"+insertableNoSet);
		
		return insertableNoSet;
	}
	
	public void printAvailableCandidateForInsertion()
	{
		for(int i= 0;i< sudoko.length;i++)
		{
			for(int j=0;j<sudoko[i].length;j++)
			{
				System.out.println("getInsertableNoSet("+i+","+j+")      :: " +getInsertableNoSet(i,j));
			}
		}
	}
	
	public void permutateSudoko(MySudoko sudoko[][],int row,int col)
	{
		Set<Integer> intSet ;
		for(int i= 0;i< sudoko.length;i++)
		{
			for(int j=0;j<sudoko[i].length;j++)
			{
				intSet = getInsertableNoSet(i,j);
				/*int a[] = (int[])intSet.toArray();
				//System.out.println("getInsertableNoSet("+i+","+j+")      :: " +getInsertableNoSet(i,j));
				for(int k=0 ;k< intSet.size();k++)
				{
					sudoko[i][j]= intSet.;
					
				}*/
			}
		}
	}

}