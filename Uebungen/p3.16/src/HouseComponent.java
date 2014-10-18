import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;

import javax.swing.JComponent;

// serial ist ein Feature der Klasse JComponent, mit der die Ausgabe auf eine Disk geschrieben wird.
@SuppressWarnings("serial")
public class HouseComponent extends JComponent {
	
	public void paintComponent(Graphics g){
		// Recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		//Rectangle box = new Rectangle(5, 10, 20, 30);
		//g2.draw(box);
		
		//box.translate(15, 25);
		//g2.draw(box);
		//g2.scale(2.0, 1.0);
		
		House house1 = new House(50, 200, 1);
		House house2 = new House(4, 50, 30, 20);
		House house3 = new House(20, 50, 50, 70);
		
		house2.draw(g);
		
		//g2.scale(2.0, 1.0);
		//setzt Transformation wieder zurück
		//g2.setTransform(new AffineTransform());
		house2.rotate(g2, Math.PI/4);
		house1.draw(g2);
		house3.draw(g2);
	}
	
}
