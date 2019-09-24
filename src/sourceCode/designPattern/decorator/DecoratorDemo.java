package sourceCode.designPattern.decorator;

public class DecoratorDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}

interface Food
{
	public String prepareFood();
	public double foodPrice();
}

class VegFood implements Food
{
	@Override
	public String prepareFood()
	{
		return "Veg Food";
	}

	@Override
	public double foodPrice()
	{
		return 50.3;
	}
}

abstract class FoodDecorator implements Food
{
	private Food newFood;
	public FoodDecorator(Food newFood)
	{
		this.newFood = newFood;
	}
	public String prepareFood()
	{
		return newFood.prepareFood();
	}
	public double foodPrice()
	{
		return newFood.foodPrice();
	}
}

class NonVegFood extends FoodDecorator
{
	public NonVegFood(Food newFood)
	{
		super(newFood);
	}
	public String prepareFood()
	{
		return super.prepareFood()+" With Chicken Masala";
	}
	public double foodPrice()
	{
		return super.foodPrice()+150;
	}
}

class ChineaseFood extends FoodDecorator
{
	public ChineaseFood(Food newFood)
	{
		super(newFood);
	}
	
	public String prepareFood()
	{
		return super.prepareFood()+"With Fried Rice and Manchurian";
	}
	public double foodPrice()
	{
		return super.foodPrice()+40.44;
	}
}

