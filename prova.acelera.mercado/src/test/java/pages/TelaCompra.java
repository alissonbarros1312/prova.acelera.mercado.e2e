package pages;

import org.openqa.selenium.By;

import conexoes.DriverFactory;

public class TelaCompra extends DriverFactory {

	public void selecionarTamanho(int tam) {
		By tamanho = By.xpath("//a[@data-size='size-" + tam + "']");
		driver.findElement(tamanho).click();
	}

	public void comprar() {

		try {
			By btn = By.xpath("//button[@id='buy-button-now']");
			driver.findElement(btn).click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			By btn = By.xpath("//button[@id='buy-button-now']");
			driver.findElement(btn).click();
		}
	}

}
