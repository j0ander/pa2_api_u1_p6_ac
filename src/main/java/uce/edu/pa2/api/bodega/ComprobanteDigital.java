package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ComprobanteDigital implements Comprobante {

    @Override
    public void generar(Pedido pedido) {
        System.out.println("Generando comprobante digital para: " + pedido.getCliente());
    }

}
