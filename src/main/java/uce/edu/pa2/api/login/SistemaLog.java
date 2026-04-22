package uce.edu.pa2.api.login;



import jakarta.inject.Singleton;

@Singleton
public class SistemaLog {

    private int totalLogs = 0;

    public void log(String mensaje){
        totalLogs++;
        System.out.println("LOG #" + totalLogs + ": " + mensaje);
    }
}