package Driver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import DriverStrategy.DriverStrategy;
import DriverStrategy.DriverStrategyImplementer;
import Utils.Constans;

public class DriverSingleton {

	private static DriverSingleton instance = null;
	private static WebDriver driver;
	
	private DriverSingleton(String driver) {
		instantiate(driver);
	}
	
	public WebDriver instantiate(String strategy) {
		DriverStrategy driverStrategy =DriverStrategyImplementer.choosesStrategy(strategy);
		driver = driverStrategy.setStrategy();
		driver.manage().timeouts().implicitlyWait(Constans.TIMEOUT,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public static DriverSingleton getInstance(String driver) {
		if(instance == null) {
			instance = new DriverSingleton(driver);
		}
		
		return instance;
	}
	
	public static WebDriver getDriver() {
		
		return driver;
	}
	public static void CloseObjectInstance() {
		driver.close();
	}
}
