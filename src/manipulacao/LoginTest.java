package manipulacao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	@Test
	public void testeLoginIncorreto_SomenteUsuario() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://quickloja.qualister.info/");
		
		driver.findElement(By.id("usuariologin")).sendKeys("admin");
		
		driver.findElement(By.cssSelector(".btn.btn-medium.btn-primary")).click();
		
		assertEquals("Usuário ou senha incorretos", driver.findElement(By.cssSelector(".alert.alert-error")).getText());
	}

}
