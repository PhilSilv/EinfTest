import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class AComponent extends JComponent {
	
	public void paintComponent(Graphics g){
		// Recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		
		// Draw directly in the Component
		//Rectangle box = new Rectangle(5, 10, 20, 30);
		//g2.draw(box);
		
		// Draw complex Shapes with outside class
		AClass class1 = new AClass(50, 200, 1);
		class1.draw(g2);
		
	}
	
}
