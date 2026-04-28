package uce.edu.pa2.api.bodega;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MedirTiempo // vinculamos el interceptor con la anotacion
@Interceptor // le indicamos que esta clase es un interceptor
public class MedirTiempoInterceptor {
    @AroundInvoke // le indicamos que este metodo se va a ejecutar alrededor de la ejecucion del
                  // metodo interceptado
    public Object medir(InvocationContext context) throws Exception { // tiene que tener esta firma
        System.out.println("Se ejecuto antes del metodo");
        long inicio = System.currentTimeMillis();
        //inicia la ejecucion del metodo
        //si no se llama al proceed, nunca se ejecuta el metodo
        Object resultado = context.proceed(); 
        //pasa a la linea 18 una vez q se termine de ejecutar el metodo de negocio

        long fin = System.currentTimeMillis();

        long tiempoTranscurrido = fin - inicio;
        System.out.println("Tiempo transcurrido: " + tiempoTranscurrido + " ms");
        return resultado;
    }
} //crear un tercer metodo en otro been llamado InventarioService para 
