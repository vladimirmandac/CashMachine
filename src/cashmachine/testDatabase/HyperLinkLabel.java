package cashmachine.testDatabase;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Vladimir Mandač
 */
public class HyperLinkLabel extends JFrame {
  
  public HyperLinkLabel()
  {
    JPanel p = new JPanel();
    final String strURL = "http://www.fiverr.com/vladimirmandac/";
    final JLabel label = new JLabel("<html><a href=\" " + strURL + "\"> click </a></html>");
  
    final JEditorPane htmlPane = new JEditorPane();
  
 
    p.add(label);
  
    getContentPane().add(BorderLayout.NORTH, p);
    getContentPane().add(BorderLayout.CENTER, new JScrollPane(htmlPane));
    setBounds(20,200, 500,500);
  
    label.addMouseListener(new MouseAdapter() {
       @Override
       public void mouseEntered(MouseEvent me) {
          label.setCursor(new Cursor(Cursor.HAND_CURSOR));
       }
       @Override
       public void mouseExited(MouseEvent me) {
          label.setCursor(Cursor.getDefaultCursor());
       }
       @Override
       public void mouseClicked(MouseEvent me)
       {
          System.out.println("Clicked on Label...");
          try {
               htmlPane.setPage(new URL(strURL));
            }
            catch(Exception e) {
               System.out.println(e);
            }
       }
      });
  
  }
  
 
  
  public static void main(String[] args)
  {
    HyperLinkLabel hll = new HyperLinkLabel();
    hll.setVisible(true);
  }
}
