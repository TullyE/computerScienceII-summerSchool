import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

/**
Basic Graphics Program
TullyE
06/22/2021
*/
public class MyCanvas extends JPanel
{
   
   /**
   Constructor for our MyCanvas class
   */
   public MyCanvas()
   {
      setSize(new Dimension(500, 500));
      setPreferredSize(new Dimension(500,500));
      setVisible(true);
   }
   
   /**
   This method renders objects on the screen. This is where
   you will make changes, declare variables, and draw different
   scenes. The comment inside the method explains how this works
   in the context of Java.
   */
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      
      /**
      The following code is necessary to draw a shape to the screen!
      1) Make a shape variable. Make the variable name descriptive.
            Ellipse2D.Double myCirc = new Ellipse2D.Double(x, y, w, h);
            Rectangle2D.Double myRect = new Rectangle2D.Double(x, y, w, h);
      2) Choose a color for that particular shape by specifying r, g, b
            g2.setColor(new Color(r, g, b));
         Think of g2 as the paint brush for this particular program.
         We are just changing the color
      3) Now we need to fill the shape with that color! This also draws it
         to the screen
            g2.fill(myCirc);
            g2.fill(myRect);
      4) If you do not want to fill the shape, but just have the outline,
      See the code below for these ideas in action!
      */
      
      // Blue
      int bluex1 = 0;
      int bluey1 = 0;
      int bluew1 = 275;
      int blueh1 = 300;
      
      // Sun Circle
      int sunCirclex1 = 100;
      int sunCircley1 = 50;
      int sunCirclew1 = 50;
      int sunCircleh1 = 50;
      
      // Sun Ray 1 (Top)
      int sunRayx1 = 125;
      int sunRayy1 = 10;
      int sunRayw1 = 2;
      int sunRayh1 = 30;
      
      // Sun Ray 2 (Bottem)
      int sunRayx2 = 125;
      int sunRayy2 = 110;
      int sunRayw2 = 2;
      int sunRayh2 = 30;
      
      // Sun Ray 3 (Left)
      int sunRayx3 = 60;
      int sunRayy3 = 75;
      int sunRayw3 = 30;
      int sunRayh3 = 2;
      
      // Sun Ray 4 (Right)
      int sunRayx4 = 160;
      int sunRayy4 = 75;
      int sunRayw4 = 30;
      int sunRayh4 = 2;
      
      // Blue Rectangle
      Rectangle2D.Double blueSky = new Rectangle2D.Double(bluex1, bluey1, bluew1, blueh1);
      g2.setColor(new Color(20, 10, 200));
      g2.fill(blueSky);
      
      // Sun Circle
      Ellipse2D.Double myCirc = new Ellipse2D.Double(sunCirclex1, sunCircley1, sunCirclew1, sunCircleh1);
      g2.setColor(new Color(255,255,0));
      g2.fill(myCirc);
      
      // Sun Ray 1
      Rectangle2D.Double sunRay1 = new Rectangle2D.Double(sunRayx1, sunRayy1, sunRayw1, sunRayh1);
      g2.setColor(new Color(255,255,0));
      g2.fill(sunRay1);  
      
      // Sun Ray 2
      Rectangle2D.Double sunRay2 = new Rectangle2D.Double(sunRayx2, sunRayy2, sunRayw2, sunRayh2);
      g2.setColor(new Color(255,255,0));
      g2.fill(sunRay2);
      
      // Sun Ray 3
      Rectangle2D.Double sunRay3 = new Rectangle2D.Double(sunRayx3, sunRayy3, sunRayw3, sunRayh3);
      g2.setColor(new Color(255,255,0));
      g2.fill(sunRay3);
      
      // Sun Ray 4
      Rectangle2D.Double sunRay4 = new Rectangle2D.Double(sunRayx4, sunRayy4, sunRayw4, sunRayh4);
      g2.setColor(new Color(255,255,0));
      g2.fill(sunRay4);   
      
