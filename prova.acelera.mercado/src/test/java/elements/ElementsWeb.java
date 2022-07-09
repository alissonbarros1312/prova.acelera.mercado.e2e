package elements;

import org.openqa.selenium.By;

public class ElementsWeb {

	private By valor = By.xpath("//div[@qa-auto='cart-price']");

	// getters
	public By getValor() {
		return valor;
	}

}
