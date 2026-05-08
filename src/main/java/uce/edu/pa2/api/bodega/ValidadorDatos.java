package uce.edu.pa2.api.bodega;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(3)
public class ValidadorDatos implements Validador {
    @Override
    public void validar(Compra compra) {
        if (compra.getCliente() == null) {
            throw new RuntimeException("La compra no tiene cliente");
        }
        System.out.println("Cliente valido");

    }

}
