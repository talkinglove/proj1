package net;

import java.net.Socket;
 
 
 
public class TCPSingleClient {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
 
        try {
            Socket socket = new Socket("192.168.0.29", 7777);
            ChatForm win = new ChatForm("Ŭ���̾�Ʈ");
            //System.out.println("�������� ����");
            win.ta.setText("�������� ����");
            if(socket!=null)
            {
                win.tf.setEnabled(true);
            }
            new TCPSingleReceiver(socket,win).start();
            new TCPSingleSender(socket,win).start();
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
 
}