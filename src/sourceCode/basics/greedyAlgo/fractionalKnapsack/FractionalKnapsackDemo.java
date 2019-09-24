package sourceCode.basics.greedyAlgo.fractionalKnapsack;

public class FractionalKnapsackDemo
{
	Items ar[];
	int capacity;
	
	public Items[] getAr()
	{
		return ar;
	}

	public void setArItems(Items ... items)
	{
		this.ar = items;
	}
	
	public void setAr(Items[] ar)
	{
		this.ar = ar;
	}

	public int getCapacity()
	{
		return capacity;
	}

	public void setCapacity(int capacity)
	{
		this.capacity = capacity;
	}

	void display()
	{
		for(Items a :this.ar)
		{
			System.out.println(a);
		}
	}
	public static void main(String[] args)
	{
		System.out.println("This is Main Method ()");
		
		FractionalKnapsackDemo a = new FractionalKnapsackDemo();
		FractionalKnapsackDemo.Items i1 = a.new Items(60,10);
		a.setArItems(i1,a.new Items(100,20),a.new Items(120,30));
		System.out.println("--------------");
		a.display();
		a.setCapacity(50);
		
		//1. Calculate the V/W ratio for each items
		//2. Arrange the items in desending of their V/W ration.
		//3. Start filling the knapsack starting from 1 item now.
		//   if capacity is greater than Weight the take whole item
		//   else calculate the portion of weight you can take to full fill the capacity.
		
		
		
	}
	
	
	class Items
	{
		int value;
		int weight;
		
		public Items(){}
		public Items(int value,int weight)
		{
			this.value = value;
			this.weight= weight;
		}
		public int getValue()
		{
			return value;
		}
		public void setValue(int value)
		{
			this.value = value;
		}
		public int getWeight()
		{
			return weight;
		}
		public void setWeight(int weight)
		{
			this.weight = weight;
		}
		
		public String toString()
		{
			return "{"+this.value+","+this.weight+"}";
		}
	}
}
