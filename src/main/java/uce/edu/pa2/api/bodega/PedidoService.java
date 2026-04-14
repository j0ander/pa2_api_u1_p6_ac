package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PedidoService {
    
    @Inject
    private NotificadorSelector selector;    
    //DI por constructor
/*   @Inject
     public PedidoService(NotificadorMail notificadorMail) {
              this.notificadorMail = notificadorMail;
         } */

    
    //DI por atributo
/*     @Inject
    private NotificadorMail notificadorMail; */ //inyeccion de esa independecia
    
    //DI por metodo
/*  private NotificadorMail notificadorMail;
    @Inject
    public void setNotificador(NotificadorMail notificadorMail) {
        this.notificadorMail = notificadorMail;
    } */

    public void registar(Pedido pedido) {
        System.out.println("Registrando pedido");
        System.out.println("cliente: " + pedido.getCliente());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos");

        
        //NotificadorMail n1 = new NotificadorMail(); Sin inyeccion
        Notificador notificador = this.selector.seleccionar(pedido.getTotal());
        notificador.enviar(pedido.getDestino(), "Se ha creado un pedido para ser atendido");
    }

}