      // Diagonal Rays
      g2.fillPolygon(new int[]{75,65,100}, new int[]{15,15,50}, 3); 
      g2.fillPolygon(new int[]{150,165,175}, new int[]{100,110,125}, 3);
      g2.fillPolygon(new int[]{75,65,100}, new int[]{125,120,100}, 3); 
      g2.fillPolygon(new int[]{150,140,175}, new int[]{50,40,10}, 3);   
      
      // Hill locations
      int x1Hill = 100;
      int y1Hill = 225;
      int x2Hill = 100;
      int y2Hill = 300;
      int x3Hill = 200;
      int y3Hill = 300;

     
      // Drawing a triangle hill
      g2.setColor(new Color(50,205,50));
      g2.fillPolygon(new int[]{x1Hill,x2Hill,x3Hill}, new int[]{y1Hill,y2Hill,y3Hill}, 3);   
      
      // Building one locations
      int xBuild1 = 0;
      int yBuild1 = 125;
      int wBuild1 = 50;
      int hBuild1 = 175;
      
      // Variables for building one
      Rectangle2D.Double build1 = new Rectangle2D.Double(xBuild1, yBuild1, wBuild1, hBuild1);
      g2.setColor(new Color(128,128,128));
      g2.fill(build1);

      // Building two locations
      int xBuild2 = 50;
      int yBuild2 = 150;
      int wBuild2 = 50;
      int hBuild2 = 150;
     
      // Variables for building two
      Rectangle2D.Double build2 = new Rectangle2D.Double(xBuild2, yBuild2, wBuild2, hBuild2);
      g2.setColor(new Color(169,169,169));
      g2.fill(build2);
      
      // Variables for house locations
      int x1 = 175;
      int y1 = 200;
      int w1 = 100;
      int h1 = 100;
     
      // Variables for door locations
      int x2 = 190;
      int y2 = 282;
      int w2 = 10;
      int h2 = 18;
     
      // Variables for window1 locations
      int x3 = 177;
      int y3 = 282;
      int w3 = 10;
      int h3 = 10;
     
      // Variables for window2 locations
      int x4 = 240;
      int y4 = 215;
      int w4 = 25;
      int h4 = 15;
     
     
      // Variables for myRect that is of type Rectangle2D.Double
      Rectangle2D.Double myRect1 = new Rectangle2D.Double(x1, y1, w1, h1);
      g2.setColor(new Color(255, 0, 255));
      g2.fill(myRect1);
     
      // Variables for myRect2 that is of type Rectangle2D.Double
      Rectangle2D.Double myRect2 = new Rectangle2D.Double(x2, y2, w2, h2);
      g2.setColor(new Color(117, 92, 34));
      g2.fill(myRect2);
     
      // Variables for myRect3 that is of type Rectangle2D.Double
      Rectangle2D.Double myRect3 = new Rectangle2D.Double(x3, y3, w3, h3);
      g2.setColor(new Color(0, 191, 255));
      g2.fill(myRect3);
     
      // Variables for myRect4 that is of type Rectangle2D.Double
      Rectangle2D.Double myRect4 = new Rectangle2D.Double(x4, y4, w4, h4);
      g2.setColor(new Color(0, 191, 255));
      g2.fill(myRect4);
     

      // To draw a polygon of an arbitrary shape, call the drawPolygon method
      // or the fillPolygon method
      // It takes 2 lists, 1 list of the x coordinates, 1 list of y coordinates
      // It also takes the number of coordinates
      g2.fillPolygon(new int[]{170,225,280}, new int[]{200,180,200}, 3); // points of the polygon: (0,0), (0,150), and 150, 150)
      g2.setColor(new Color(255, 0, 0));
      
         }
   
   /**
   Main Method
   Makes a new JFrame and adds the Canvas to it
   */
   public static void main(String[] args)
   {
      JFrame myFrame = new JFrame("My Frame");
      myFrame.setSize(new Dimension(290,338));
      myFrame.setPreferredSize(new Dimension(290,338));
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.add(new MyCanvas());
      myFrame.pack();
      myFrame.setVisible(true);
   }

}