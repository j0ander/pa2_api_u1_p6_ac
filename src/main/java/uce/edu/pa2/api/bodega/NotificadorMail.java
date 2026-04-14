package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;

//IoC INVERSION DE CONTROL

@ApplicationScoped //la va a gestionar el contenedor de CDI, es decir, el framework se encarga de crear la instancia y gestionarla
@Default
public class NotificadorMail implements Notificador {
    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("Se envia el mail al correo: " + destino);
        System.out.println("Con el mensaje: " + mensaje);
    }

}
