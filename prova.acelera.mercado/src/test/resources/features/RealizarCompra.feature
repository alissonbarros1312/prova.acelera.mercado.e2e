#Author: e2etreinamentos@e2etreinamentos.com.br

@allTest
Feature: Realizar compra de um produto
  Como usuario quero realizar uma compra para validar o site

  Scenario: Realizar compra
    Given eu esteja no site "https://www.shoestock.com.br/"
    And clicar no menu novidades
    And selecionar um produto
    When clicar em comprar
    Then valido a url "https://www.shoestock.com.br/novo-cart"
    And valido valor da compra
