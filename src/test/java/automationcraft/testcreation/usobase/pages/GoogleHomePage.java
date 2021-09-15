package automationcraft.testcreation.usobase.pages;

import automationcraft.engine.selenium.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage extends SeleniumBase {

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    //localizadores
    By barraBusqueda = By.name("q");

    //Keyword Driven
    public void ingresarValorBusqueda(String busqueda){
        type(busqueda,barraBusqueda);
        typeKey(Keys.ENTER,barraBusqueda);
    }
}
