package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.model.Usuario;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.*;

import static co.com.choucair.retotecnico.userinterface.ContrasenaUI.*;

public class RegistroContrasena implements Task {
    Usuario usuario;
    public RegistroContrasena(Usuario usuario){
        this.usuario = usuario;
    }
    public static RegistroContrasena contrasenaPersonal(Usuario contrasena){
        return Tasks.instrumented(RegistroContrasena.class,contrasena);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(usuario.getContrasena()).into(TXT_CONTRASENA),
                Enter.theValue(usuario.getConfirmarcontrasena()).into(TXT_CONFIRCONTRASENA),
                Click.on(BTN_TERMINO),
                Click.on(BTN_POLITICA),
                Click.on(BTN_REGISTRAR)
        );
    }
}
