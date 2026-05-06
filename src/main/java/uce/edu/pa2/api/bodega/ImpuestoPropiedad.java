package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoPropiedad implements Impuesto{
    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando ImpuestoPropiedad");
        double valorAumentar = valor * 0.12;
        return valor + valorAumentar;
    }
}
