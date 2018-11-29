package forca;

/**
 * Jogo da forca implementado usando arquitetura peer to peer.
 * Cada instância executada cria uma thread de cliente e a inicia.
 * Caso o usuário deseje, uma thread de servidor pode ser iniciada.
 * 
 * @author Felipe Rios
 */
public class Forca {
    
    public static void main(String[] args) throws Exception {
        Mediator mediator = new Mediator();
        GUI gui = new GUI(mediator);
        Clientside client = new Clientside(mediator);
        Serverside server = new Serverside(mediator);
        ConnectionGUI cGui = new ConnectionGUI(mediator);
        // CRIA E INICIA UMA THREAD DE CLIENTE
        //cliente.start();
        // CASO O USUÁRIO DESEJE, CRIA E INICIA UMA THREAD DE SERVIDOR.
    }
    
}
