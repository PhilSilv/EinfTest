import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;

/**
   This class draws a house by allowing the user to specify houses of different sizes.
*/
public class House
{
   private int x;
   private int y;
   private int w;
   private int h;

   /**
      Constructor to initiate the bottom left corner, the w, and the h.
      @param X the left corner coordinate
      @param Y the bottom corner coordinate
      @param W the width of the house
      @param H the height of the house
   */
   public House(int X, int Y, int W, int H)
   {
      x = X;
      y = Y;
      w = W;
      h = H;
   }

   public void move(int movex, int movey)
   {
      x = x + movex;
      y = y + movey;
   }
   
   /**
      Draws the house.
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2)
   {
      Rectangle front  = new Rectangle(x, y-w, w, w);
      Rectangle door   = new Rectangle(x+w/5, y-w/2, w/5, w/2);
      Rectangle window = new Rectangle(x+w*3/5, y-w/2, w/5, w/5);
      Line2D.Double roofL = new Line2D.Double(x, y-w, x+w/2, y-h);
      Line2D.Double roofR = new Line2D.Double(x+w, y-w, x+w/2, y-h);

      g2.draw(front);
      g2.draw(door);
      g2.draw(window);
      g2.draw(roofL);
      g2.draw(roofR);
   }
   
   public void draw(Graphics g)
   {
      g.drawRect(x, y-w, w, w);
      g.drawRect(x+w/5, y-w/2, w/5, w/2);
      g.drawRect(x+w*3/5, y-w/2, w/5, w/5);
      g.drawLine(x, y-w, x+w/2, y-h);
      g.drawLine(x+w, y-w, x+w/2, y-h);
   }
}
