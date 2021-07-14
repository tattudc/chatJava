package rmicomum;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Formatter;

//Implementando o mensageiro

public class MensageiroImpl extends UnicastRemoteObject implements Mensageiro {

    private static String SERVIDOR = "localhost";
    private static Integer PORTA = 1099;
    private static String SERVICO = "ServicoMensagem";

    private String msgRecebida = "Sem mensagens";

    //Retorna a URI padronizada para o servidor e para o cliente

    public static String getURI(){
        String url = String.format("rmi://%s:%d/%s", SERVIDOR,PORTA,SERVICO);
        return url; //rmi://Servidor:Porta/Servico
    }

    public MensageiroImpl() throws RemoteException{
        super();
    }

    public void enviarMensagem(String msg) throws RemoteException{
        System.out.println(msg); //Devolve mensagem na tela
        msgRecebida = msg;
    }

    public String lerMensagem() throws RemoteException{
        return msgRecebida;
    }

}
