package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PedidoService {
    
    @Inject
    private NotificadorSelector selector;    

    @Inject 
    private ComprobanteSelector comprobanteSelector;
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


    //private PagoEstrategia pagoEstrategia;

    // public void setPagoEstrategia(PagoEstrategia pagoEstrategia) {
    //    this.pagoEstrategia = pagoEstrategia;
   // }
    public void registar(Pedido pedido, PagoEstrategia pagoEstrategia) {
        System.out.println("Registrando pedido");
        System.out.println("cliente: " + pedido.getCliente());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos");
        
        pagoEstrategia.realizar(pedido.getTotal());

        Comprobante comprobante = comprobanteSelector.seleccionar(pedido);
        comprobante.generar(pedido);
        
        //NotificadorMail n1 = new NotificadorMail(); Sin inyeccion
        Notificador notificador = this.selector.seleccionar(pedido.getTotal());
        notificador.enviar(pedido.getDestino(), "Se ha creado un pedido para ser atendido");
    }

}
