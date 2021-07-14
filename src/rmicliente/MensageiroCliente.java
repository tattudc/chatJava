package rmicliente;

import rmicomum.Mensageiro;
import rmicomum.MensageiroImpl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MensageiroCliente {

    public static void main(String args[]){
        try{
            Mensageiro m = (Mensageiro) Naming.lookup(MensageiroImpl.getURI());
            System.out.println(m.lerMensagem());
            if(args.length == 1){
                m.enviarMensagem(args[0]);
            }else{
                m.enviarMensagem("Mensagem do cliente enviada ao servidor");
            }
        }
        catch (MalformedURLException e){
            System.out.println();
            System.out.println("MalformedURLException: "+e.toString());
        }
        catch (RemoteException e){
            System.out.println();
            System.out.println("RemoteException: "+e.toString());
        }
        catch (NotBoundException e){
            System.out.println();
            System.out.println("NotBoundException: "+ e.toString());
        }
        catch (Exception e){
            System.out.println();
            System.out.println("Exception: "+ e.toString());
        }
    }
}
