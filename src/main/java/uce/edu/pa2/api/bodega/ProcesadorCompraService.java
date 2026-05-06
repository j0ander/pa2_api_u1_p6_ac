package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorCompraService {
    @Inject
    private Instance<Descuento> descuentos; // detecta todas las implementaciones que tiene el sistema y las va a tratar
                                            // como una lista

    @Inject
    private Instance<Impuesto> impuestos;

    public void procesar(Compra compra) {
        double total = compra.getSubTotal();
        /*
         * for (Descuento des : descuentos) {
         * total = des.aplicar(total);
         * }
         */

        for (Impuesto imp : impuestos) {
            total = imp.aplicar(total);
        }
        compra.setTotal(total);

        System.out.println("Su valor a pagar es: " + compra.getTotal());
    }
}
