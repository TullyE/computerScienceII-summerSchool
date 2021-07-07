import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

/**
Basic Graphics Program
TullyE
06/28/2021
*/
public class Checkerboard extends JPanel
{
   
   /**
   Constructor for our MyCanvas class
   Don't worry about this for now
   */
   public Checkerboard()
   {
      setSize(new Dimension(500, 500));
      setPreferredSize(new Dimension(500,500));
      setVisible(true);
   }
   
   /**
   Method should draw a checkerboard of dim x dim size
   The checkerboard should be colored appropriately
   and fit within the 500 x 500 window. You must use nested
   loops to receive full credit on this method...
   @param g2
   @param dim
   */
   public void drawBoard(Graphics2D g2, int dim)
   {
      int squareDim = 500/dim, x1 = 0, y1 = 0, c1R = 255, c1G = 255, c1B = 255, c2R = 0, c2G = 0, c2B = 0;
      for(int y = 0; y < dim; y += 1)
      {
         x1 = 0;
         for(int x = 0; x < dim; x += 1)
         {
            if (x%2 == 0)
            {
               if(y%2 == 0)
               {
                  g2.setColor(new Color(c1R, c1G, c1B));
                  Rectangle2D.Double whiteSquare = new Rectangle2D.Double(x1,y1, squareDim, squareDim);
                  g2.draw(whiteSquare);
                  g2.fill(whiteSquare);
               }
               else
               {
                  g2.setColor(new Color(c2R, c2G, c2B));
                  Rectangle2D.Double whiteSquare = new Rectangle2D.Double(x1,y1, squareDim, squareDim);
                  g2.draw(whiteSquare);
                  g2.fill(whiteSquare);
               }
            }
            else
            {
               if(y%2 == 0)
               {
                  g2.setColor(new Color(c2R, c2G, c2B));
                  Rectangle2D.Double whiteSquare = new Rectangle2D.Double(x1,y1, squareDim, squareDim);
                  g2.draw(whiteSquare);
                  g2.fill(whiteSquare);
               }
               else
               {
                  g2.setColor(new Color(c1R, c1G, c1B));
                  Rectangle2D.Double whiteSquare = new Rectangle2D.Double(x1,y1, squareDim, squareDim);
                  g2.draw(whiteSquare);
                  g2.fill(whiteSquare);
               }
            }
            x1 += squareDim;
         }
         y1 += squareDim;
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
      
      // If you pass the Graphics2D variable g2 into your method as a parameter
      // You can use all the drawing methods inside your other method
      drawBoard(g2, 8);
   }
   
   /**
   Main Method
   Makes a new JFrame and adds the Canvas to it
   */
   public static void main(String[] args)
   {
      JFrame myFrame = new JFrame("My Frame");
      myFrame.setSize(new Dimension(500,500));
      myFrame.setPreferredSize(new Dimension(500,500));
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.add(new Checkerboard());
      myFrame.pack();
      myFrame.setVisible(true);
   }

}