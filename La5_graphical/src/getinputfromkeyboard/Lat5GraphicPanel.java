package getinputfromkeyboard;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;


/**
 *
 * @author MY PC
 */

//public class Lat5GraphicPanel {
 public class Lat5GraphicPanel extends Panel {
 public Lat5GraphicPanel() {
 setBackground(Color.white);
 }
 public void paint(Graphics g) {
 g.setColor(new Color(0,255,0)); //green
 g.setFont(new Font("Helvetica",Font.PLAIN,16));
 g.drawString("Sony Solahudin!", 30, 100);
 g.setColor(new Color(1.0f,0,0)); //red
 g.fillRect(30, 100, 150, 10);
 } 
public static void main(String args[]) {
 Frame f = new Frame("Testing Graphics Panel");
 Lat5GraphicPanel gp = new Lat5GraphicPanel();
 f.add(gp);
 f.setSize(600, 300);
 f.setVisible(true);
 }
 } 
