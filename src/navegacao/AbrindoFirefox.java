package navegacao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbrindoFirefox {

	@Test
	public void test() {

	WebDriver driver = new FirefoxDriver();
	
	driver.get("http://www.mauriciodenassau.edu.br");
	driver.navigate().to("https://pos.uninassau.edu.br");
	
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	driver.quit();
	
	}

}
