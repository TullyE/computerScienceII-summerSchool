import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

/**
Basic Graphics Program
NAMES HERE
06/22/2021
*/
public class MyCanvas extends JPanel
{
   
   /**
   Constructor for our MyCanvas class
   Don't worry about this for now
   */
   public MyCanvas()
   {
      setSize(new Dimension(500, 500));
      setPreferredSize(new Dimension(500,500));
      setVisible(true);
   }
   
   /**
   bounceBall method to display the path of a bouncing ball
   asussuming bounce of 70% the original height (restitution)
   @param g2
   @param height
   @param iters
   */
   public void bounceBall(Graphics2D g2, double height, int iters)
   {
      int w = 15, h = 15;
      double x = 0, y = height, xDiv = 500/iters;
      for (int i = 0; i <= iters; i += 1)
      { 
         Ellipse2D.Double myBall = new Ellipse2D.Double(x, 500-y, w, h);
         Line2D.Double downLine = new Line2D.Double(x+7.5, 500-y+7.5, x + xDiv, 500);
         g2.setColor(new Color(0, 0, 255));
         g2.draw(downLine);
         g2.setColor(new Color(255, 0, 0));
         g2.fill(myBall);
         Line2D.Double upLine = new Line2D.Double(x + xDiv, 500, x + xDiv+7.5, 500-y * .8);
         g2.setColor(new Color(0, 0, 255));
         g2.draw(upLine);
         y = y * .8;
         x += xDiv;
      }
   }
   
   /**
   This method renders objects on the screen. This is where
   you will make changes, declare variables, and draw different
   scenes. The comment inside the method explains how this works
   in the context of Java.
   */
   public void paintComponent(Graphics g)
   {
      // Casting Operation
      // g2 -> representing some paintbrush
      Graphics2D g2 = (Graphics2D) g;
      System.out.println("made it here somehow");
      // If you pass the Graphics2D variable g2 into your method as a parameter
      // You can use all the drawing methods inside your other method
      bounceBall(g2, 400, 20);
   }
   
   /**
   Main Method
   Makes a new JFrame and adds the Canvas to it
   */
   public static void main(String[] args)
   {
      JFrame myFrame = new JFrame("My Frame");
      myFrame.setSize(new Dimension(500,500));
      myFrame.setPreferredSize(new Dimension(550,550));
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.add(new MyCanvas());
      myFrame.pack();
      myFrame.setVisible(true);
   }

}