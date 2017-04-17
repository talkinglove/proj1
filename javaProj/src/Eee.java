import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.sql.ClientInfoStatus;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import javax.print.attribute.standard.OutputDeviceAssigned;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


     public class Eee {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}

     
     
     
     /*
     
  

package Mar5thPac;

//"192.168.1.7", 7777 / 6789

import java.io.DataOutputStream;

import java.io.IOException;

import java.io.OutputStream;

import java.net.ServerSocket;

import java.net.Socket;

 

public class HomeworkTueServer {

 

   public static void main(String[] args) {

      try {

          

         ServerSocket server = new ServerSocket(6789);

         System.out.println("주운비");

 

         while(true)

         {

            Socket client = server.accept();          

            System.out.println(client.getInetAddress());

            

            OutputStream os = client.getOutputStream();

            DataOutputStream dos = new DataOutputStream(os);

            

            dos.writeUTF("yo-ho-yo-ho");

            

            dos.close();

            os.close();

            client.close();

         }

         

      } catch (IOException e) {

         // TODO Auto-generated catch block

         e.printStackTrace();

      }

   }

 

} 











클라이언트



package Mar5thPac;

//"192.168.1.7", 7777 / 6789

import java.awt.BorderLayout;

import java.awt.Color;

import java.awt.FlowLayout;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.io.DataInputStream;

import java.io.IOException;

import java.io.InputStream;

import java.net.Socket;

import java.net.UnknownHostException;

 

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JTextField;

 

public class HomeworkTueClient extends JFrame {

 

   JTextField jf1;

   JTextField jf2;

   

   class NewWindow implements ActionListener

   {

 

      @Override

      public void actionPerformed(ActionEvent e) {

         try {

            Socket client = new Socket(jf1.getText(), //아이피

                    Integer.parseInt(jf2.getText())); //포트

            

            InputStream is = client.getInputStream();

            DataInputStream dis = new DataInputStream(is);

            

            System.out.println(dis.readUTF());

            

            dis.close();

            is.close();

            client.close();

            

         } catch (Exception e1) {

            // TODO Auto-generated catch block

            e1.printStackTrace();

         }

      }

      

   }

 

   HomeworkTueClient()

   {

      setBounds(300, 300, 400, 150);

      setLayout(null);

      JPanel jp = new JPanel();

      jp.setBounds(0, 0, 250, 200);

      jp.setLayout(null);

 

      JLabel jl1 = new JLabel("아이피");

      jl1.setBounds(20, 10, 50, 50);

      jp.add(jl1);

 

      jf1 = new JTextField();//아이피입력부

      jf1.setBounds(90, 10, 200, 50);

      jp.add(jf1);

      

      JLabel jl2 = new JLabel("포오트");//포트입력부

      jl2.setBounds(20, 60, 50, 50);

      jp.add(jl2);

      

      jf2 = new JTextField();

      jf2.setBounds(90, 60, 200, 50);

      jp.add(jf2);

      

      JButton jb = new JButton("저업속");

      jb.addActionListener(new NewWindow());

      jb.setBounds(270, 10, 100, 100);

      

      add(jb);

      add(jp);

      

      

      

      setVisible(true);

      setDefaultCloseOperation(EXIT_ON_CLOSE);

      

   }

   public static void main(String[] args) {

      new HomeworkTueClient();
     */