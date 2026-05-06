package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoRenta implements Impuesto{
    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando ImpuestoRenta");
        double valorAumentar = valor * 0.15;
        return valor + valorAumentar;
    }
}
