import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AirbnbViewer extends JFrame{
    /**
     * 
     */
    private MyComboBox myComboBox;
    private static final long serialVersionUID = 1L;
    private AirbnbDataLoader airbnb;
    private AirbnbListing listing;
    private List<AirbnbListing> properties;
    private int counter = 0;
    private AirbnbViewer viewer;
    private int index = 0;
    JComboBox<String> jc1 = new JComboBox<>(new MyComboBox());
    JComboBox<String> jc2 = new JComboBox<>(new MyComboBox());  
    JLabel jl01 = new JLabel("Lowest Price");
    JLabel jl02 = new JLabel("Highest Price");
    JLabel jl1 = new JLabel("ID");
        JLabel jl2 = new JLabel("");
        JLabel jl3 = new JLabel("NAME");
        JLabel jl4 = new JLabel("");
        JLabel jl5 = new JLabel("HOST-ID");
        JLabel jl6 = new JLabel("");
        JLabel jl7 = new JLabel("HOST-NAME");
        JLabel jl8 = new JLabel("");
        JLabel jl9 = new JLabel("NEIGHBOURHOOD");
        JLabel jl10= new JLabel("");
        JLabel jl11= new JLabel("LATITUDE");
        JLabel jl12= new JLabel("");
        JLabel jl13= new JLabel("LONGITUDE");
        JLabel jl14= new JLabel("");
        JLabel jl15= new JLabel("ROOM-TYPE");
        JLabel jl16= new JLabel("");
        JLabel jl17= new JLabel("PRICE");
        JLabel jl18= new JLabel("");
        JLabel jl19= new JLabel("MINIMUM-NIGHTS");
        JLabel jl20= new JLabel("");
        JLabel jl21= new JLabel("NUMBER-OF-REVIEWS");
        JLabel jl22= new JLabel("");
        JLabel jl23= new JLabel("LAST-REVIEW");
        JLabel jl24= new JLabel("");
        JLabel jl25= new JLabel("REVIEW-P-M");
        JLabel jl26= new JLabel("");
        JLabel jl27= new JLabel("HOST-LISTING");
        JLabel jl28= new JLabel("");
        JLabel jl29= new JLabel("AVAILAIBILITY"); 
        JLabel jl30= new JLabel("");
        
    public AirbnbViewer()
    {
        airbnb = new AirbnbDataLoader();
        CreateAirbnbViewer();
       
    }
    public void CreateAirbnbViewer() {
        JFrame jf1 = new JFrame();
        jf1.setSize(new Dimension(1000, 1000));
        jf1.setVisible(true);
        jf1.setTitle("AirbnbViewer");
        jf1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container cp= jf1.getContentPane();
        cp.setLayout(null);
        JButton jb1 = new JButton("search");
        jb1.setBounds(700,0,100,50);
        cp.add(jb1);
        jb1.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new Map();
            }
        });
        JButton nextButton = new JButton("Next");
        nextButton.setBounds(900,500,100,50);
        cp.add(nextButton);
        nextButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                jf1.dispose();
                index++;
                CreateAirbnbViewer();
              
           }
        });
        cp.add(nextButton);
        JButton PreviousButton = new JButton("Previous");
        PreviousButton.setBounds(0,500,100,50);
        cp.add(PreviousButton);
        PreviousButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                jf1.dispose();
                index--;
                CreateAirbnbViewer();
    }
      });
        cp.add(PreviousButton);
        
        jl01.setBounds(300,0,100,50);
        jl02.setBounds(500,0,100,50);        
        jc1.setBounds(400,0,100,50);
        jc2.setBounds(600,0,100,50);
        cp.setLayout(null);
        cp.add(jl01);
        cp.add(jl02);
        cp.add(jc1);
        cp.add(jc2);
        
        JLabel jl1 = new JLabel("ID");
        jl1.setBounds(300,100,50,50);
        JLabel jl2 = new JLabel("");
        jl2.setBounds(480,100,1000,50);
        JLabel jl3 = new JLabel("NAME");
        jl3.setBounds(300,150,50,50);
        JLabel jl4 = new JLabel("");
        jl4.setBounds(480,150,1000,50);
        JLabel jl5 = new JLabel("HOST-ID");
        jl5.setBounds(300,200,1000,50);
        JLabel jl6 = new JLabel("");
        jl6.setBounds(480,200,1000,50);
        JLabel jl7 = new JLabel("HOST-NAME");
        jl7.setBounds(300,250,1000,50);
        JLabel jl8 = new JLabel("");
        jl8.setBounds(480,250,1000,50);
        JLabel jl9 = new JLabel("NEIGHBOURHOOD");
        jl9.setBounds(300,300,1000,50);
        JLabel jl10= new JLabel("");
        jl10.setBounds(480,300,1000,50);
        JLabel jl11= new JLabel("LATITUDE");
        jl11.setBounds(300,350,1000,50);
        JLabel jl12= new JLabel("");
        jl12.setBounds(480,350,1000,50);
        JLabel jl13= new JLabel("LONGITUDE");
        jl13.setBounds(300,400,1000,50);
        JLabel jl14= new JLabel("");
        jl14.setBounds(480,400,1000,50);
        JLabel jl15= new JLabel("ROOM-TYPE");
        jl15.setBounds(300,450,1000,50);
        JLabel jl16= new JLabel("");
        jl16.setBounds(480,450,1000,50);
        JLabel jl17= new JLabel("PRICE");
        jl17.setBounds(300,500,50,50);
        JLabel jl18= new JLabel("");
        jl18.setBounds(480,500,1000,50);
        JLabel jl19= new JLabel("MINIMUM-NIGHTS");
        jl19.setBounds(300,550,1000,50);
        JLabel jl20= new JLabel("");
        jl20.setBounds(480,550,1000,50);
        JLabel jl21= new JLabel("NUMBER-OF-REVIEWS");
        jl21.setBounds(300,600,1000,50);
        JLabel jl22= new JLabel("");
        jl22.setBounds(480,600,1000,50);
        JLabel jl23= new JLabel("LAST-REVIEW");
        jl23.setBounds(300,650,1000,50);
        JLabel jl24= new JLabel("");
        jl24.setBounds(480,650,1000,50);
        JLabel jl25= new JLabel("REVIEW-P-M");
        jl25.setBounds(300,700,1000,50);
        JLabel jl26= new JLabel("");
        jl26.setBounds(480,700,1000,50);
        JLabel jl27= new JLabel("HOST-LISTING");
        jl27.setBounds(300,750,10000,50);
        JLabel jl28= new JLabel("");
        jl28.setBounds(480,750,1000,50);
        JLabel jl29= new JLabel("AVAILAIBILITY");
        jl29.setBounds(300,800,1000,50);
        JLabel jl30= new JLabel("");
        jl30.setBounds(480,800,1000,50);
        cp.add(jl1);
        cp.add(jl2);
        cp.add(jl3);
        cp.add(jl4);
        cp.add(jl5);
        cp.add(jl6);
        cp.add(jl7);
        cp.add(jl8);
        cp.add(jl9);
        cp.add(jl10);
        cp.add(jl11);
        cp.add(jl12);
        cp.add(jl13);
        cp.add(jl14);
        cp.add(jl15);
        cp.add(jl16);
        cp.add(jl17);
        cp.add(jl18);
        cp.add(jl19);
        cp.add(jl20);
        cp.add(jl21);
        cp.add(jl22);
        cp.add(jl23);
        cp.add(jl24);
        cp.add(jl25);
        cp.add(jl26);
        cp.add(jl27);
        cp.add(jl28);
        cp.add(jl29);
        cp.add(jl30);
        
        jl2.setText(String.valueOf(airbnb.getProperty(index).getId()));
        jl4.setText(String.valueOf(airbnb.getProperty(index).getName()));
        jl6.setText(String.valueOf(airbnb.getProperty(index).getHost_id()));
        jl8.setText(String.valueOf(airbnb.getProperty(index).getHost_name()));
        jl10.setText(String.valueOf(airbnb.getProperty(index).getNeighbourhood()));
        jl12.setText(String.valueOf(airbnb.getProperty(index).getLatitude()));
        jl14.setText(String.valueOf(airbnb.getProperty(index).getLongitude()));
        jl16.setText(String.valueOf(airbnb.getProperty(index).getRoom_type()));
        jl18.setText(String.valueOf(airbnb.getProperty(index).getPrice()));
        jl20.setText(String.valueOf(airbnb.getProperty(index).getMinimumNights()));
        jl22.setText(String.valueOf(airbnb.getProperty(index).getNumberOfReviews()));
        jl24.setText(String.valueOf(airbnb.getProperty(index).getLastReview()));
        jl26.setText(String.valueOf(airbnb.getProperty(index).getReviewsPerMonth()));
        jl28.setText(String.valueOf(airbnb.getProperty(index).getCalculatedHostListingsCount()));
        jl30.setText(String.valueOf(airbnb.getProperty(index).getAvailability365()));
        
    }
    
   
    public static void main() {
        new AirbnbViewer().CreateAirbnbViewer();
    }
    
}