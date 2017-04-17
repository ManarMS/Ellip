
import javax.swing.JFrame;


public class Elliptest {
    public static void main(String[] args) {
         JFrame frame = new JFrame();

      frame.setSize(300, 400);
      frame.setTitle("The circle");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      EllipComponet c = new EllipComponet();
      frame.add(c);

      frame.setVisible(true);
   }
        
    }
  
