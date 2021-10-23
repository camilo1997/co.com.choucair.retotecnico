package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContrasenaUI {
    public static final Target TXT_CONTRASENA = Target.the("Campo de texto contraseña").located(By.id("password"));
    public static final Target TXT_CONFIRCONTRASENA = Target.the("Campo de texto confirmar contraseña").located(By.id("confirmPassword"));
    public static final Target BTN_TERMINO = Target.the("Campo boton terminos").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[5]/label[1]/span[1]"));
    public static final Target BTN_POLITICA = Target.the("Campo boton politicas").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[6]/label[1]/span[1]"));
    public static final Target BTN_REGISTRAR = Target.the("Campo boton finalizar registro").located(By.id("laddaBtn"));
}
