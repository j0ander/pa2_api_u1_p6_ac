package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class NotificadorSelector {
    @Inject
    private NotificadorMail notificadorMail;
    @Inject
    private NotificadorSms notificadorSms;
    @Inject
    private NotificadorWhatsapp notificadorWhatsapp;

    public Notificador seleccionar(double total) {
        if (total <= 120 && total >= 50) {
            return notificadorSms;
        } else if (total < 50) {
            return notificadorWhatsapp;
        } else {
            return notificadorMail;
        }
    }
}

