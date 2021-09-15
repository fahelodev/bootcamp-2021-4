package pom.grupo5.test;

import com.sun.rmi.rmid.ExecOptionPermission;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.grupo5.base.SeleniumBase;
import pom.grupo5.base.TestBase;
import pom.grupo5.pages.VFHomeAlojamiento;

public class tc007_busquedaAlojamientoIngresoTarjeta extends TestBase {
    @Test
    public void atc007() throws InterruptedException {
        VFHomeAlojamiento alojamiento = new VFHomeAlojamiento(driver, wait);
        alojamiento.goToCredit();
        alojamiento.selectBanco("San");
        alojamiento.imputCreditNumber("0000 0000 0000 0000");
        alojamiento.imputTitular("Roberto Nuñez");
        alojamiento.imputVencimiento("04/32");
        alojamiento.imputCode("511");
        alojamiento.imputDNI("45000000");
    }
}