package rmicomum;

import java.rmi.Remote;
import java.rmi.RemoteException;

//Interface para definir o padrão de comunicação

public interface Mensageiro extends Remote {
    public void enviarMensagem(String msg) throws RemoteException; //Envia
    public String lerMensagem() throws RemoteException; // Recebe
}
