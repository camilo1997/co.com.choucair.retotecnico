package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.model.Usuario;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.retotecnico.userinterface.DireccionUI.BTN_DISPOSITIVOS;
import static co.com.choucair.retotecnico.userinterface.DireccionUI.LBL_AUTO;
import static co.com.choucair.retotecnico.userinterface.InformacionUI.BTN_DIRECCION;


public class RegistroDireccion implements Task {
    Usuario usuario;

    public RegistroDireccion(Usuario usuario){
        this.usuario = usuario;
    }
    public static RegistroDireccion direccionPersonal(Usuario direccion){
        return Tasks.instrumented(RegistroDireccion.class,direccion);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitUntil.the(LBL_AUTO, WebElementStateMatchers.isPresent()).forNoMoreThan(15).seconds(),
                Click.on(BTN_DISPOSITIVOS));
    }
}
