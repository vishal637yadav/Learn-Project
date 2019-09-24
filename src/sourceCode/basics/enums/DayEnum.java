package sourceCode.basics.enums;

public enum DayEnum
{
	SUNDAY(1),MONDAY(2),TUESDAY(3),WEDNESDAY(4),THRUSDAY(5),FRIDAY(6),SATARDAY(7);
	private final int daySeq ;
	
	DayEnum(int daySeq)
	{
		this.daySeq = daySeq;
	}
	
	public int getDaySeq()
	{
		return daySeq;
	}
	
	public static DayEnum getEnum(int daySeq)
	{
		DayEnum result = null;
		
		if(daySeq == 1)
		{
			result = SUNDAY;
		}else if(daySeq ==2)
		{
			result = MONDAY;
		}else if(daySeq ==3)
		{
			result = TUESDAY;
		}else if(daySeq ==4)
		{
			result = WEDNESDAY;
		}else if(daySeq ==5)
		{
			result = THRUSDAY;
		}else if(daySeq ==6)
		{
			result = FRIDAY;
		}else if(daySeq ==7)
		{
			result = SATARDAY;
		}
		return result;
	}
	
	public static void main(String[] args)
	{
		System.out.println("this is main class!!"); 
		System.out.println("DayEnum.MONDAY.getDaySeq()------------=>>"+DayEnum.MONDAY.getDaySeq());
		System.out.println("DayEnum.MONDAY.getDaySeq()------------=>>"+getEnum(4));
		System.out.println("DayEnum.MONDAY.getDaySeq()------------=>>"+DayEnum.valueOf("SUNDAY"));
		System.out.println("DayEnum.MONDAY.getDaySeq()------------=>>"+DayEnum.SUNDAY.name());
		
		
	}

}
