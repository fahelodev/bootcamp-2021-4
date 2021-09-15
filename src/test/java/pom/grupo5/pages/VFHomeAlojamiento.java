package pom.grupo5.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.grupo5.base.SeleniumBase;

public class VFHomeAlojamiento extends SeleniumBase {
    By botonAlojamiento = By.xpath("//*[contains(@class, 'shifu-3-button-circle HOTELS ')]");
    By imputDestino = By.xpath("//*[contains(@class, 'sbox-destination sbox-primary ')]");
    By checkFechaNoDefinida = By.xpath("//body/app-root[1]/app-searchbox-container[1]/div[1]/app-searchbox[1]/div[4]/div[1]/div[1]/div[3]/div[2]/div[5]/label[1]/i[1]");
    By search = By.xpath("//body/app-root[1]/app-searchbox-container[1]/div[1]/app-searchbox[1]/div[4]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/a[1]/i[1]");
    By imputFechas = By.xpath("//*[contains(@class, 'sbox-checkin-date-container')]");
    By fechaEntrada = By.xpath("//body/div[1]/div[1]/div[5]/div[2]/div[4]/span[3]");
    By fechaSalida = By.xpath("//body/div[1]/div[1]/div[5]/div[2]/div[4]/span[10]");
    By btnAplicar = By.xpath("//body/div[1]/div[1]/div[6]/div[2]/button[2]");
    By buscar = By.xpath("//*[@id=\"sbox-main\"]/div/div/div[3]/div[2]/div[4]");
    By checkFlexible = By.xpath("/html/body/aloha-app-root/aloha-results/div/div/div/div[1]/aloha-filter-list/div/ul/li[4]/aloha-filter/aloha-checkbox-filter/ul/li[4]/span/span[1]/aloha-checkbox/span/label/em/span");
    By checkEstrellas = By.xpath("//body/aloha-app-root[1]/aloha-results[1]/div[1]/div[1]/div[1]/div[1]/aloha-filter-list[1]/div[1]/ul[1]/li[4]/aloha-filter[1]/aloha-checkbox-filter[1]/ul[1]/li[1]/span[1]/span[1]/aloha-checkbox[1]/span[1]/label[1]/i[1]");
    By checkDesayuno = By.xpath("//body/aloha-app-root[1]/aloha-results[1]/div[1]/div[1]/div[1]/div[1]/aloha-filter-list[1]/div[1]/ul[1]/li[4]/aloha-filter[1]/aloha-checkbox-filter[1]/ul[1]/li[3]/span[1]/span[1]/aloha-checkbox[1]/span[1]/label[1]/i[1]");
    By hotel = By.xpath("/html/body/aloha-app-root/aloha-results/div/div/div/div[2]/div[2]/aloha-list-view-container/div[2]/div[4]/aloha-cluster-container/div/div/div[2]/aloha-cluster-pricebox-container/div/div[2]/div[2]/aloha-button/button");
    By btnByReserva = By.xpath("//*[@id=\"roompacks-container-wrapper\"]/aloha-roompacks-container/aloha-roompacks-grid-container/div[2]/div[2]/aloha-reservation-summary-container/div/aloha-next-step-button/aloha-button/button/em");
    By btnSiguiente = By.xpath("//*[@id=\"pricebox-overlay\"]/div[1]/div/button/em");
    By btnBanco = By.xpath("//body/af-app[1]/div[1]/div[1]/div[1]/checkout-form[1]/div[1]/form-component[1]/form[1]/div[1]/payment-component[1]/div[1]/div[1]/payment-method[1]/div[1]/payment-method-selector-container[1]/prepaid-payment-container[1]/div[1]/div[1]/div[2]/card-container[1]/div[1]/div[2]/card-storage[1]/div[1]/card-empty-slot[1]/div[1]/div[1]/div[1]/div[1]");
    By imputBanco = By.xpath("//*[@id=\"checkout-content\"]/div[1]/payment-component/div/div[1]/payment-method/div/payment-method-selector-container/prepaid-payment-container/div/div/div[2]/card-container/div/div[2]/card-storage/modal-component/div/div[2]/payment-option-selector/div[2]/div/div/div/input");
    By btnSantander = By.xpath("//*[@id=\"checkout-content\"]/div[1]/payment-component/div/div[1]/payment-method/div/payment-method-selector-container/prepaid-payment-container/div/div/div[2]/card-container/div/div[2]/card-storage/modal-component/div/div[2]/payment-option-selector/div[2]/ul/li[1]/span");
    By btnMastercard = By.xpath("//*[@id=\"checkout-content\"]/div[1]/payment-component/div/div[1]/payment-method/div/payment-method-selector-container/prepaid-payment-container/div/div/div[2]/card-container/div/div[2]/card-storage/modal-component/div/div[2]/payment-option-selector/div[2]/ul/li[2]/span");
    By btnUnPago = By.xpath("//*[@id=\"checkout-content\"]/div[1]/payment-component/div/div[1]/payment-method/div/payment-method-selector-container/prepaid-payment-container/div/div/div[2]/card-container/div/div[2]/card-storage/modal-component/div/div[2]/payment-option-selector/div[2]/ul/li[1]");
    By numeroTarjeta = By.xpath("//*[@id=\"formData.paymentData.cardPayments[0].card.number\"]/div/input");
    By titularTarjeta = By.xpath("//*[@id=\"formData.paymentData.cardPayments[0].card.holderName\"]/div/input");
    By vencimientoTarjeta = By.xpath("//*[@id=\"formData.paymentData.cardPayments[0].card.expirationDate\"]/div/input");
    By codSeg = By.xpath("//*[@id=\"formData.paymentData.cardPayments[0].card.securityCode\"]/div/input");
    By DNI = By.xpath("//*[@id=\"formData.paymentData.cardPayments[0].cardHolderIdentification.number\"]/div/input");
    By titularBoleta = By.xpath("//input-component-v2[1]/div[1]/div[1]/div[1]/input[1]");
    By selectDocumento = By.xpath("//select-component-v2[1]/div[1]/div[1]/div[1]/div[1]/select[1]");
    By ingresarPasaporte =  By.xpath("//input[@id='invoice-fiscal-identification-number-0']");
    By argentina = By.xpath("//select[@id='invoice-fiscal-identification-issueCountry-0']");
    By direccionImput = By.xpath("/html[1]/body[1]/af-app[1]/div[1]/div[1]/div[1]/checkout-form[1]/div[1]/form-component[1]/form[1]/div[1]/payment-component[1]/div[1]/div[1]/payment-method[1]/div[1]/payment-method-selector-container[1]/prepaid-payment-container[1]/div[1]/div[2]/invoice-component[1]/div[1]/div[2]/div[1]/invoice-default-component[1]/div[1]/address[1]/div[1]/div[4]/div[1]/address-street-input[1]/div[1]/div[1]/input-component-v2[1]/div[1]/div[1]/div[1]/input[1]");
    By nOmbre = By.xpath("/html[1]/body[1]/af-app[1]/div[1]/div[1]/div[1]/checkout-form[1]/div[1]/form-component[1]/form[1]/div[1]/travelers[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/traveler[1]/div[1]/div[2]/div[1]/div[1]/traveler-first-name-input[1]/div[1]/div[1]/input-component-v2[1]/div[1]/div[1]/div[1]/input[1]");
    By subName = By.xpath("/html[1]/body[1]/af-app[1]/div[1]/div[1]/div[1]/checkout-form[1]/div[1]/form-component[1]/form[1]/div[1]/travelers[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/traveler[1]/div[1]/div[2]/div[1]/div[1]/traveler-last-name-input[1]/div[1]/div[1]/input-component-v2[1]/div[1]/div[1]/div[1]/input[1]");

