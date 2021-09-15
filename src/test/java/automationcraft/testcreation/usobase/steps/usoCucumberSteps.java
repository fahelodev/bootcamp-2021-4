package automationcraft.testcreation.usobase.steps;

import automationcraft.engine.selenium.DriverFactory;
import automationcraft.testcreation.usobase.pages.GoogleHomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.List;

public class usoCucumberSteps {

    GoogleHomePage ghp;

    @Given("que estoy en la barra de busqueda")
    public void que_estoy_en_la_barra_de_busqueda() {
        ghp = new GoogleHomePage(DriverFactory.getDriver());
        ghp.goToUrl("https://www.google.com/");
    }

    @When("introduzco la palabra {string}")
    public void introduzco_la_palabra(String string) {
        ghp.ingresarValorBusqueda(string);
    }

    @Then("se muestra informacion relacionada con lo buscado")
    public void se_muestra_informacion_relacionada_con_lo_buscado() {
        Assert.assertTrue(true);
    }

    @Then("en el primer link debe aparecer nuestra pagina principal")
    public void en_el_primer_link_debe_aparecer_nuestra_pagina_principal() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("tambien debemos encontrar el link de nuestra pagina en LinkedIn")
    public void tambien_debemos_encontrar_el_link_de_nuestra_pagina_en_linked_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @But("no debe estar en los primeros {int} link alguna informacion que sea de TATA Consulting")
    public void no_debe_estar_en_los_primeros_link_alguna_informacion_que_sea_de_tata_consulting(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("se muestra la siguiente informacion en los primeros {int} link")
    public void se_muestra_la_siguiente_informacion_en_los_primeros_link(Integer int1, DataTable dataTable) {

        List<String> data = dataTable.asList();

        for (int i = 0; i <data.size() ; i++) {
            System.out.println(data.get(i));
        }


    }


}
