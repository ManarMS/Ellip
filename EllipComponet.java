
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;


public class EllipComponet extends JComponent {
    
 
  
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D)g;//المسافات
      int w = getWidth();
      int h =getHeight();
      Color c =Color.red
              ;
      Ellip e =new Ellip(0,0,w,h,c);
      e.draw(g2);
         
   }
}
   

