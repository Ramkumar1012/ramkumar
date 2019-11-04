package appobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageObjects extends BasePage {
	
	//@FindBy(xpath = ".//*[@id='block_top_menu']/ul/li[1]/a")
	//private WebElement tabWomen;
	
	@FindBy(xpath = ".//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement tabDresses;
	
	//@FindBy(xpath = ".//*[@id='block_top_menu']/ul/li[3]/a")
	//private WebElement tabTshirts;
	
	public HomepageObjects() {
		
		PageFactory.initElements(driver, this);
		}
	//public void clickWomen() {
		//tabWomen.click();
		
	//}
    
	public void clickDresses() {
		tabDresses.click();
		
	}
	
	//public void clickTshirts() {
		//tabTshirts.click();
	//}
	
	//{
		//tabDresses.click();
	//}
	
	@FindBy(xpath = ".//*[@id='uniform-layered_id_attribute_group_1']" )
	private WebElement minisize;
	
	public WebElement smallsize() {
		return minisize;
		}
    @FindBy(xpath = ".//*[@id='uniform-layered_id_attribute_group_2']")
    private WebElement midsize;
    
    public WebElement mediumsize() {
		return midsize;
    }
    @FindBy(xpath = ".//*[@id='uniform-layered_id_attribute_group_3']")
    private WebElement bigsize;	
    
    public WebElement largesize() {
		return bigsize; 
    
	
	}
    }
	


