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
        //Modelos IoC
        //1. DI
        
        
        @Inject
        private PedidoService pedidoService;
        
        //2. Service Locator (Lookup)
        //current accedo al contenedor CDI, select selecciono la clase que quiero, get obtengo la instancia
        //private PedidoService pedidoService =CDI.current().select(PedidoService.class).get();
        @Inject
        private PagoTarjetaCredito pagoTarjetaCredito;

        @Inject
        private PagoEfectivo pagoEfectivo;
        
        @Override
        public int run(String... args) {
            //caso 1 (digital)
/*             PedidoService pedidoService =CDI.current().select(PedidoService.class).get();
 */
            Pedido p = new Pedido("Anderson Chancusi", "Coca Cola", 1200, "anderson@gmail.com");
            this.pedidoService.registar(p, pagoTarjetaCredito);
            System.out.println("-------------------------------------------------");
            
            
            //caso 2 (fisico)
            Pedido p2 = new Pedido("Anderson Chancusi", "Coca Cola", 20, "");
            this.pedidoService.registar(p2, pagoEfectivo);
            return 0; 
            

        }
    }

 
}
