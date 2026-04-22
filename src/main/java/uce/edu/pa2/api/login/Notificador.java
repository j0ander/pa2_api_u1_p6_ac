package uce.edu.pa2.api.login;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class Notificador {
    @Inject
    private SistemaLog sistemaLog;

    public void registrarEvento(String msg){
    System.out.println("NOTIFICACION: " + msg);
    sistemaLog.log(msg);
}
}
