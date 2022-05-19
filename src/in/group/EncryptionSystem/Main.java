package in.group.EncryptionSystem;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.*;



public class Main {
ImageIcon image;
Dimension d = null;
  public Main() {
  	JFrame frame = new JFrame("Cryptography Applicaton");
  	d=Toolkit.getDefaultToolkit().getScreenSize();
  	frame.setSize(d.width/2, d.height/2);
	frame.setLocation(d.width/4,d.height/4);
	frame.setResizable(false);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JPanel panel1=new JPanel();
JPanel panel2=new JPanel();
JPanel panel3=new JPanel();
panel1.setPreferredSize(new Dimension(100,100));
panel2.setPreferredSize(new Dimension(100,100));
panel3.setPreferredSize(new Dimension(100,100));
panel1.setOpaque(true);
panel2.setOpaque(true);
panel3.setOpaque(true);
panel1.setBackground(Color.darkGray);
panel1.setForeground(Color.red);
panel2.setBackground(Color.black);
panel2.setForeground(Color.red);
panel3.setBackground(Color.darkGray);
panel3.setForeground(Color.red);
JLabel msg=new JLabel("LOADING............");
panel1.add(msg);
frame.add(panel1,BorderLayout.NORTH);
frame.add(panel2,BorderLayout.CENTER);
frame.add(panel3,BorderLayout.SOUTH); 

new Cryptography();

}
public static void main(String args[]) throws Exception {
  	new Main();
  }
}