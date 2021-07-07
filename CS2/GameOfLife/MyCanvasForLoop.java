import javax.lang.model.util.ElementScanner14;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.Random;

/**
Game of Life
Tully, Rishi, Sarah
06/30/2021
*/
public class MyCanvasForLoop extends JPanel
{
   // Define the grid
   private boolean[][] grid = new boolean[100][100];
   
   // Define thread variable for animation
   private Thread anim = new Thread(new UpdateScreen());
   
   /**
   Constructor for our MyCanvas class
   Sets up the screen correctly with all the variables
   and properties to consider
   */
   public MyCanvasForLoop()
   {
      setSize(new Dimension(500, 500));
      setPreferredSize(new Dimension(500,500));
      setVisible(true);
      // Initialize the board
      initializeBoard(grid);
      // Start the animation
      // The animation updates the board and updates
      // the screen continually...
      anim.start();
   }
   
   // *********************************************************************************************
   // *********************************************************************************************
   // *********************************************************************************************
   
   /**
   Method should properly initialize the board with random true/false values
   Each row/col location in the grid array must be initialized properly!
   */
   public void initializeBoard(boolean[][] grid)
   {
      for (int row = 0; row < grid.length; row += 1)
      {
         for (int col = 0; col < grid[0].length; col += 1)
         {
            Random rand = new Random();
            boolean randBoolean = rand.nextBoolean();
            grid[row][col] = randBoolean;
         }
      }
   }
   
   /**
   Checks whether a cell is a valid cell to check on the grid
   Basically, this method checks for whether a row/col location is
   out of bounds or not. This method is important because we can
   only use valid index values that are within the bounds of the array!
   @return boolean result representing true (valid loc) or false (invalid loc)
   */
   public boolean isValidCell(boolean[][] grid, int row, int col)
   {
      if (row < 0 || row >= grid.length)
      {
         return false;
      }
      if (col < 0 || col >= grid[0].length)
      {
         return false;
      }
      return true;
   }
   
   /**
   Method should update the state of the board based on the
   rules of Conway's game of life. You should make a temporary
   2D boolean array to store the new board configuration based
   on the rules, and then copy the temporary board back into
   grid element by element
   */
   public void updateBoard(boolean[][] grid)
   {
      boolean[][] tempGrid = new boolean[100][100];
      int nextToAlive = 0;
      for (int row = 0; row < grid.length; row += 1)
      {
         for (int col = 0; col < grid[0].length; col += 1)
         {
            nextToAlive = 0;
            for(int i = -1; i < 2; i += 2) //reduces if staements by 4:: calculated by looking at the if statements and finding patterns
            {
               if (isValidCell(grid, row+i, col+i))
               {
                  if(grid[row+i][col+i])
                  {
                     nextToAlive += 1;
                  }
               }
               if (isValidCell(grid, row+((-1)*i), col+i))
               {
                  if(grid[row+((-1)*i)][col+i])
                  {
                     nextToAlive += 1;
                  }
               }
               if (isValidCell(grid, row, col+i))
               {
                  if(grid[row][col+i])
                  {
                     nextToAlive += 1;
                  }
               }
               if (isValidCell(grid, row+i, col))
               {
                  if(grid[row+i][col])
                  {
                     nextToAlive += 1;
                  }
               }
            }
            if (grid[row][col]) //if the cell is alive
            {
               if ((nextToAlive < 2) || (nextToAlive > 3))
               {
                  tempGrid[row][col] = false;
                  continue;
               }
               if (nextToAlive == 2 || nextToAlive == 3)
               {
                  tempGrid[row][col] = true;
                  continue;
               }
            }
            else //if the cell is dead
            {
               if (nextToAlive == 3)
               {
                  tempGrid[row][col] = true;
               }
            }
         }
      }
      for (int row = 0; row < grid.length; row += 1)
      {
         for (int col = 0; col < grid[0].length; col += 1)
         {
            grid[row][col] = tempGrid[row][col];
         }
      }
   }
   /**
   Method should draw the grid to the screen 
   The grid should be colored appropriately depending
   on whether cells are alive or dead. Follow the rules!
   You must use nested loops to receive full credit on this method...
   @param g2
   @param grid a 2D array of boolean values
   */
   public void drawBoard(Graphics2D g2, boolean[][] grid)
   {
      int squareDim = 500/grid.length, y1 = 0, x1 = 0;
      for (int row = 0; row < grid.length; row += 1)
      {
         x1 = 0;
         for (int col = 0; col < grid[0].length; col += 1)
         {
            if (grid[row][col])
            {  
            
               g2.setColor(new Color(255, 0, 0));
               Rectangle2D.Double redSquare = new Rectangle2D.Double(x1,y1, squareDim, squareDim);
               g2.draw(redSquare);
               g2.fill(redSquare);
            }
            else
            {
               g2.setColor(new Color(0, 0, 0));
               Rectangle2D.Double whiteSquare = new Rectangle2D.Double(x1,y1, squareDim, squareDim);
               g2.draw(whiteSquare);
               //g2.fill(whiteSquare);
            }
            x1 += squareDim;
         }
         y1 += squareDim;
      }
   }
   // *********************************************************************************************
   // *********************************************************************************************
   // *********************************************************************************************
   
   /**
   This method takes care of the animation portion of the simulation.
   All this method does is call repaint() in an infinite loop. Any
   call to repaint() in this file automatically runs paintComponent() again.
   */
   private class UpdateScreen implements Runnable
   {
      public void run()
      {
         while(true)
         {  
            System.out.println("RUNNING");
            try
            {
               Thread.sleep(60);
               // Repaint runs the paintComponent method exactly once
               repaint();
            }
            catch(Exception e)
            {
            
            }
         }
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
      // Clear the screen
      super.paintComponent(g);
      // Casting Operation
      // g2 -> representing some paintbrush
      Graphics2D g2 = (Graphics2D) g;
      g2.setBackground(Color.WHITE);
      // If you pass the Graphics2D variable g2 into your method as a parameter
      // You can use all the drawing methods inside your other method
      updateBoard(grid);
      drawBoard(g2, grid);
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