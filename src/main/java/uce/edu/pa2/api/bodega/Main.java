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
        private ProcesadorCompraService procesadorCompraService;

        @Override
        public int run(String... args) {
            Cliente cliente = new Cliente(
                    1,
                    "1723456789",
                    "Anderson",
                    "Chancusi",
                    "anderson@gmail.com",
                    "0999999999",
                    "Quito, Ecuador",
                    500.00,
                    true);
            Compra comp1 = new Compra(cliente, Double.valueOf(100));
            this.procesadorCompraService.procesar(comp1);
            return 0;
        }
    }

}
