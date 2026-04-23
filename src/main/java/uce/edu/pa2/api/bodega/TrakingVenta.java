package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.Dependent;

@Dependent //Guarda un estado 
public class TrakingVenta {
    private long tiempoInicio;

    public void iniciar() {
        this.tiempoInicio = System.currentTimeMillis(); 
    }

    public void finalizar() {
        long tiempoFinal = System.currentTimeMillis();
        long tiempoEjecucion = tiempoFinal - this.tiempoInicio;
        System.out.println("Tiempo ejecucion: " + tiempoEjecucion + " ms");
    }
}
