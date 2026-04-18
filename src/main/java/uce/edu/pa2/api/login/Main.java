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
    
    public static class App implements QuarkusApplication{
        @Inject 
        private LoginService loginService;
        @Override
        public int run(String... args) throws Exception {
            Usuario user = new Usuario("admin","12345");
            loginService.login(user);
            return 0;
        }
    }
}

