package uce.edu.pa2.api.login;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Notificador {
    public void registrarEvento(String msg){
        System.out.println("NOTIFICACION: " + msg);
    }    
}
