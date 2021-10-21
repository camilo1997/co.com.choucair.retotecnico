package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioUI {
        public static final Target BTN_UNETE = Target.the("Campo boton Unete hoy").located(By.xpath("//unauthenticated-header/div[1]/div[3]/ul[2]/li[2]/a[1]"));
        public static final Target LBL_MENSAJE = Target.the("mensaje").located(By.xpath("//h1[contains(text(),\"Welcome to the world's largest community of freela\")]"));
}
