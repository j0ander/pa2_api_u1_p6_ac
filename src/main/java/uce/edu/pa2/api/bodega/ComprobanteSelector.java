package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ComprobanteSelector {


    @Inject
    private ComprobanteDigital comprobanteDigital;

    @Inject
    private ComprobanteFisico comprobanteFisico;

    public Comprobante seleccionar(Pedido pedido) {

        if (pedido.getDestino() != null && !pedido.getDestino().isEmpty()) {
            return comprobanteDigital;
        } else {
            return comprobanteFisico; 
        }
    }
}