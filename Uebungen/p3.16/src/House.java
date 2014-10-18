import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * A house shape to draw on Component
 * @author Muryoutaisuu
 *
 */
public class House {
	// Class variables
	private int x;
	private int y;
	private int w = 100;
	private int h = 100;
	private double f;
	private Point2D.Double pointRoofTip;
	private Point2D.Double pointRoofLeft;
	private Point2D.Double pointRoofRight;
	
	
	/**
	 * Constructor for House Class. Sets up global Variables.
	 * @param x X-coordinate of left bottom corner
	 * @param y Y-coordinate of left bottom corner
	 * @param w Width of house
	 * @param h Height of house
	 */
	public House(int x, int y, double f){
		this.x=x;
		this.y=y;
		this.f=f;
		this.pointRoofTip = new Point2D.Double(x+(w/2), y-h-(h/2));
		this.pointRoofLeft = new Point2D.Double(x, y-h);
		this.pointRoofRight = new Point2D.Double(x+w, y-h);
	}
	
	public House(int x, int y, int w, int h){
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
		this.pointRoofTip = new Point2D.Double(x+(w/2), y-h-(h/2));
		this.pointRoofLeft = new Point2D.Double(x, y-h);
		this.pointRoofRight = new Point2D.Double(x+w, y-h);
	}
	
	/**
	 * Draws the house
	 * @param g2 the graphics context
	 */
	public void draw(Graphics2D g2){
		Rectangle block = new Rectangle(x, y-h, w, h);
		Rectangle door = new Rectangle(x+w/4, y-h/2, w/4, h/2);
		Rectangle window = new Rectangle(x+5*w/8, y-7*h/8, w/4, h/4);
		Line2D.Double lineRoofLeft = new Line2D.Double(pointRoofLeft, pointRoofTip);
		Line2D.Double lineRoofRight = new Line2D.Double(pointRoofTip, pointRoofRight);
		Line2D.Double lineChimneyTop = new Line2D.Double(x+3*w/4, y-h-(3*h/8), x+7*w/8, y-h-(3*h/8));
		Line2D.Double lineChimneyLeft = new Line2D.Double(x+3*w/4, y-h-(3*h/8), x+3*w/4, y-h-h/4);
		Line2D.Double lineChimneyRight = new Line2D.Double(x+7*w/8, y-h-(3*h/8), x+7*w/8, y-h-h/8);
		
		// draw them
		g2.draw(block);
		g2.draw(door);
		g2.draw(window);
		g2.draw(lineRoofLeft);
		g2.draw(lineRoofRight);
		g2.draw(lineChimneyTop);
		g2.draw(lineChimneyLeft);
		g2.draw(lineChimneyRight);
	}
	
	public void draw(Graphics g){
		g.drawRect(x, y-h, w, h);
		g.drawRect(x+w/4, y-h/2, w/4, h/2);
		g.drawRect(x+5*w/8, y-7*h/8, w/4, h/4);
		
		g.drawLine(x, y-h, x+(w/2), y-h-(h/2));
		g.drawLine(x+(w/2), y-h-(h/2), x+w, y-h);
		g.drawLine(x+3*w/4, y-h-(3*h/8), x+7*w/8, y-h-(3*h/8));
		g.drawLine(x+3*w/4, y-h-(3*h/8), x+3*w/4, y-h-h/4);
		g.drawLine(x+7*w/8, y-h-(3*h/8), x+7*w/8, y-h-h/8);
	}
	
	public void rotate(Graphics2D g2, double angle){
		g2.rotate(angle);
		g2.transform(new AffineTransform());
	}
}
