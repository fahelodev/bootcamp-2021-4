package pom.grupo5.test;

import desafio.grupo5.Alojamiento;
import org.junit.Test;
import pom.grupo5.base.TestBase;
import pom.grupo5.pages.VFHomeAlojamiento;

public class tc005_busquedaAlojamientoSinFecha extends TestBase {
    @Test
    public void atc005() throws InterruptedException {
        VFHomeAlojamiento alojamiento = new VFHomeAlojamiento(driver, wait);
        alojamiento.goAlojamientos();
        alojamiento.selectDestino("Bari");
        alojamiento.checkNoFecha();
        alojamiento.makeSearch();
    }
}
