import javax.swing.JFrame;

public class HouseViewer
{  
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(300, 400);
      frame.setTitle("Houses");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      HouseComponent component = new HouseComponent();
      component.createHouses();
      frame.add(component);

      frame.setVisible(true);
   }
}

