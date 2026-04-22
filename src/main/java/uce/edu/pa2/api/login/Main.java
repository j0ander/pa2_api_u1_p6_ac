package uce.edu.pa2.api.login;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import io.quarkus.runtime.Quarkus;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {

    public static void main(String[] args) {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {

        @Inject
        private LoginService loginService;

        @Inject
        private AutentificacionService authService;

        @Inject
        private Notificador notificador;

        @Inject
        private SistemaLog sistemaLog;

        @Override
        public int run(String... args) throws Exception {

            System.out.println("=== INICIO PRUEBA SCOPES ===");

            Usuario user1 = new Usuario("admin", "12345");
            Usuario user2 = new Usuario("admin", "wrong");

            System.out.println("\n--- LOGIN 1 ---");
            loginService.login(user1);

            System.out.println("\n--- LOGIN 2 ---");
            loginService.login(user1);

            System.out.println("\n--- LOGIN 3 ---");
            loginService.login(user2);

            System.out.println("\n--- LOGIN 4 ---");
            loginService.login(user2);


            return 0;
        }
    }
}