package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesarVentaServiceTiempo {

    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales;

    @MedirTiempo // Interceptado
    public void procesar(Venta venta) {
        // inicia la venta

        System.out.println("Procesando Pedido");
        // consultando el stock de cada item
        // consultando en la base de datos
        // voy a simular un tiempo de demora
        try {
            Thread.sleep(100);
        } catch (Exception e) {

        }
        
        // registrar estadisticas globales
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
        System.out.println("Final del Pedido");
    }

    @MedirTiempo // Interceptado
    public void reprocesar(Venta venta) {
        // inicia la venta

        System.out.println("Reprocesando Pedido");
        // consultando el stock de cada item
        // consultando en la base de datos
        // voy a simular un tiempo de demora
        try {
            Thread.sleep(250);
        } catch (Exception e) {

        }
        
        // registrar estadisticas globales
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
        System.out.println("Finalizando el reproceso");
    }
}
