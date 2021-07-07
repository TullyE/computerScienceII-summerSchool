import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.JFrame;
import java.awt.event.*;

/**
ticTacToe
TullyE
06/28/2021
*/
public class ticTacToe extends JPanel implements MouseListener
{
   
   /**
   Constructor for our ticTacToe class
   Don't worry about this for now
   */
   private String[] gameBoard = new String[]{"none", "none", "none","none", "none", "none","none", "none", "none"};
   private String[] xNames = new String[]{"X1", "X2", "X3", "X4", "X5"};
   private String[] oNames = new String[]{"O1", "O2", "O3", "O4", "O5"};
   private int[] xPos = new int[]{99, 199, 299, 99, 199, 299, 99, 199, 299};
   private int[] yPos = new int[]{100, 100, 100, 200, 200, 200, 300, 300, 300};
   private int turn = 0;
   private int mouseX = 0; 
   private int mouseY = 0;
   private boolean showXWinScreen = false;
   private boolean showOWinScreen = false;
   private boolean showTieScreen = false;

   public ticTacToe()
   {
      setSize(new Dimension(500, 500));
      setPreferredSize(new Dimension(500,500));
      setVisible(true);
      // *****************************************
      // Request mouse input from the screen
      setFocusable(true);
      requestFocusInWindow();
      addMouseListener(this);
      // *****************************************
   }
   
   /**
    * @param e
    */
   public void mouseExited(MouseEvent e)
   {
   
   }
   
   /**
    * @param e
    */
   public void mouseEntered(MouseEvent e)
   {
   
   }
   
   /**
    * @param e
    */
   public void mousePressed(MouseEvent e)
   {
      // Example of getting the x location of the mouse
      this.mouseX = e.getX();
      this.mouseY = e.getY();
   }
   
   /**
    * @param e
    */
   public void mouseReleased(MouseEvent e)
   {
   
   }
   
   /**
    * @param e
    */
   public void mouseClicked(MouseEvent e)
   {
   
   }

   /**
    * Draws the gameboard 
    * @param g2
    * @param _board
    */
   public void drawBoard(Graphics2D g2, String[] _board)
   {
      for(int i = 0; i < _board.length; i += 1)
      {
            //https://www.javatpoint.com/Displaying-image-in-swing
            //Used to figure out how to display images
         if (i == 0)
         {
            if (_board[i].equals("x"))
            {
               Toolkit t = Toolkit.getDefaultToolkit();
               Image x = t.getImage("./Images/" + xNames[0] + ".png");
               g2.drawImage(x, xPos[i], yPos[i], this);
            }
            else if (_board[i].equals("o"))
            {
               Toolkit t = Toolkit.getDefaultToolkit();
               Image o = t.getImage("./Images/" + oNames[0] + ".png");
               g2.drawImage(o, xPos[i], yPos[i], this);
            } 
         }
         if ((i == 1) || (i == 3))
         {
            if (_board[i].equals("x"))
            {
               Toolkit t = Toolkit.getDefaultToolkit();
               Image x = t.getImage("./Images/" + xNames[1] + ".png");
               g2.drawImage(x, xPos[i], yPos[i], this);
            }
            else if (_board[i].equals("o"))
            {
               Toolkit t = Toolkit.getDefaultToolkit();
               Image o = t.getImage("./Images/" + oNames[1] + ".png");
               g2.drawImage(o, xPos[i], yPos[i], this);
            }
         }
         if ((i == 2) || (i == 4) || (i == 6))
         {
            if (_board[i].equals("x"))
            {
               Toolkit t = Toolkit.getDefaultToolkit();
               Image x = t.getImage("./Images/" + xNames[2] + ".png");
               g2.drawImage(x, xPos[i], yPos[i], this);
            }
            else if (_board[i].equals("o"))
            {
               Toolkit t = Toolkit.getDefaultToolkit();
               Image o = t.getImage("./Images/" + oNames[2] + ".png");
               g2.drawImage(o, xPos[i], yPos[i], this);
            }
         }
         if ((i == 5) || (i == 7))
         {
            if (_board[i].equals("x"))
            {
               Toolkit t = Toolkit.getDefaultToolkit();
               Image x = t.getImage("./Images/" + xNames[3] + ".png");
               g2.drawImage(x, xPos[i], yPos[i], this);
            }
            else if (_board[i].equals("o"))
            {
               Toolkit t = Toolkit.getDefaultToolkit();
               Image o = t.getImage("./Images/" + oNames[3] + ".png");
               g2.drawImage(o, xPos[i], yPos[i], this);
            }
         }
         if (i == 8)
         {
            if (_board[i].equals("x"))
            {
               Toolkit t = Toolkit.getDefaultToolkit();
               Image x = t.getImage("./Images/" + xNames[4] + ".png");
               g2.drawImage(x, xPos[i], yPos[i], this);
            }
            else if (_board[i].equals("o"))
            {
               Toolkit t = Toolkit.getDefaultToolkit();
               Image o = t.getImage("./Images/" + oNames[4] + ".png");
               g2.drawImage(o, xPos[i], yPos[i], this);
            }
         }
      }//2nd to last
      Toolkit b = Toolkit.getDefaultToolkit();
      Image tttBoard = b.getImage("./Images/TicTacToeBoard.png");
      g2.drawImage(tttBoard, 0, 0, this);
   }//last
   
