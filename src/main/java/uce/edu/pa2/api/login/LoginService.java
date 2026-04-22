package uce.edu.pa2.api.login;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class LoginService {

    @Inject
    private AutentificacionService authService;

    @Inject
    private Notificador notificador;

    @Inject
    private ValidadorLogin validador; 

    public void login(Usuario user) {

        validador.setDatos(user.getName(), user.getPassword());

        if (!validador.datosValidos()) {
            System.out.println("Datos inválidos");
            return;
        }

        boolean valido = authService.autentificar(user.getName(), user.getPassword());

        if (valido) {
            System.out.println("Login exitoso");
            notificador.registrarEvento("Usuario " + user.getName() + " ingresó correctamente");
        } else {
            System.out.println("Credenciales incorrectas");
            notificador.registrarEvento("Intento fallido de login para " + user.getName());
        }
    }
}