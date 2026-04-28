package uce.edu.pa2.api.bodega;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.interceptor.InterceptorBinding;

@InterceptorBinding // le indicamos que va a ser un interceptor
@Target({ElementType.METHOD, ElementType.TYPE}) //es el objetivo de la anotacion
@Retention(RetentionPolicy.RUNTIME)
public @interface MedirTiempo {


}
