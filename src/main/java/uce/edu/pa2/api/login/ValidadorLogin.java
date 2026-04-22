package uce.edu.pa2.api.login;

import jakarta.enterprise.context.Dependent;

@Dependent
public class ValidadorLogin {

    public ValidadorLogin() {
        System.out.println(">> Nueva instancia de ValidadorLogin creada: " + this.hashCode());
    }

    private String name;
    private String password;

    public void setDatos(String name, String password){
        this.name = name;
        this.password = password;
    }

    public boolean datosValidos(){
        return name != null && password != null;
    }
}