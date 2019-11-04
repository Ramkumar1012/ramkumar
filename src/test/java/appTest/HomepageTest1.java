package appTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import appobjects.HomepageObjects;

public class HomepageTest1 {
	
	//HomepageObjects run1;
	HomepageObjects run2;
	
	
	public HomepageTest1() {
		//run1 = new HomepageObjects();
		run2 = new HomepageObjects();
	}
	
	//@Test
	//public void verifyTabNavigation() {
		//run1.clickWomen();
		//Assert.assertTrue(run1.getTitlte().contains("Women"));
		//run1.clickDresses();
		//Assert.assertTrue(run1.getTitlte().contains("Dresses"));
		//run1.clickTshirts();
		///Assert.assertTrue(run1.getTitlte().contains("T-shirts"));
		
	//}
	
	@Test
	public void verifysize() { 
	run2.clickDresses();
	
		
		Assert.assertTrue(run2.elementFound(run2.mediumsize()));
        Assert.assertTrue(run2.elementFound(run2.mediumsize()));
		Assert.assertTrue(run2.elementFound(run2.largesize()));
		
	}
	
}
	


