package groups;

import org.testng.annotations.Test;

public class AddtoCart {
	
	@Test(groups= {"regreesion"})
	void addproduct()
	{
		System.out.println("Code for add product in cart");
	}
	
	@Test(groups= {"smoke"})
	void removeproduct()
	{
		System.out.println("Code for remove product in cart");
		
	}

}
