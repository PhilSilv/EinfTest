import javax.swing.JFrame;

public class AViewer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		
		frame.setSize(300, 400);
		frame.setTitle("AViewer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		AComponent component1 = new AComponent();
		frame.add(component1);

	}
}
