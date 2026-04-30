package uce.edu.pa2.api.bodega;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Log // vinculamos el interceptor con la anotacion
@Interceptor // le indicamos que esta clase es un interceptor
@Priority(3)
public class LogInterceptor {
    @AroundInvoke // le indicamos que este metodo se va a ejecutar alrededor de la ejecucion del
                  // metodo interceptado
    public Object medir(InvocationContext context) throws Exception { // tiene que tener esta firma
        System.out.println("Se ejecuto Log antes del metodo");
        System.out.println("Metodo interceptado: " + context.getMethod().getName());
        Object[] args =context.getParameters();
        for(int i = 0; i<args.length;i++){
            System.out.println("Argumento: " + args[i]);
            Object obj = args[i];
            Venta venta = (Venta) obj;
            System.out.println(venta.getCliente());
            System.out.println(venta.getTotal());
        }
        Object resultado = context.proceed();

        return resultado;
    }
}