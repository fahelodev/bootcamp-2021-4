package pom.grupo3.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.grupo3.base.SeleniumBase;

public class VFHomePageG3 extends SeleniumBase {

    public VFHomePageG3(WebDriver driver) {
        super(driver);
    }

    final String PPL_URL = "https://www.viajesfalabella.cl/";
    final String ALOJAMIENTOS_URL = "https://www.viajesfalabella.cl/hoteles/";

    By btnAlojamientos = By.xpath("//a[@product=\"HOTELS\"]");

    public void goToHome(){
        goToUrl(PPL_URL);
        Assert.assertEquals(PPL_URL, URLactual());
    }

    public void goToAlojamientos(){
        click(btnAlojamientos);
        Assert.assertEquals(ALOJAMIENTOS_URL, URLactual());
    }


}
