package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ComprobanteFisico implements Comprobante {

    @Override
    public void generar(Pedido pedido) {
        System.out.println("Imprimiendo comprobante físico para: " + pedido.getCliente());
        System.out.println("No se encontro destino");
    }
}