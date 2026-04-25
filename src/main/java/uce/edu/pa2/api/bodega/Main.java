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
        private ProcesadorVentaService procesadorVentaService;
        @Inject
        private ProcesadorVentaService1 procesadorVentaService1;
        @Inject
        private EstadisticasVentasGlobales estadisticasVentasGlobales;
        @Inject
        private ProcesadorVentaEnLineaServices procesadorVentaEnLineaServices;
        
        
        @Override
        public int run(String... args) {
            Venta v1 = new Venta("Anderson Chancusi", 70);
            this.procesadorVentaService.procesar(v1);
            Venta v2 = new Venta("Daniel Teran", 40);
            this.procesadorVentaService.procesar(v2);
            Venta v3 = new Venta("Pablo Castillo", 20);
            this.procesadorVentaService.procesar(v3);
            System.out.println("---------------------------------------------------");
            Venta v4 = new Venta("Pablo Castillo", 20);
            this.procesadorVentaService1.procesar(v4);
            Venta v5 = new Venta("Pablo Castillo", 20);
            this.procesadorVentaService1.procesar(v5);
            System.out.println("---------------------------------------------------");
            Venta v6 = new Venta("Pablo Castillo", 20);
            this.procesadorVentaEnLineaServices.procesar(v6);
            Venta v7 = new Venta("Pablo Castillo", 20);
            this.procesadorVentaEnLineaServices.procesar(v7);
            System.out.println("---------------------------------------------------");
            this.estadisticasVentasGlobales.mostrarEstadisticasGlobales();
            return 0;
        }
    }

}
