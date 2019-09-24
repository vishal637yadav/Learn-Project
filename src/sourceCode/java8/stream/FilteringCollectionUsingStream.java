package sourceCode.java8.stream;

import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FilteringCollectionUsingStream
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
	
		List<Float> productPriceList = productList.stream()
				.filter(p->p.price > 10000)  	//filtering data
				.map(p->p.price)				//fetching price
				.collect(Collectors.toList());	//collecting as list
		
		System.out.println(productPriceList);
		
		
		// This is more compact approach for filtering data  
		productList.stream()
		.filter(product -> product.price > 30000)  
		.forEach(product -> System.out.println(product.name));    
		
		// This is more compact approach for filtering data  
        Float totalPrice = productList.stream()  
                    	.map(product->product.price)  
                    	.reduce(0.0f,(sum, price)->sum+price);   // accumulating price  
        System.out.println("totalPrice : "+totalPrice);  
 
        // More precise code   
        float totalPrice2 = productList.stream()  
                			.map(product->product.price)  
                			.reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class  
        System.out.println("totalPrice2 :"+totalPrice2);
        
        // Using Collectors's method to sum the prices.  
        double totalPrice3 = productList.stream()  
	                        .collect(Collectors
	                        .summingDouble(product->product.price));  
        System.out.println("totalPrice3 :"+totalPrice3);  
        
        // max() method to get max Product price   
        Product productA = 	
        		productList.stream()  
                        	.max((product1, product2)->product1.price > product2.price ? 1: -1)
                        	.get(); 
        System.out.println("productA.price :"+productA.price);
        System.out.println("productA.name :"+productA.name);
        
        // min() method to get min Product price  
        Product productB = productList.stream()  
                .max((product1, product2)-> product1.price < product2.price ? 1: -1)
                .get();  
        System.out.println("productB.price :"+productB.price);
        System.out.println("productB.name :"+productB.name);
        
        // count number of products based on the filter  
        long count = productList.stream()  
                    .filter(product->product.price<30000)  
                    .count();  
        System.out.println("count : "+count);  
        
        // Converting product List into Set  
        Set<Float> productPriceList2 =   
        		productList.stream()  
        		.filter(product->product.price < 30000)   	// filter product on the base of price  
        		.map(product->product.price)  
        		.collect(Collectors.toSet());   			// collect it as Set(remove duplicate elements)  
        System.out.println(productPriceList2);
        
        // Converting Product List into a Map  
        Map<Integer,String> productPriceMap =   
        		productList.stream()  
                .collect(Collectors.toMap(p->p.id, p->p.name));  
        System.out.println(productPriceMap);  
        
        List<Float> productPriceList3 =   
        		productList.stream()  
                            .filter(p -> p.price > 30000) 	// filtering data  
                            .map(Product::getPrice)         // fetching price by referring getPrice method  
                            .collect(Collectors.toList());  // collecting as list  
        System.out.println(productPriceList3);  
   }
}
