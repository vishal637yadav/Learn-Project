package sourceCode.java8.stream;

import java.util.ArrayList;
import java.util.List;

class Product
{
	int id;
	String name;
	float price;
	
	Product(int id,String name,float price)
	{
		this.id= id;
		this.name=name;
		this.price = price;
	}
	
    public int getId() {  
        return id;  
    }  
    public String getName() {  
        return name;  
    }  
    public float getPrice() {  
        return price;  
    }  
}

public class FilterCollectionWithoutUsingStream
{

	public static void main(String[] args)
	{
		List<Product> productList = new ArrayList<Product>();
		//Adding Product List
		productList.add(new Product(11, "Water Bottel", 250f));
		productList.add(new Product(12, "Laptop", 50250f));
		productList.add(new Product(13, "Bike", 89250f));
		productList.add(new Product(14, "Mobile", 15500f));
		productList.add(new Product(15, "Coffee Machine", 60060f));
		productList.add(new Product(16, "Notpad", 250f));
		productList.add(new Product(17, "Wine Bottel", 540f));
		productList.add(new Product(18, "Red Wine", 660f));
		productList.add(new Product(19, "Whisky Bottel", 250f));
		productList.add(new Product(20, "Rum Bottel", 350f));
		productList.add(new Product(21, "Bear Bottel", 180f));
		productList.add(new Product(22, "Water Bottel", 250f));
		
		List<Float> priceList = new ArrayList<Float>();
		for(Product product : productList)
		{
			//Filter all products whose price is greater than 10000
			if(product.price>10000)
				priceList.add(product.price);
		}
		System.out.println("priceList :"+priceList);
	}

}
