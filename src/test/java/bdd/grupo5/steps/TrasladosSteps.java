package bdd.grupo5.steps;

import bdd.grupo5.bases.AppHook;
import bdd.grupo5.pages.VFHomeTraslados;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TrasladosSteps {
    VFHomeTraslados trasladosPage;
    @Given("estoy en un navegador en la seccion de traslados de ViajesFalabella")
    public void estoy_en_un_navegador_en_la_seccion_de_traslados_de_viajes_falabella() {
        trasladosPage = new VFHomeTraslados(AppHook.getDriver());
        trasladosPage.goToTraslados();
    }

    @When("introduzco la palabra {string} en el campo hasta")
    public void introduzco_la_palabra_en_el_campo_hasta(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("introduzco como fecha el dia Mar, {int} sep {int}")
    public void introduzco_como_fecha_el_dia_mar_sep(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("el navegador muestra una alerta de los campos faltantes")
    public void el_navegador_muestra_una_alerta_de_los_campos_faltantes() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