   /**
    * set the background color
    * @param g2
    */
   public void createBackgroundColor(Graphics2D g2)
   {
    //g2.setColor(new Color(0, 0, 0));
      g2.setColor(new Color(244, 241, 222));
      Rectangle2D.Double background = new Rectangle2D.Double(0, 0, 500, 500);
      g2.draw(background);
      g2.fill(background);
   }
   
   /**
    * Checks the board for a win returns true or false
    * @param _board
    * @return
    */
   public boolean checkWin(String[] _board)
   {
      for(int i = 0; i <= 6; i += 3)
      {
         if ((_board[i] == _board[i+1]) && (_board[i] == _board[i+2]) && (!_board[i].equals("none")))
         {
            return true;
         }
      }
      for (int i = 0; i <= 2; i += 1)
      {
         if ((_board[i] == _board[i+3]) && (_board[i] == _board[i+6]) && (!_board[i].equals("none")))
         {
            return true;
         }
      }
      if (((_board[4] == _board[0]) && (_board[4] == _board[8])) || ((_board[4] == _board[2]) && (_board[4] == _board[6])))
      {
         if (!_board[4].equals("none"))
         {
            return true;
         }
      }
      return false;
   }
   
   /**
    * Checks the board for a tie returns true or false
    * @param _board
    * @return
    */
   public boolean checkTie(String[] _board)
   {
      for(String mark : _board)
      {
         if (mark.equals("none"))
         {
            return false;
         }
      }
      return true;
   }
   
   /**
    * Updates the game board
    * @param _board
    * @param pos
    * @param playerTurn
    */
   public void addMark(int pos, int playerTurn)
   {
      String marker = "o";
      if (playerTurn % 2 == 0)
      {
         marker = "x";
      }
      this.gameBoard[pos] = marker;
   }

   /**
    * give the user the current board
    * @return
    */
   public String[] getBoard()
   {
      return gameBoard;
   }
   
   /**
    * icrement the current player turn
    * @param n
    */
   public void nextTurn()
   {
      this.turn += 1;
   }

   /**
    * return a valid position to place a marker
    * @return
    */
   public int getPos()
   {
      if (this.mouseX >= 100 && this.mouseX <= 200)
      {
         if (this.mouseY >= 100 && this.mouseY <= 200)
         {
            if( this.gameBoard[0].equals("none"))
            {
               return 0;
            }
         }
         if (this.mouseY >= 200 && this.mouseY <= 300)
         {
            if( this.gameBoard[3].equals("none"))
            {
               return 3;
            }
         }
         if (this.mouseY >= 300 && this.mouseY <= 400)
         {
            if( this.gameBoard[6].equals("none"))
            {
               return 6;
            }
         }
      }
      if (this.mouseX >= 200 && this.mouseX <= 300)
      {
         if (this.mouseY >= 100 && this.mouseY <= 200)
         {
            if( this.gameBoard[1].equals("none"))
            {
               return 1;
            }
         }
         if (this.mouseY >= 200 && this.mouseY <= 300)
         {
            if( this.gameBoard[4].equals("none"))
            {
               return 4;
            }
         }
         if (this.mouseY >= 300 && this.mouseY <= 400)
         {
            if( this.gameBoard[7].equals("none"))
            {
               return 7;
            }
         }
      }
      if (this.mouseX >= 300 && this.mouseX <= 400)
      {
         if (this.mouseY >= 100 && this.mouseY <= 200)
         {
            if( this.gameBoard[2].equals("none"))
            {
               return 2;
            }
         }
         if (this.mouseY >= 200 && this.mouseY <= 300)
         {
            if( this.gameBoard[5].equals("none"))
            {
               return 5;
            }
         }
         if (this.mouseY >= 300 && this.mouseY <= 400)
         {
            if( this.gameBoard[8].equals("none"))
            {
               return 8;
            }
         }
      }
      return 10;
   }
   //GETTERS AND SETTERTS
   /**
    * return the current player turn Even is x Odd is O
    * @return
    */
   public int getTurn()
   {
      return this.turn;
   }
   
