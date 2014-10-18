import javax.swing.JFrame;

public class HouseViewer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		
		frame.setSize(300, 400);
		frame.setTitle("House");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		HouseComponent component = new HouseComponent();
		frame.add(component);

	}
}
