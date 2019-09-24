package sourceCode.basics.dynamicProgramming;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main
{

	public static void main(String[] args)
	{
		/*{
		String s1 = "Hello";
		String s2 = new String(s1);
		String s3 = "HEllO";
		System.out.println(s1.equals(s2)+" "+s2.equals(s3));
		}
		*/
		int data[] = {1,2,-4,5,5,2,6,7,9,3,-1,4,-3,12,-4,6};
		System.out.println(getSeason(data));
		
		Way2Season(data);
	}
	
	public static String getSeason(int T[])
	{
		int seasonDataCount = T.length/4;
		String seasons[] = {"W","SP","SU","A"};
		int seasonsMax[] = new int[4];
		int curSeaLocMax = -999;
		int curSeaLocMin = 999;
		
		int WiMax=-999,SpMax=-999,SuMax=-999,AuMax=-999;
		
		int count = 0;
		for(int i = 0;i< T.length;i = i + seasonDataCount)
		{
			System.out.println("Season :"+i);
			for(int j = 0 ;j< seasonDataCount;j++)
			{
				curSeaLocMax = (curSeaLocMax>T[i+j]?curSeaLocMax :T[i+j]);
				System.out.println("curSeaLocMax : "+curSeaLocMax);
				
				curSeaLocMin = (curSeaLocMin<T[i+j]?curSeaLocMin :T[i+j]);
				System.out.println("curSeaLocMin : "+curSeaLocMin);
				
			}
			
			if(count ==0)
			{	
				WiMax = curSeaLocMax - curSeaLocMin;
				seasonsMax[0] = WiMax ;
				System.out.println("---------Wi------------- : "+WiMax);
				
			}else if(count ==1)
			{
				SpMax = curSeaLocMax - curSeaLocMin;
				seasonsMax[1] = SpMax ;
				System.out.println("---------Sp------------- : "+SpMax);
			}else if(count ==2)
			{
				SuMax = curSeaLocMax - curSeaLocMin;
				seasonsMax[2] = SuMax ;
				System.out.println("----------SuMax------------- : "+SuMax);
			}else if(count ==3)
			{
				AuMax = curSeaLocMax - curSeaLocMin;
				seasonsMax[3] = AuMax ;
				System.out.println("---------AuMax------------- : "+AuMax);
			}
			count++;
			
			curSeaLocMax = -999;
			curSeaLocMin = 999;
		}
		
		System.out.println(" WiMax : "+WiMax);
		System.out.println(" SpMax : "+SpMax);
		System.out.println(" SuMax : "+SuMax);
		System.out.println(" AuMax : "+AuMax);
		
		int max = -999,maxIndex = 0;
		for(int i=0 ;i< seasonsMax.length;i++)
		{
			if(max<seasonsMax[i])
				maxIndex = i;
			max = max > seasonsMax[i]?max :seasonsMax[i] ;
			System.out.println(" max  :  "+max);
		}
		
		return seasons[maxIndex];
	}
	
	public static String Way2Season(int T[])
	{
		//List<Integer> al = Arrays.asList(T);
		
		ArrayList<Integer> list = 	(ArrayList<Integer>)
							Arrays.stream(T)		// IntStream
									.boxed()  		// Stream<Integer>
									.collect(Collectors.toList());
		int seasonSize = list.size()/4;
		
		for(int i=0 ;i<seasonSize;i++)
		{
			System.out.println(" "+list.get(i));
		}
		
		ArrayList<Integer> list2 = 	(ArrayList<Integer>)
				Arrays.stream(T)		// IntStream
						.boxed()  		// Stream<Integer>
						.collect(Collectors.toList());
		

		return "dfdf";
	}

}
