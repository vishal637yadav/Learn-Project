package sourceCode.basics.enums;

enum Day{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY,SATARDAY
}

public class EnumDemo1
{
	Day day ;
	
	public EnumDemo1(Day day)
	{
		this.day = day;
	}
	
	public void tellItLikeItIs()
	{
		switch(day)
		{
		case SUNDAY:case SATARDAY:
			System.out.println("Weekends are Awsome!!");
			break;
		case MONDAY:
			System.out.println("Monday are Bad!!");
			break;
		case FRIDAY:
			System.out.println("Friday are Better!!");
			break;
		default :
			System.out.println("Midweek days are so-so!!");
		}
	}
	
	public static void main(String[] args)
	{
		EnumDemo1 firstDay = new EnumDemo1(Day.MONDAY);
		firstDay.tellItLikeItIs();
		EnumDemo1 thirdDay = new EnumDemo1(Day.WEDNESDAY);
		thirdDay.tellItLikeItIs();
		EnumDemo1 fifthDay = new EnumDemo1(Day.FRIDAY);
		fifthDay.tellItLikeItIs();
		EnumDemo1 sixthDay = new EnumDemo1(Day.SATARDAY);
		sixthDay.tellItLikeItIs();
		EnumDemo1 seventhDay = new EnumDemo1(Day.SUNDAY);
		seventhDay.tellItLikeItIs();
		
	}

}
