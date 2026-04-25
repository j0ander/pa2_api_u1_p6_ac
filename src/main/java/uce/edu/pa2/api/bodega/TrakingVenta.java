package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.Dependent;

@Dependent
public class TrakingVenta {
    private long tiempoFinal = 0;
    private long tiempoInicio = 0;
    private long tiempoTotalAcumulado = 0;
    private int numeroOperaciones = 0;

    public void iniciar() {
        this.tiempoInicio = System.currentTimeMillis();

    }

    public void finalizar() {

        this.tiempoFinal = System.currentTimeMillis();
        long tiempoEjecucion = tiempoFinal - tiempoInicio;
        
        this.tiempoTotalAcumulado += tiempoEjecucion;
        this.numeroOperaciones++;

        System.out.println("Tiempo ejecución: " + tiempoEjecucion + "ms");
        System.out.println("Tiempo acumulado: " + this.tiempoTotalAcumulado + "ms");
        System.out.println("Número de operaciones: " + this.numeroOperaciones);
        
        
    }

    public void reiniciar() {
        this.tiempoFinal = 0;
        this.tiempoInicio = 0;
        this.tiempoTotalAcumulado = 0;
        this.numeroOperaciones = 0;
    }
}
