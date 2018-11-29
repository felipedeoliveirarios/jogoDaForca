/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forca;

/**
 *
 * @author felipe
 */
public class Mediator {
    public static int EXIT_MESSAGE = 0;
        private Clientside clientThread;
        private Serverside serverThread;
        private GUI gui;
        private ConnectionGUI cGui;
    
    Mediator(){
    }
    
    public boolean link(Object o){
        if ("Clientside".equals(o.getClass().getName())){
            this.clientThread = (Clientside) o;
            return true;
        }
        if ("GUI".equals(o.getClass().getName())){
            this.gui = (GUI) o;
            return true;
        }
        if ("Serverside".equals(o.getClass().getName())){
            this.serverThread = (Serverside) o;
            return true;
        }
        if ("ConnectionGUI".equals(o.getClass().getName())){
            this.cGui = (ConnectionGUI) o;
            return true;
        }
        return false;
    }
    
    public boolean post(int message){
        try{
            clientThread.close();
            serverThread.close();
        return true;
        }catch(Exception e){
            return false;
        }
    }
}
