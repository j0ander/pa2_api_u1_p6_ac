package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DescuentoBlackFriday implements Descuento {

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando BlackFriday");
        double valorADescontar = valor * 0.30;
        return valor - valorADescontar;
    }

}
