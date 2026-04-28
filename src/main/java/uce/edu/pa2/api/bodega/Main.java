package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {

    public static void main(String[] args) {
        Quarkus.run(App.class, args);

    }

    public static class App implements QuarkusApplication {

        @Inject
        private ProcesarVentaServiceTiempo procesarVentaServiceTiempo;    
        
        @Inject
        private InventarioService inventarioService;
        
        @Override
        public int run(String... args) {
            Venta v1 = new Venta("Anderson Chancusi", 70);
            Pedido pd = new Pedido("Anderson Chancusi", "Arroz", 1000);
            this.procesarVentaServiceTiempo.procesar(v1);
            System.out.println("-------------------------------------");
            this.procesarVentaServiceTiempo.reprocesar(v1);
            System.out.println("-------------------------------------");
            this.inventarioService.registrarInventario(pd);
            return 0;
        }
    }

}
