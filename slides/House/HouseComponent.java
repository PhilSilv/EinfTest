import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;

/**
   Draws a few houses of different sizes.
 */
@SuppressWarnings("serial")
public class HouseComponent extends JComponent
{
   House house1;
   House house2;
   House house3;
   
   public void createHouses()
   {
      house1 = new House(100, 150, 100, 120);
      house2 = new House(210, 200, 50, 70);
      house3 = new House(260, 260, 20, 25);
   }
   
   public void paintComponent(Graphics g)
   {
      // Draws a house with given coordinates

      Graphics2D g2 = (Graphics2D) g;

      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
                          RenderingHints.VALUE_ANTIALIAS_ON);

      //house1.move(1,0);
      
      /*
      house1.draw(g2);
      house2.draw(g);
      house3.draw(g2);
      */
      
      
      house1.draw(g2);
      g2.scale(2.0, 0.5);
      house1.draw(g2);
      
      g2.setTransform(new AffineTransform());
      g2.rotate(Math.PI/4);
      house1.draw(g);
      g2.setTransform(new AffineTransform());
      g2.translate(50, 50);
      house1.draw(g);
      
      
   }
}