package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionUI {
    public static final Target TXT_NOMBRE = Target.the("Campo de texto usuario").located(By.id("firstName"));
    public static final Target TXT_APELLIDO = Target.the("Campo de texto apellido").located(By.id("lastName"));
    public static final Target TXT_CORREO = Target.the("Campo de texto correo").located(By.id("email"));

    public static  final Target SELECTOR_MES = Target.the("campo boton selector mes").located(By.xpath("//select[@id='birthMonth']"));
    public static  final Target SELECTOR_DIA = Target.the("campo boton selector dia").located(By.xpath("//select[@id='birthDay']"));
    public static  final Target SELECTOR_ANOS = Target.the("campo boton selector ano").located(By.xpath("//select[@id='birthYear']"));

    public static final Target LENGUAJE = Target.the("Habilita campo del lenguaje").located(By.xpath("//div[@id='languages']"));
    public static final Target INPUT_LENGUAJE = Target.the("Campo boton selector lenguaje").located(By.xpath("//div[@id='languages']//input"));

    public static final Target BTN_DIRECCION = Target.the("Campo boton selector años").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/a[1]"));


}
