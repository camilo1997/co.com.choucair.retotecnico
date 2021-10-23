package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DispositivosUI {
    public static final Target COMPUTADOR = Target.the("Habilita campo de computador").located(By.xpath("//div[@name='osId']"));
    public static final Target INPUT_COMPUTADOR = Target.the("Campo boton selector computador").located(By.xpath("//div[@name='osId']//input"));

    public static final Target VERSION = Target.the("Habilita campo de la version").located(By.xpath("//div[@name='osVersionId']"));
    public static final Target INPUT_VERSION = Target.the("Campo boton selector version").located(By.xpath("//div[@name='osVersionId']//input"));

    public static final Target LENGUAJESO = Target.the("Habilita campo del lenguaje").located(By.xpath("//div[@name='osLanguageId']"));
    public static final Target INPUT_LENGUAJESO = Target.the("Campo boton selector lenguaje").located(By.xpath("//div[@name='osLanguageId']//input"));

    public static final Target MOVIL = Target.the("Habilita campo del movil").located(By.xpath("//div[@name='handsetMakerId']"));
    public static final Target INPUT_MOVIL = Target.the("Campo boton selector movil").located(By.xpath("//div[@name='handsetMakerId']//input"));

    public static final Target MODELO = Target.the("Habilita campo del modelo").located(By.xpath("//div[@name='handsetModelId']"));
    public static final Target INPUT_MODELO = Target.the("Campo boton selector modelo").located(By.xpath("//div[@name='handsetModelId']//input"));

    public static final Target SISTEMA = Target.the("Habilita campo del sistema").located(By.xpath("//div[@name='handsetOSId']"));
    public static final Target INPUT_SISTEMA = Target.the("Campo boton selector sistema").located(By.xpath("//div[@name='handsetOSId']//input"));




    public static final Target BTN_CONTRASENA = Target.the("boton ultimo paso").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]"));


}

