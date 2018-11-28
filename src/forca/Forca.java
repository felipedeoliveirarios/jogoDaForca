package forca;
/**
 * Jogo da forca implementado usando arquitetura peer to peer.
 * Cada instância executada cria uma thread de cliente e a inicia.
 * Caso o usuário deseje, uma thread de servidor pode ser iniciada.
 * 
 * @author Felipe Rios
 */
public class Forca {
    
    public static void main(String[] args) {
        System.out.println("Seja bem-vindo ao jogo da forca!");
        GUI gui = new GUI();
        // CRIA E INICIA UMA THREAD DE CLIENTE
        //Clientside cliente = new Clientside();
        //cliente.start();
        // CASO O USUÁRIO DESEJE, CRIA E INICIA UMA THREAD DE SERVIDOR.
    }
    
}
