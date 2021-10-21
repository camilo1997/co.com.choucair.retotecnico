package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.model.Usuario;
import co.com.choucair.retotecnico.userinterface.DispositivosUI;
import co.com.choucair.retotecnico.userinterface.InformacionUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.retotecnico.userinterface.ContrasenaUI.*;
import static co.com.choucair.retotecnico.userinterface.DireccionUI.*;
import static co.com.choucair.retotecnico.userinterface.DispositivosUI.*;
import static co.com.choucair.retotecnico.userinterface.InformacionUI.*;
import static co.com.choucair.retotecnico.userinterface.InicioUI.*;

public class RealizarRegistro implements Task {
    Usuario usuario;

    public RealizarRegistro(Usuario usuario){
        this.usuario = usuario;
    }

    public static RealizarRegistro personal(Usuario informacion){
        return Tasks.instrumented(RealizarRegistro.class,informacion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_UNETE),
                Enter.theValue(usuario.getNombre()).into(TXT_NOMBRE),
                Enter.theValue(usuario.getApellido()).into(TXT_APELLIDO),
                Enter.theValue(usuario.getCorreo()).into(TXT_CORREO),
                Click.on(BTN_MES),
                Click.on(String.format(InformacionUI.selectorMes(),usuario.getMes())),
                Click.on(BTN_DIA),
                Click.on(String.format(InformacionUI.selectorDia(),usuario.getDia())),
                Click.on(BTN_ANOS),
                Click.on(String.format(InformacionUI.selectorAnos(),usuario.getAnos())),
                Click.on(BTN_LENGUAJE),
                Click.on(String.format(InformacionUI.selectorLenguaje(),usuario.getLenguaje())),
                Click.on(BTN_DIRECCION),
                WaitUntil.the(LBL_AUTO, WebElementStateMatchers.isPresent()).forNoMoreThan(5).seconds(),
                Click.on(BTN_DISPOSITIVOS),
                Click.on(BTN_COMPUTADOR),
                Click.on(String.format(DispositivosUI.selectorComputador(), usuario.getComputador())),
                Click.on(BTN_VERSION),
                Click.on(String.format(DispositivosUI.selectorVersion(), usuario.getVersion())),
                Click.on(BTN_LENGUAJESO),
                Click.on(String.format(DispositivosUI.selectorLenguajeSO(), usuario.getLenguajeSO())),
                Click.on(BTN_MOVIL),
                Click.on(String.format(DispositivosUI.selectorMovil(), usuario.getMovil())),
                Click.on(BTN_MODELO),
                Click.on(String.format(DispositivosUI.selectorModelo(), usuario.getModelo())),
                Click.on(BTN_SISTEMA),
                Click.on(String.format(DispositivosUI.selectorSistema(), usuario.getSistema())),
                Click.on(BTN_CONTRASENA),
                Enter.theValue(usuario.getContrasena()).into(TXT_CONTRASENA),
                Enter.theValue(usuario.getConfirmarcontrasena()).into(TXT_CONFIRCONTRASENA),
                Click.on(BTN_TERMINO),
                Click.on(BTN_POLITICA),
                Click.on(BTN_REGISTRAR)

        );

    }
}
