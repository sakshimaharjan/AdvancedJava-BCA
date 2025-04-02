

import java.awt.*;
import javax.swing.*;
public class PlatformTest{
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            PlatformFrame frame = new PlatformFrame();
            frame.setTitle("Sakshi");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
class PlatformFrame extends JFrame {
    private JPanel buttonPanel;
    public PlatformFrame(){
        buttonPanel = new JPanel();
        UIManager.LookAndFeelInfo[] infos = UIManager.getInstalledLookAndFeels();
        for(UIManager.LookAndFeelInfo info : infos)
            makeButton(info.getName(), info.getClassName());

        add(buttonPanel);
        pack();
    }
    private void makeButton(String name, String className){
        JButton jButton = new JButton(name);
        buttonPanel.add(jButton);

        jButton.addActionListener(event ->{
            try{
                UIManager.setLookAndFeel(className);
                SwingUtilities.updateComponentTreeUI(this);
                pack();
            } catch(Exception e){
                e.printStackTrace();
            }
        });
    }
}
