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
        private AmbitoAplicacion ambitoAplicacion;

        @Inject
        private ClaseIntermedia claseIntermedia;
        @Inject
        private AmbitoRequest ambitoRequest; 

        @Inject
        private AmbitoInject ambitoInject;
       
        @Inject
        private AmbitoSingleton ambitoSingleton;

        @Override
        public int run(String... args) {
            System.out.println("----------------------------- Ambito scoped -----------------------------");
            System.out.println(this.ambitoAplicacion);
            this.ambitoAplicacion.incrementarContador();
            this.ambitoAplicacion.incrementarContador();
            this.ambitoAplicacion.incrementarContador();
            this.claseIntermedia.imprimirObjetoValor();
           /*  System.out.println("----------------------------- Ambito Request -----------------------------");
            System.out.println(this.ambitoRequest.incrementarContador());
            System.out.println(this.ambitoRequest.incrementarContador());
            System.out.println(this.ambitoRequest.incrementarContador());
          */
            System.out.println("----------------------------- Ambito Dependent -----------------------------");
            System.out.println(this.ambitoInject.incrementarContador());
            System.out.println(this.ambitoInject.incrementarContador());
            System.out.println(this.ambitoInject.incrementarContador());
            this.claseIntermedia.imprimirObjetoValorInject();
            
            System.out.println("----------------------------- Ambito Singleton -----------------------------");
            System.out.println(this.ambitoSingleton);
            System.out.println(this.ambitoSingleton.incrementarContador());
            System.out.println(this.ambitoSingleton.incrementarContador());
            System.out.println(this.ambitoSingleton.incrementarContador());
            this.claseIntermedia.imprimirObjetoValorSingleton();

            return 0;
        }
    }

}