    public VFHomeAlojamiento(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public void goAlojamientos (){
        goToUrl("https://www.viajesfalabella.cl");
        click(botonAlojamiento);
    }
    public void selectDestino(String destino) throws InterruptedException {
        setText(imputDestino, destino);
        Thread.sleep(500);
        setKeyEnter(imputDestino);
    }
    public void checkNoFecha(){
        click(checkFechaNoDefinida);
    }
    public void makeSearch(){
        click(search);
        waitUrlContains("hoteles-en-san+carlos+de+bariloche?");
    }
    public void goToResults () throws InterruptedException {
        goToUrl("https://www.viajesfalabella.cl/hoteles/hl/901/i1/hoteles-en-san+carlos+de+bariloche?from=SB&encodedProps=cGFnZT0xJnZpZXdNb2RlPWxpc3Q=#page=1&view=list");
        Thread.sleep(500);
    }
    public void selectFechas () throws InterruptedException {
        click(imputFechas);
        Thread.sleep(500);
        click(fechaEntrada);
        Thread.sleep(500);
        click(fechaSalida);
        click(btnAplicar);
        Thread.sleep(500);
    }
    public void buscar (){
        click(buscar);
    }
    public void checkFilters () throws InterruptedException {
        click(checkFlexible);
        Thread.sleep(3000);
        click(checkEstrellas);
        Thread.sleep(3000);
        click(checkDesayuno);
        Thread.sleep(3000);
    }
    public void clickHotel () throws InterruptedException {
        click(hotel);
        waitUrlContains("https://www.viajesfalabella.cl/accommodations/results/");
        Thread.sleep(3000);
        sWitchWindows();
        click(btnByReserva);
    }
    public void goToCredit() throws  InterruptedException {
        goToUrl("https://www.viajesfalabella.cl/trips/xs/PC002e9fbcbff84ae7ab2004685923301a27195623?searchParams=SC8yMDIxLTEwLTEwLzIwMjEtMTAtMTcvQ0lUXzkwMS8y&searchId=56a29a98-5377-4608-9a66-a3e73357e6f6&stepNum=0&locale=es-CL&dc=false&tx=true&d=aHR0cHM6Ly93d3cudmlhamVzZmFsYWJlbGxhLmNsL2FjY29tbW9kYXRpb25zL2RldGFpbC8yNjM2NDAvMjAyMS0xMC0xMC8yMDIxLTEwLTE3LzI%2Fc2VsZWN0ZWRfcm9vbV9wYWNrPTEzNDcyODgzMTEmc2VhcmNoSWQ9NTZhMjlhOTgtNTM3Ny00NjA4LTlhNjYtYTNlNzMzNTdlNmY2JnRocm91Z2hSZXN1bHRzPXRydWU%3D&currency=CLP&flow=H&oTid=PCe817637372f04b81a332013c1365853427195623");
        click(btnSiguiente);
        Thread.sleep(7000);
        waitUrlContains("https://www.viajesfalabella.cl/checkout/");
    }
    public void selectBanco(String banco) throws InterruptedException{
        click(btnBanco);
        Thread.sleep(2000);
        setText(imputBanco, banco);
        Assert.assertEquals(banco, getAttributeValue(imputBanco));
        Thread.sleep(500);
        click(btnSantander);
        click(btnMastercard);
        click(btnUnPago);
    }
    public void imputCreditNumber(String number){
        setText(numeroTarjeta, number);
        Assert.assertEquals(number, getAttributeValue(numeroTarjeta));
    }
    public void imputTitular(String titular){
        setText(titularTarjeta, titular);
        Assert.assertEquals(titular, getAttributeValue(titularTarjeta));
    }
    public void imputVencimiento(String vencimiento){
        setText(vencimientoTarjeta, vencimiento);
        Assert.assertEquals(vencimiento, getAttributeValue(vencimientoTarjeta));
    }
    public void imputCode(String code){
        setText(codSeg, code);
        Assert.assertEquals(code, getAttributeValue(codSeg));

    }
    public void imputDNI(String dni) throws InterruptedException {
        setText(DNI, dni);
        Assert.assertEquals(dni, getAttributeValue(DNI));
    }
    public void imputBoletaTitular(String boleta){
        setText(titularBoleta, boleta);
        Assert.assertEquals(boleta, getAttributeValue(titularBoleta));
    }
    public void selectPasaporte(){
        Select pasaporte = getSelect(selectDocumento);
        pasaporte.selectByVisibleText("Pasaporte");
    }
    public void imputPasaporte(String pasaporte){
        setText(ingresarPasaporte, pasaporte);
        Assert.assertEquals(pasaporte, getAttributeValue(ingresarPasaporte));
    }
    public void selectCountry(){
        Select pais = getSelect(argentina);
        pais.selectByVisibleText("Argentina");
    }
    public void imputDireccion(String direccion){
        setText(direccionImput, direccion);
        Assert.assertEquals(direccion, getAttributeValue(direccionImput));
    }
    public void imputName(String nombre){
        setText(nOmbre, nombre );
        Assert.assertEquals(nombre, getAttributeValue(nOmbre));
    }
    public void imputSubName(String apellido){
        setText(subName, apellido);
        Assert.assertEquals(apellido, getAttributeValue(subName));
    }
}
