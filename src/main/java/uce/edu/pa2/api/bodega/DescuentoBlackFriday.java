package uce.edu.pa2.api.bodega;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(2)
public class DescuentoBlackFriday implements Descuento {

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando BlackFriday");
        double valorADescontar = valor * 0.30;
        return valor - valorADescontar;
    }

}