   /**
    * return set the value of tie screen
    * @return
    */
   public void setTie(boolean n)
   {
      this.showTieScreen = n;
   }

   /**
    * set the value of OWinScreen
    * @param n
    */
   public void setOWin(boolean n)
   {
      this.showOWinScreen = n;
   }
   
   /**
    * set the value of ShowXWinScreen
    * @param n
    */
   public void setXWin(boolean n)
   {
      this.showXWinScreen = n;
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
      createBackgroundColor(g2);
    // If you pass the Graphics2D variable g2 into your method as a parameter
    // You can use all the drawing methods inside your other method
      drawBoard(g2, gameBoard);
      if (showXWinScreen)
      {
         Toolkit t = Toolkit.getDefaultToolkit();
         Image xWins = t.getImage("./Images/xWins.png");
         g.drawImage(xWins, 0, 0, this);
      }
      else if (showOWinScreen)
      {
         Toolkit t = Toolkit.getDefaultToolkit();
         Image oWins = t.getImage("./Images/oWins.png");
         g.drawImage(oWins, 0, 0, this);
      }
      else if (showTieScreen)
      {
         Toolkit t = Toolkit.getDefaultToolkit();
         Image tie = t.getImage("./Images/tie.png");
         g.drawImage(tie, 0, 0, this);
      }
      else
      {
         if (this.turn % 2 == 0)
         {
            Toolkit t = Toolkit.getDefaultToolkit();
            Image xTurn = t.getImage("./Images/xTurn.png");
            g.drawImage(xTurn, 0, 0, this);
         }  
         else
         {
            Toolkit t = Toolkit.getDefaultToolkit();
            Image oTurn = t.getImage("./Images/oTurn.png");
            g.drawImage(oTurn, 0, 0, this);
         }
      }
   }
   
   public static void playTicTacToe()
   {
      JFrame myFrame = new JFrame("Tic Tac Toe");
      myFrame.setSize(new Dimension(517,540));
      myFrame.setPreferredSize(new Dimension(517,540));
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ticTacToe gameOne = new ticTacToe();
      myFrame.add(gameOne); 
      myFrame.pack();
      myFrame.setVisible(true);
      myFrame.setResizable(false);
      boolean playing = true;
      while (playing)
      {
         int position = gameOne.getPos();
         while (position == 10)
         {
            position = gameOne.getPos();
         }
         gameOne.addMark(position, gameOne.getTurn());
            //https://stackoverflow.com/questions/7628121/how-can-i-refresh-or-reload-the-jframe
         myFrame.invalidate();
         myFrame.validate();
         myFrame.repaint();
         if (gameOne.checkWin(gameOne.getBoard()))
         {
            if (gameOne.getTurn()%2 == 0)
            {
               gameOne.setXWin(true);
               break;
            }
            else
            {
               gameOne.setOWin(true);
               break;
            }
         }
         if (gameOne.checkTie(gameOne.getBoard()))
         {
            gameOne.setTie(true);
            break;
         }
         gameOne.nextTurn();
      }
      myFrame.invalidate();
      myFrame.validate();
      myFrame.repaint();
      return;
   }
   /**
   Main Method
   Makes a new JFrame and adds the Canvas to it
   */
   public static void main(String[] args)
   {
      System.out.println(">>WRONG FILE<<");
   }
}