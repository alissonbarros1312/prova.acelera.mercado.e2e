package prova.teste.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TesteApi {

	String baseUrl = "https://reqres.in";
	Response response = RestAssured.get(baseUrl + "/api/users/2");

	@Test
	public void validarStatusCode() {
		int code = response.getStatusCode();
		assertEquals(200, code);
	}

	@Test
	public void validarEmail() {
		String body = response.asPrettyString();
		assertTrue(body.contains("janet.weaver@reqres.in"));
	}

}
