package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorVentaEnLineaServices {
    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales;

    @Inject // Aqui como inyecto TrakingVenta se crea un objeto
    private TrakingVenta trakingVenta;

    public void procesar(Venta venta) {
        // inicia la venta
        this.trakingVenta.iniciar();
        System.out.println("Procesando Pedido");
        // consultando el stock de cada item
        // consultando en la base de datos
        // voy a simular un tiempo de demora
        try {
            Thread.sleep(100);
        } catch (Exception e) {

        }
        // finalizar venta
        this.trakingVenta.finalizar();

        // registrar estadisticas globales
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
    }
}
