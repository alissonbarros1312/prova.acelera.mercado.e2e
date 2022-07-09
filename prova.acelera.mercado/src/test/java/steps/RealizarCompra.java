package steps;

import elements.ElementsWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.Metodos;
import pages.TelaCompra;
import runner.Executa;

public class RealizarCompra {
	HomePage home = new HomePage();
	Metodos metodo = new Metodos();
	TelaCompra compra = new TelaCompra();
	ElementsWeb el = new ElementsWeb();

	@Given("eu esteja no site {string}")
	public void euEstejaNoSite(String text) {
		Executa.openBrowser(text);
	}

	@Given("clicar no menu novidades")
	public void clicarNoMenuNovidades() {
		home.selecionarMenu("Novidades");
	}

	@Given("selecionar um produto")
	public void selecionarUmProduto() {
		metodo.selecionarProduto(2);
	}

	@When("clicar em comprar")
	public void clicarEmComprar() {
		metodo.scroll(0, 350);
		compra.selecionarTamanho(35);
		compra.comprar();
	}

	@Then("valido a url {string}")
	public void validoAUrl(String url) {
		metodo.WaitElement(el.getValor());
		metodo.validarUrl(url);
	}

	@Then("valido valor da compra")
	public void validoValorDaCompra() {
		metodo.validarValorTotal();
		Executa.closeBrowser();
	}

}
