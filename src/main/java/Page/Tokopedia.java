package Page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Driver.DriverSingleton;

public class Tokopedia {

private WebDriver driver;
	
	public Tokopedia() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@class=\"css-1wc186l e110g5pc0\"]")
	private WebElement searchTokopedia;
	@FindBy(xpath = "//button[@aria-label='Laman 9']")
	private WebElement lastItem;
	@FindBy(xpath = "//span[normalize-space()='Menampilkan 481 - 505 barang dari total 505 untuk']")
	private WebElement totalItem;
	
	public void search(String input) {
		searchTokopedia.sendKeys(input,Keys.ENTER);
	}
	
	public void lastitem() {
		lastItem.click();
	}
	
	public String Cektotalitem() {
		return totalItem.getText();
		
	}
	
}
