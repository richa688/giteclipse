package groups;

import org.testng.annotations.Test;

public class registrationtestcases {
	
	@Test(groups= {"regreesion","smoke"})
	void correctCredential()
	{
		System.out.println("in Correct Credential");
	}
	
	@Test(groups= {"smoke"})
	void existingID()
	{
		
		System.out.println("in existingid");
	}
	

}
