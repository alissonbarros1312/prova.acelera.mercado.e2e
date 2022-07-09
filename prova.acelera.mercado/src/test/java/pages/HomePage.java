package pages;

import org.openqa.selenium.By;

import conexoes.DriverFactory;

public class HomePage extends DriverFactory {

	public void selecionarMenu(String id) {
		driver.findElement(By.xpath("//a[@id='" + id + "']")).click();
	}

}
