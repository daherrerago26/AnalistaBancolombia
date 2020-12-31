package co.com.choucair.certification.AnalistaBancolombia.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login")
            .located(By.xpath("//*[@id=\"yui_3_17_2_1_1609300943464_20\"]"));
    public static final Target INPUT_USER = Target.the("where do we write the user")
            .located(By.xpath("//*[@id=\"username\"]"));
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.xpath("//*[@id=\"password\"]"));
    public static final Target ENTER_BUTTON = Target.the("button to confirm login")
            .located(By.xpath("//*[@id=\"yui_3_17_2_1_1609301719797_32\"]/div[3]/button"));
}
