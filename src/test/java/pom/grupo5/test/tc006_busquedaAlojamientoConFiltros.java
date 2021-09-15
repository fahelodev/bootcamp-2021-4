package pom.grupo5.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.grupo5.base.SeleniumBase;
import pom.grupo5.base.TestBase;
import pom.grupo5.pages.VFHomeAlojamiento;

public class tc006_busquedaAlojamientoConFiltros extends TestBase {
    @Test
    public void atc006() throws InterruptedException{
        VFHomeAlojamiento alojamiento = new VFHomeAlojamiento(driver, wait);
        alojamiento.goToResults();
        alojamiento.selectFechas();
        alojamiento.buscar();
        alojamiento.checkFilters();
        alojamiento.clickHotel();
    }
}
