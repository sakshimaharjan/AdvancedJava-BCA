
import java.awt.*;
import javax.swing.*;
public class NotHelloWorld{
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame = new NotHelloWorldFrame();
            frame.setTitle("NotHelloWorld");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            // WindowListener
        });
    }
}
class NotHelloWorldFrame extends JFrame{
    public NotHelloWorldFrame(){
        add(new NotHelloWorldComponent());
        pack();
    }
}
    
    class NotHelloWorldComponent extends JComponent{
        public static final int MESSAGE_X = 75;
        public static final int MESSAGE_Y = 100;
        public static final int DEFAULT_WIDTH = 300;
        public static final int DEFAULT_HEIGHT = 200;
        public void paintComponent(Graphics g){
            Graphics2D g2 = (Graphics2D) g;
            Font sansbold14 = new Font("SansSerif", Font.BOLD,32);
            g2.setFont(sansbold14);
            g2.drawString("Not a Hello, world program", MESSAGE_X,MESSAGE_Y);
        }
        public Dimension getPrefferedSize() { 
            return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        }
    }