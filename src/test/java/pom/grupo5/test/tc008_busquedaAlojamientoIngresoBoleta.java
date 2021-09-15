package pom.grupo5.test;

import com.sun.rmi.rmid.ExecOptionPermission;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.grupo5.base.SeleniumBase;
import pom.grupo5.base.TestBase;
import pom.grupo5.pages.VFHomeAlojamiento;

public class tc008_busquedaAlojamientoIngresoBoleta extends TestBase {
    @Test
    public void atc008() throws InterruptedException {
        VFHomeAlojamiento alojamiento = new VFHomeAlojamiento(driver, wait);
        alojamiento.goToCredit();
        alojamiento.selectBanco("San");
        alojamiento.imputBoletaTitular("Roberto Nuñez");
        alojamiento.selectPasaporte();
        alojamiento.imputPasaporte("1234512311");
        alojamiento.imputDireccion("Av Siempreviva 742");
        alojamiento.imputName("Roberto");
        alojamiento.imputSubName("Nuñez");
    }
}