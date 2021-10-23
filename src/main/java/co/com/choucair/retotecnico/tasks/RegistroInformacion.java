package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.model.Usuario;
import co.com.choucair.retotecnico.userinterface.DispositivosUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.choucair.retotecnico.userinterface.ContrasenaUI.*;
import static co.com.choucair.retotecnico.userinterface.DireccionUI.*;
import static co.com.choucair.retotecnico.userinterface.DispositivosUI.*;
import static co.com.choucair.retotecnico.userinterface.InformacionUI.*;
import static co.com.choucair.retotecnico.userinterface.InicioUI.*;

public class RegistroInformacion implements Task {
    Usuario usuario;

    public RegistroInformacion(Usuario usuario){
        this.usuario = usuario;
    }

    public static RegistroInformacion informacionPersonal(Usuario informacion){
        return Tasks.instrumented(RegistroInformacion.class,informacion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_UNETE),
                Enter.theValue(usuario.getNombre()).into(TXT_NOMBRE),
                Enter.theValue(usuario.getApellido()).into(TXT_APELLIDO),
                Enter.theValue(usuario.getCorreo()).into(TXT_CORREO),
                SelectFromOptions.byVisibleText(usuario.getMes()).from(SELECTOR_MES),
                SelectFromOptions.byVisibleText(usuario.getDia()).from(SELECTOR_DIA),
                SelectFromOptions.byVisibleText(usuario.getAnos()).from(SELECTOR_ANOS),
                Click.on(LENGUAJE),
                Enter.theValue(usuario.getLenguaje()).into(INPUT_LENGUAJE).thenHit(Keys.ENTER),
                Click.on(BTN_DIRECCION)
        );

    }
}
