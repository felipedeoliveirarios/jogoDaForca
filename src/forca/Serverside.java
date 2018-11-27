/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forca;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;

/**
 *
 * @author aluno
 */
public class Serverside extends Thread{
    private DatagramSocket serverSocket; //SOCKET UDP DO SERVIDOR
    private InetAddress broadcastIp;
    private int clientCount; //NÚMERO DE CLIENTES CONECTADOS
    private static int port = 15821; //PORTA ESTÁTICA (DEFINIDA PREVIAMENTE)
    private boolean playing; //SE HÁ UM JOGO EM ANDAMENTO
    private byte[] inBuffer; //BUFFER DE ENTRADA
    private byte[] outBuffer; //BUFFER DE SAÍDA
    
    public Serverside() throws IOException{
        this.serverSocket = new DatagramSocket(port);
        this.clientCount = 0;
        this.playing = false;
        this.inBuffer = new byte[1024];
        this.outBuffer = new byte[1024];
        this.broadcastIp = InetAddress.getByName("255.255.255.255");
    }
    
    public void Run(){
        boolean searchingForPlayers = true;
        while (searchingForPlayers){
                //BUSCA POR NOVOS JOGADORES
                //ITERA O CONTADOR AO ENCONTRAR
            if (clientCount >= 2){
                //EXIBE OPÇÃO DE INICIAR A PARTIDA
                //CASO O HOST DECIDA INICIAR, ALTERA O VALOR DA VARIÁVEL PLAYING
            }
        }
        while (playing){
            //LÊ AS CATEGORIAS DE UM ARQUIVO E SELECIONA UMA DELAS ALEATORIAMENTE
            //ABRE UM ARQUIVO TXT QUE POSSUA O MESMO NOME DA CATEGORIA E SELECIONA UMA PALAVRA ALEATORIAMENTE
            //INDEXA OS JOGADORES E USA O NÚMERO PARA DEFINIR OS TURNOS E ARMAZENAR O NÚMERO DE VIDAS
            //DÁ A CADA JOGADOR 10 SEGUNDOS PARA FAZER UMA TENTATIVA
        }
    }
    
    private void broadcast(String broadcastMessage, InetAddress address) throws IOException {
        serverSocket.setBroadcast(true); 
        byte[] outbuffer = broadcastMessage.getBytes(); 
        DatagramPacket packet = new DatagramPacket(outbuffer, outbuffer.length, address, 4445);
        serverSocket.send(packet);
    }
}
