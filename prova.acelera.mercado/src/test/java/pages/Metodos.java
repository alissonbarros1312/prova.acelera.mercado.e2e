package pages;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import conexoes.DriverFactory;

public class Metodos extends DriverFactory {

	public void selecionarProduto(int prod) {
		driver.findElement(By.xpath("//*[@id=\"item-list\"]/div[1]/a[" + prod + "]/div")).click();
	}

	public void scroll(int n1, int n2) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(" + n1 + "," + n2 + ")");
		
		
	}

	public void validarUrl(String urlEsperada) {
		assertEquals(urlEsperada, driver.getCurrentUrl());
	}

	public void validarValorTotal() {
		String valorExperado = driver.findElement(By.xpath("//p[@qa-auto='product-new-price']")).getText();
		String valorTotal = driver.findElement(By.xpath("//div[@qa-auto='cart-price']")).getText();
		assertEquals(valorExperado, valorTotal);
	}

	public void esperar(int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}

	public void WaitElement(By element) {
		WebElement elemento = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(element));
	}

}
