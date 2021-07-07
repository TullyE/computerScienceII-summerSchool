import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.Random;

/**
Basic Graphics Program
NAMES HERE
06/22/2021
*/
public class MyCanvas extends JPanel implements KeyListener
{
   // ****************************************************************************************
   // Notice how the class implements the KeyListener interface
   // Check your import statements at the top of your code and make sure everything is there!
   // ****************************************************************************************
   
   /**
   Constructor for our MyCanvas class
   Sets up the screen correctly with all the variables
   and properties to consider
   */
   public MyCanvas()
   {
      setSize(new Dimension(500, 500));
      setPreferredSize(new Dimension(500,500));
      setVisible(true);
      // *****************************************
      // Request key input from the screen
      setFocusable(true);
      requestFocusInWindow();
      addKeyListener(this);
      // *****************************************

   }
   
   // ***********************************************************************
   // Methods that must be declared for keyboard input to work
   // These methods are triggered whenever a key event is detected on the Canvas
   
   public void keyPressed(KeyEvent e)
   {
      // *****************************************************
      // To get the key that triggered the event...
      // Most keys are included in KeyEvent.VK_<SOMEKEY>
      // These are integers in the KeyEvent class representing
      // keys on typical keyboards
      // *****************************************************
      int key = e.getKeyCode();
      System.out.println(key);

      // *****************************************************
   }
   
   public void keyReleased(KeyEvent e)
   {
   
   }
   
   public void keyTyped(KeyEvent e)
   {
   
   }
   
   // ***********************************************************************
   // ***********************************************************************
  
   /**
   This method renders objects on the screen. This is where
   you will make changes, declare variables, and draw different
   scenes. The comment inside the method explains how this works
   in the context of Java.
   */
   public void paintComponent(Graphics g)
   {
      // Clear the screen
      super.paintComponent(g);
      // Casting Operation
      // g2 -> representing some paintbrush
      Graphics2D g2 = (Graphics2D) g;
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
      myFrame.add(new MyCanvas());
      myFrame.pack();
      myFrame.setVisible(true);
   }

}