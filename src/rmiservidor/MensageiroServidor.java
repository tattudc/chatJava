package rmiservidor;

import rmicomum.Mensageiro;
import rmicomum.MensageiroImpl;

import java.rmi.Naming;

public class MensageiroServidor {
    public MensageiroServidor(){
        try {
            Mensageiro m = new MensageiroImpl();
            Naming.rebind(MensageiroImpl.getURI(), m);
        }
        catch(Exception e) {
               System.out.println("Error: " + e);
        }
    }

    public static void main(String[] args){
        new MensageiroServidor();
    }
}

