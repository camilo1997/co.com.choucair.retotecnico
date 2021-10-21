package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DireccionUI {
    public static final Target BTN_DISPOSITIVOS = Target.the("Campo boton dispositivos").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/a[1]"));
    public static final Target LBL_AUTO = Target.the("Campo boton dispositivos").located(By.cssSelector("main.registration section.col-md-8.col-lg-8.col-sm-12.col-xs-12:nth-child(3) div.container-fluid div.sign-up-form-container div.ui-view form.user-form.ng-pristine.ng-valid-minlength.ng-valid-maxlength.ng-valid-validation-match.ng-valid.ng-valid-required div.form-group-box:nth-child(1) div.row div.col-xs-12.col-sm-12.col-md-6.col-lg-6.location div.form-group.address.col-xs-12.col-sm-12.col-md-12.col-lg-12:nth-child(1) > span.check-mark:nth-child(5)"));
}
