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
 * @author Felipe Rios
 */
public class Clientside extends Thread{
    private InetAddress serverIp; //IP DO SERVIDOR
    private InetAddress clientIp; //IP DO CLIENTE
    private InetAddress broadcastIp;
    private DatagramSocket clientSocket; //SOCKET UDP DO CLIENTE
    private final int port = 15821; //PORTA UTILIZADA PELA APLICAÇÃO
    private byte[] inBuffer; //BUFFER DE ENTRADA
    private byte[] outBuffer; //BUFFER DE SAÍDA
    private String nickname; //APELIDO DO CLIENTE
    
    public void Clientside(String nickname) throws Exception{
        this.clientSocket = new DatagramSocket(port);
        this.inBuffer = new byte[1024];
        this.outBuffer = new byte[1024];
        this.nickname = nickname;
        this.broadcastIp = InetAddress.getByName("255.255.255.255");
    }
    
    @Override
    public void run(){
        while(true){
        //PROCURA POR PARTIDAS ABERTAS
        //EXIBE AS PARTIDAS ABERTAS DISPONÍVEIS
        //EXIBE OPÇÃO DE HOSTEAR UM NOVO JOGO
        //CONECTA AO HOST
        //COMEÇA O JOGO
        }
    }
    
    private void broadcast(String broadcastMessage, InetAddress address) throws IOException {
        clientSocket.setBroadcast(true); 
        byte[] outbuffer = broadcastMessage.getBytes(); 
        DatagramPacket packet = new DatagramPacket(outbuffer, outbuffer.length, address, 4445);
        clientSocket.send(packet);
    }
    
    
}
