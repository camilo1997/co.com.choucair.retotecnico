package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionUI {
    public static final Target TXT_NOMBRE = Target.the("Campo de texto usuario").located(By.id("firstName"));
    public static final Target TXT_APELLIDO = Target.the("Campo de texto apellido").located(By.id("lastName"));
    public static final Target TXT_CORREO = Target.the("Campo de texto correo").located(By.id("email"));

    public static final Target BTN_MES = Target.the("Campo boton selector mes").located(By.xpath("//select[@id='birthMonth']"));
    private static final String SELECTOR_MES = "//option[contains(text(),'%s')]";

    public static final Target BTN_DIA = Target.the("Campo boton selector dia").located(By.xpath("//select[@id='birthDay']"));
    private static final String SELECTOR_DIA = "//option[contains(text(),'%s')]";

    public static final Target BTN_ANOS = Target.the("Campo boton selector años").located(By.xpath("//select[@id='birthYear']"));
    private static final String SELECTOR_ANOS = "//option[contains(text(),'%s')]";

    public static final Target BTN_LENGUAJE = Target.the("Campo boton selector lenguaje").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[5]/div[2]/div[1]/input[1]"));
    private static final String SELECTOR_LENGUAJE = " //div[contains(text(),'%s')]";

    public static final Target BTN_DIRECCION = Target.the("Campo boton selector años").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/a[1]"));


    public static String selectorMes() {
        return SELECTOR_MES;
    }

    public static String selectorDia() {
        return SELECTOR_DIA;
    }

    public static String selectorAnos() {
        return SELECTOR_ANOS;
    }

    public static String selectorLenguaje() {
        return SELECTOR_LENGUAJE;
    }

}
