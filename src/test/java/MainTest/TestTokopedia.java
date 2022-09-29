package MainTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import Page.Tokopedia;
import MainTest.Hooks;
import Utils.Constans;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestTokopedia {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private Tokopedia tokpedia = new Tokopedia();
	
	public TestTokopedia() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}

	@When("User go to web tokopedia")
	public void user_go_to_web_tokopedia() {
		driver.get(Constans.URL);
		extentTest.log(LogStatus.PASS, "User go to web tokopedia");
	}
	
	@Then("User search item {string}")
	public void user_search_item(String input) {
		tokpedia.search(input);
		Hooks.delay(3);
		extentTest.log(LogStatus.PASS, "User search item {string}");
	}
	
	@And("User move to last item")
	public void user_move_to_last_item() {
		Hooks.scroll(3000);
		Hooks.delay(2);
		tokpedia.lastitem();
		extentTest.log(LogStatus.PASS, "User move to last item");
	}
	
	@And("Check result")
	public void check_result() {
		assertEquals(tokpedia.Cektotalitem(),"Menampilkan 481 - 505 barang dari total 505 untuk");
		System.out.println(tokpedia.Cektotalitem());
		extentTest.log(LogStatus.PASS, "Check result");
	}
}
