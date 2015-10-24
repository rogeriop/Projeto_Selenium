package manipulacao;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;

public class NovoPedidoTest {

	@Test
	public void test() {
		WebDriver driver = new FirefoxDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get("http://quickloja.qualister.info/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("usuariologin")).sendKeys("selenium");;
		driver.findElement(By.id("usuariosenha")).sendKeys("teste");;
		
		driver.findElement(By.cssSelector(".btn.btn-medium.btn-primary")).click();

		driver.findElement(By.linkText("Pedidos")).click();
		driver.findElement(By.linkText("Novo pedido")).click();
		
		Select FormaDePagamento = new Select(driver.findElement(By.id("formaid")));
		FormaDePagamento.selectByVisibleText("Cartão de Débito");
		
		// Escolhe o cliente
		driver.findElement(By.id("clientenome")).sendKeys("cliente");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("li[data-value='Cliente 2']")));
		
		driver.findElement(By.cssSelector("li[data-value='Cliente 2']")).click();
		
		// Preenchimento de Dados de Entrega		
		driver.findElement(By.linkText("Dados de entrega")).click();
		driver.findElement(By.name("pedidoendereco")).sendKeys("Rua Mineirolandia");
		driver.findElement(By.name("pedidobairro")).sendKeys("San Martin");
		driver.findElement(By.name("pedidocep")).sendKeys("50761-629");
		driver.findElement(By.name("pedidocidade")).sendKeys("Recife");
		Select estado = new Select(driver.findElement(By.id("pedidoestado")));
		estado.selectByVisibleText("Pernambuco");

		// Preenchimento de Itens do Pedido
		driver.findElement(By.linkText("Itens do pedido")).click();
		
		// Escolhe o item Camisa Regata
		driver.findElement(By.id("produtonome")).sendKeys("Camisa Regata");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("li[data-value='Camisa Regata']")));
		driver.findElement(By.cssSelector("li[data-value='Camisa Regata']")).click();
		
		// Preenche a quantidade
		wait.until(ExpectedConditions.elementToBeClickable(By.id("produtoquantidade")));
		driver.findElement(By.id("produtoquantidade")).sendKeys("1");
		driver.findElement(By.id("adicionar")).click();
		
		// Escolhe o item Camisa Social
		driver.findElement(By.id("produtonome")).sendKeys("Camisa Social");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("li[data-value='Camisa Social']")));
		driver.findElement(By.cssSelector("li[data-value='Camisa Social']")).click();
		
		// Preenche a quantidade
		wait.until(ExpectedConditions.elementToBeClickable(By.id("produtoquantidade")));
		driver.findElement(By.id("produtoquantidade")).sendKeys("1");
		driver.findElement(By.id("adicionar")).click();
		
		
	}

}
