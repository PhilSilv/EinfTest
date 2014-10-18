import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class AClass {
	// Class variables
	private int x;
	private int y;
	private int w = 100;
	private int h = 100;
	private Point2D.Double pointRoofTip;
	private Point2D.Double pointRoofLeft;
	private Point2D.Double pointRoofRight;
	
	public AClass(int x, int y, int f){
		this.x=x;
		this.y=y;
		this.pointRoofTip = new Point2D.Double(x+(w/2), y-h-(h/2));
		this.pointRoofLeft = new Point2D.Double(x, y-h);
		this.pointRoofRight = new Point2D.Double(x+w, y-h);
	}
	
	public void draw(Graphics2D g2){
		// define shapes
		Rectangle block = new Rectangle(x, y-h, w, h);
		Line2D.Double lineRoofLeft = new Line2D.Double(pointRoofLeft, pointRoofTip);
		Line2D.Double lineRoofRight = new Line2D.Double(pointRoofTip, pointRoofRight);
		
		// draw them
		g2.draw(block);
		g2.draw(lineRoofLeft);
		g2.draw(lineRoofRight);
	}
}