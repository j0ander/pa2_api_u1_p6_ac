package uce.edu.pa2.api.bodega;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(2)
public class ValidadorEstadoCliente implements Validador{
    @Override
    public void validar(Compra compra) {
        if(!compra.getCliente().isActivo()){
            throw new RuntimeException("El cliente no se encuentra activo");
        }
        System.out.println("Validando estado del cliente....");
    }
}
