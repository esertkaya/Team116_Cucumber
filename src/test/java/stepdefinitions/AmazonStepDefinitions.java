package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage=new AmazonPage();


    @Given("kullanici amazon anasayfaya gider")
    public void kullanici_amazon_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @Then("arama kutusuna Nutella yazip ENTER tusuna basar")
    public void arama_kutusuna_nutella_yazip_enter_tusuna_basar() {
      amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
    }
    @Then("arama sonuclari'nin Nutella icerdigini test eder")
    public void arama_sonuclari_nin_nutella_icerdigini_test_eder() {
        String expectedIcerik="Nutella";
        String actualSonucYazisi=amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();

    }

    @Then("arama kutusuna Samsung yazip ENTER tusuna basar")
    public void aramaKutusunaSamsungYazipENTERTusunaBasar() {
        amazonPage.aramaKutusu.sendKeys("Samsung"+Keys.ENTER);
    }
    @And("arama sonuclari'nin Samsung icerdigini test eder")
    public void aramaSonuclarininSamsungIcerdiginiTestEder() {
        String expectedIcerik="Samsung";
        String actualSonucYazisi=amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));
    }

    @Then("arama kutusuna Java yazip ENTER tusuna basar")
    public void aramaKutusunaJavaYazipENTERTusunaBasar() {
        amazonPage.aramaKutusu.sendKeys("Java"+Keys.ENTER);
    }

    @And("arama sonuclari'nin Java icerdigini test eder")
    public void aramaSonuclariNinJavaIcerdiginiTestEder() {
        String expectedIcerik="Java";
        String actualSonucYazisi=amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));
    }

    @Then("arama kutusuna {string} yazip ENTER tusuna basar")
    public void aramaKutusunaYazipENTERTusunaBasar(String aranacakUrun) {
        amazonPage.aramaKutusu.sendKeys(aranacakUrun+Keys.ENTER);
    }

    @And("arama sonuclari'nin {string} icerdigini test eder")
    public void aramaSonuclariNinIcerdiginiTestEder(String arananIcerik) {
        String actualSonucYazisi=amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(arananIcerik));
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int beklemeSuresi) {
        try {
            Thread.sleep(beklemeSuresi*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Given("kullanici {string} anasayfaya gider")
    public void kullaniciAnasayfayaGider(String istenenUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }
}
