
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.*;

public class FontTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame = new FontFrame();
            frame.setTitle("Sakshi");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
class FontFrame extends JFrame{
    public FontFrame(){
        FontComponent fc = new FontComponent();
        fc.setForeground(Color.RED);
        add(fc);
        setSize(new Dimension(400,400));
        // pack();
    }
}

class FontComponent extends JComponent{
    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;

    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        String message = "Hello world";
        Font f = new Font("Serif",Font.BOLD,36);
        g2.setFont(f);
        FontRenderContext context = g2.getFontRenderContext();
        Rectangle2D bounds = f.getStringBounds(message, context);

        double x = (getWidth() - bounds.getWidth()) /2 ;
        double y = (getHeight() - bounds.getHeight()) /2 ;

        double ascent = -bounds.getY();
        double baseY = y + ascent;
        g2.setPaint(Color.BLUE);
        g2.drawString(message, (int) x, (int) baseY);

        g2.draw(new Line2D.Double(x,baseY,x+bounds.getWidth(),baseY));
        Rectangle2D rect = new Rectangle2D.Double(x,y,bounds.getWidth(),bounds.getHeight());
        g2.setPaint(Color.RED);
        g2.draw(rect);
        setBackground(Color.YELLOW);
        // g2.fill(rect);
}
public Dimension getPrefferedSize() { return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);}

}
