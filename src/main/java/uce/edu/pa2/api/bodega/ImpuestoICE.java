package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoICE implements Impuesto{
    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando ImpuestoICE");
        double valorAumentar = valor * 0.30;
        return valor + valorAumentar;
    }
}
