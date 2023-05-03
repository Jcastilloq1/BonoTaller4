package co.edu.uniandes.graphics.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JPanel;


public class PanelLienzo extends JPanel
{
	
	public PanelLienzo()
	{
		
	
		setSize(700, 700);
	}
	@Override
	public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D  g2d = (Graphics2D) g;
        
        g2d.setColor(Color.GRAY);
        g2d.drawRect(0, 0, 400, 400);
        
        Ellipse2D.Double ellipse = new Ellipse2D.Double(350,30,100,100);
        g2d.setColor(Color.BLACK);
        g2d.draw(ellipse);
        
        g2d.setColor(Color.BLACK);
        g2d.drawRect(390, 130, 20, 40);
        
        RoundRectangle2D.Double rectangle = new RoundRectangle2D.Double(320,170,25,180, 20,20);
        g2d.setColor(Color.BLACK);
        g2d.draw(rectangle);
        
        RoundRectangle2D.Double rectangle2 = new RoundRectangle2D.Double(455,170,25,180, 20,20);
        g2d.setColor(Color.BLACK);
        g2d.draw(rectangle2);
        
        g2d.setColor(Color.GRAY);
        g2d.drawRect(335, 170, 130, 40);
        
        RoundRectangle2D.Double rectangle3 = new RoundRectangle2D.Double(345,200,15,40, 20,20);
        g2d.setColor(Color.GRAY);
        g2d.draw(rectangle3);
        
        RoundRectangle2D.Double rectangle4 = new RoundRectangle2D.Double(440,200,15,40, 20,20);
        g2d.setColor(Color.GRAY);
        g2d.draw(rectangle4);
        
        g2d.setColor(Color.BLACK);
        g2d.drawRect(360, 170, 80, 180);
        
        RoundRectangle2D.Double rectangle5 = new RoundRectangle2D.Double(360,330,35,180, 20,20);
        g2d.setColor(Color.BLACK);
        g2d.draw(rectangle5);
        
        RoundRectangle2D.Double rectangle6 = new RoundRectangle2D.Double(405,330,35,180, 20,20);
        g2d.setColor(Color.BLACK);
        g2d.draw(rectangle6);
       
        int[] arrx = {230, 250, 550, 570};
		int[] arry = {550, 500, 500, 550};
		Polygon rectangle7 = new Polygon(arrx, arry, 4);
        g2d.setColor(Color.BLACK);
        g2d.drawPolygon(rectangle7);
        
        g2d.setColor(Color.BLACK);
        g2d.fillRect(455,320, 25, 10);
        
        g2d.setColor(Color.YELLOW);
        g2d.fillOval(463, 320, 10, 10);
        
        g2d.setColor(Color.GRAY);
        g2d.drawOval(463, 350, 10, 10);
        
        g2d.setColor(Color.GRAY);
        g2d.fillOval(463, 360, 10, 10);
        
        g2d.setColor(Color.GRAY);
        g2d.fillRect(467,370, 3, 15);
        
        g2d.setColor(Color.BLUE);
        g2d.fillRect(50,240, 250, 250);
        
        g2d.setColor(Color.WHITE);
        g2d.drawLine(300, 240, 50, 490);
        
        g2d.setColor(Color.WHITE);
        g2d.drawLine(70, 270, 70, 330);
        
        g2d.setColor(Color.WHITE);
        g2d.drawLine(70, 270, 110, 320);
        
        g2d.setColor(Color.WHITE);
        g2d.drawLine(110, 320, 150, 270);
        
        g2d.setColor(Color.WHITE);
        g2d.drawLine(150, 270, 150, 330);
        
        g2d.setColor(Color.WHITE);
        g2d.drawOval(160, 390, 70, 70);
        
        g2d.setColor(Color.WHITE);
        g2d.drawOval(210, 390, 70, 70);
        
        int ancho, alto;
        int x2,y2, x1, y1;
        
        ancho = getWidth();
        alto = getHeight();
        
        
        g.setColor(Color.YELLOW);
        x1=0;
        for (y2=alto/2; y2>=0; y2-=10){
            g.drawLine(x1, alto/2, ancho/2, y2);
            x1+=10;
        }
        x1=0;
        for (y2=alto/2; y2<=alto; y2+=10){
            g.drawLine(x1, alto/2, ancho/2, y2);
            x1+=10;
        }
        x2=ancho/2;
        for (y1=0; y1<=alto/2; y1+=10){
            g.drawLine(ancho/2, y1, x2, alto/2);
            x2+=10;
        }
        x2=ancho/2;
        for (y1=alto; y1>=alto/2; y1-=10){
            g.drawLine(ancho/2, y1, x2, alto/2);
            x2+=10;
        }
        
        
        
        
        
        
    }
}
