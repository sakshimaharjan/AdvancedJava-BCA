
import java.awt.event.*;
import javax.swing.JFrame;
 class WindowTerminator extends WindowAdapter{
    public void WindowClosing(WindowEvent e)
    {
        System.out.println("Window is closing");
        System.exit(0);
    }
    public void windowIconified(WindowEvent e){
        System.out.println("Window is iconified");
    }
    public void windowDeiconified(WindowEvent e){
        System.out.println("Window is deiconified");
    }
}
public class Terminator{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sakshi");
        frame.setSize(400, 300);
        frame.addWindowListener(new WindowTerminator());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
