import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MainWindow extends JFrame{
    
    AirbnbViewer airbnbViewer;

    
    public static void start() {
        new MainWindow().CreateWelcome("Welcome Window");
    }
    
    public void CreateWelcome(String title){
        JFrame jf1 = new JFrame(title);
        Container container1 = jf1.getContentPane();
        JLabel jl1 = new JLabel("WELCOME");
        jl1.setBounds(400,400,100,100);
        container1.add(jl1);
        container1.setBackground(Color.white);
        jf1.setVisible(true);
        jf1.setSize(800,800);
        jf1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        container1.setLayout(null);
        JButton continueButton = new JButton("CONTINUE");
        continueButton.setBounds(700,700,100,100);
        container1.add(continueButton);
        
        continueButton.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                jf1.dispose();
                new AirbnbViewer();
            }
        });
    }
    
    
    
}