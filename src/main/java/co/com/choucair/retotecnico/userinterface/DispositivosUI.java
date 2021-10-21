package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DispositivosUI {
    public static final Target BTN_COMPUTADOR = Target.the("Campo boton selector computador").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]"));
    private static final String SELECTOR_COMPUTADOR = "//div[contains(text(),'%s')]";

    public static final Target BTN_VERSION = Target.the("Campo boton selector version").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/span[1]"));
    private static final String SELECTOR_VERSION = "//div[contains(text(),'%s')]";

    public static final Target BTN_LENGUAJESO = Target.the("Campo boton selector lenguaje").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[3]/div[2]/div[1]/div[1]/span[1]"));
    private static final String SELECTOR_LENGUAJESO = "//div[contains(text(),'%s')]";

    public static final Target BTN_MOVIL = Target.the("Campo boton selector movil").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]"));
    private static final String SELECTOR_MOVIL = "//div[contains(text(),'%s')]";

    public static final Target BTN_MODELO = Target.the("Campo boton selector modelo").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/div[1]/span[1]"));
    private static final String SELECTOR_MODELO = "//div[contains(text(),'%s')]";

    public static final Target BTN_SISTEMA = Target.the("Campo boton selector sistema").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[1]/div[1]/span[1]"));
    private static final String SELECTOR_SISTEMA = "//div[contains(text(),'%s')]";

    public static final Target BTN_CONTRASENA = Target.the("boton ultimo paso").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]"));

    public static String selectorComputador() {
        return SELECTOR_COMPUTADOR;
    }

    public static String selectorVersion() {
        return SELECTOR_VERSION;
    }

    public static String selectorLenguajeSO() {
        return SELECTOR_LENGUAJESO;
    }

    public static String selectorMovil() {
        return SELECTOR_MOVIL;
    }
    public static String selectorModelo() {
        return SELECTOR_MODELO;
    }
    public static String selectorSistema() {
        return SELECTOR_SISTEMA;
    }

}

