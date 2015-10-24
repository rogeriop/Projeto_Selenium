package localizacao;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocalizacaoElementos {

	@Test
	public void test() {
		WebDriver driver = new FirefoxDriver();

		driver.get("http://quickloja.qualister.info/");

		driver.findElement(By.id("usuariologin"));
		driver.findElement(By.id("usuariosenha"));
		driver.findElement(By.cssSelector(".btn.btn-medium.btn-primary"));

		driver.quit();
		
	}

}
