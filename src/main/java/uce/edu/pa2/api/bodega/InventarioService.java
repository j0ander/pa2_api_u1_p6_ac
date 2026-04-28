package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class InventarioService {

  
    @MedirTiempo // Interceptado
    public void registrarInventario(Pedido pedido) {
        // inicia la venta

        System.out.println("Registrando el inventario");
        // consultando el stock de cada item
        // consultando en la base de datos
        // voy a simular un tiempo de demora
        try {
            Thread.sleep(500);
        } catch (Exception e) {

        }
        // registrar estadisticas globales
        System.out.println("Finalizando el registro");
    }
}
