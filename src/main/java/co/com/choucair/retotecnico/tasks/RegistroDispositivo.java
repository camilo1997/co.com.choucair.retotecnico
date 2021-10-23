package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.model.Usuario;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static co.com.choucair.retotecnico.userinterface.DispositivosUI.*;
import static co.com.choucair.retotecnico.userinterface.InformacionUI.TXT_APELLIDO;


public class RegistroDispositivo implements Task{
    Usuario usuario;

    public RegistroDispositivo(Usuario usuario){
        this.usuario = usuario;
    }

    public static RegistroDispositivo dispositivoPersonal(Usuario dispositivo){
        return Tasks.instrumented(RegistroDispositivo.class,dispositivo);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(COMPUTADOR),
                Enter.theValue(usuario.getComputador()).into(INPUT_COMPUTADOR).thenHit(Keys.ENTER),
                Click.on(VERSION),
                Enter.theValue(usuario.getVersion()).into(INPUT_VERSION).thenHit(Keys.ENTER),
                Click.on(LENGUAJESO),
                Enter.theValue(usuario.getLenguajeSO()).into(INPUT_LENGUAJESO).thenHit(Keys.ENTER),
                Click.on(MOVIL),
                Enter.theValue(usuario.getMovil()).into(INPUT_MOVIL).thenHit(Keys.ENTER),
                Click.on(MODELO),
                Enter.theValue(usuario.getModelo()).into(INPUT_MODELO).thenHit(Keys.ENTER),
                Click.on(SISTEMA),
                Enter.theValue(usuario.getSistema()).into(INPUT_SISTEMA).thenHit(Keys.ENTER),
                Click.on(BTN_CONTRASENA)
               );
    }
}
