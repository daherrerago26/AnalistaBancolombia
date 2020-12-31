package co.com.choucair.certification.AnalistaBancolombia.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target SEARCH_COURSE = Target.the("search course Prueba Tecnica")
            .located(By.xpath("//*[@id=\"page-container-3\"]/div/div/div/a/div"));
    public  static final  Target NAME_COURSE = Target.the("extract name course")
            .located(By.xpath("//h1[contains(text(),'Prueba Técnica - Analista Bancolombia')],"));
}
