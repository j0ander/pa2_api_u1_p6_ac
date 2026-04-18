package uce.edu.pa2.api.login;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AutentificacionService {

    public boolean autentificar(String name, String password){
        System.out.println("Validando usuario....");
        return name.equals("admin") && password.equals("12345");
    }

}
