package uce.edu.pa2.api.bodega;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(1)
public class ValidadorSaldo implements Validador{
    @Override
    public void validar(Compra compra) {
        if(compra.getCliente().getSaldo() < compra.getTotal()){
            throw new RuntimeException("No tiene saldo suficiente");
        }        
        System.out.println("Saldo suficiente para la compra");
    }
}
