package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

//IoC INVERSION DE CONTROL

@ApplicationScoped //la va a gestionar el contenedor de CDI, es decir, el framework se encarga de crear la instancia y gestionarla
public class NotificadorMail {

    public void enviar(String correo, String mensaje) {
        System.out.println("Se envia el mail al correo: " + correo);
        System.out.println("Con el mensaje: " + mensaje);
    }

}
