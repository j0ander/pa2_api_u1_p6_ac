package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PedidoService2 {
    
    public void registar(Pedido pedido) {
        System.out.println("Registrando pedido");
    }

}
