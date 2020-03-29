import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Statics extends JFrame{
    private AirbnbDataLoader airbnb;
    private AirbnbListing listing;
    private List<AirbnbListing> properties;
    ArrayList<Integer> listings = new ArrayList<Integer>();
    public Statics()
    {
        airbnb = new AirbnbDataLoader();
    }
    public void CreateStaticsViewer(){
        int averageReview = 0;
        int totalProperty = 0;
        int entire = 0;
        int counter1 = 0;
        
        for(int i = 0 ; i < airbnb.numberOfProperties(); i++){
             
            counter1 = counter1 + airbnb.getProperty(i).getNumberOfReviews();
           
          }           
        averageReview = counter1/airbnb.numberOfProperties();
        totalProperty = airbnb.numberOfProperties();
        for(int i = 0 ; i < airbnb.numberOfProperties(); i++){
             if((airbnb.getProperty(i).getRoom_type().equals("Entire home/apt")))
           {           
             entire++;
           }
          }
        String borough = "Lambeth";
        JFrame jf1 = new JFrame();
        Container container1 = jf1.getContentPane();
        JLabel jl1 = new JLabel("Average number of reviews per property");
        JLabel jl2 = new JLabel(String.valueOf(averageReview));
        JLabel jl3 = new JLabel("Total number of available properties");
        JLabel jl4 = new JLabel(String.valueOf(totalProperty));
        JLabel jl5 = new JLabel("The number of entire home and apartments");
        JLabel jl6 = new JLabel(String.valueOf(entire));
        JLabel jl7 = new JLabel("The most expensive borough");
        JLabel jl8 = new JLabel(borough);
        //JLabel jl9 = new JLabel("1");
        //JLabel jl10 = new JLabel("1");
        //JLabel jl11 = new JLabel("1");
        //JLabel jl12 = new JLabel("1");
        //JLabel jl13 = new JLabel("1");
        //JLabel jl14 = new JLabel("1");
        //JLabel jl15 = new JLabel("1");
        //JLabel jl16 = new JLabel("1");
        jl1.setBounds(50,50,200,50);
        jl2.setBounds(50,100,200,50);
        jl3.setBounds(400,50,200,50);
        jl4.setBounds(400,100,200,50);
        jl5.setBounds(50,400,200,50);
        jl6.setBounds(50,450,200,50);
        jl7.setBounds(400,400,200,50);
        jl8.setBounds(400,450,200,50);
        //jl9.setBounds(400,400,100,50);
        //jl10.setBounds(400,400,100,50);
        //jl11.setBounds(400,400,100,50);
        //jl12.setBounds(400,400,100,50);
        //jl13.setBounds(400,400,100,50);
        //jl14.setBounds(400,400,100,50);
        //jl15.setBounds(400,400,100,50);
        //jl16.setBounds(400,400,100,50);
        container1.add(jl1);
        container1.add(jl2);
        container1.add(jl3);
        container1.add(jl4);
        container1.add(jl5);
        container1.add(jl6);
        container1.add(jl7);
        container1.add(jl8);
        //container1.add(jl9);
        //container1.add(jl10);
        //container1.add(jl11);
        //container1.add(jl12);
        //container1.add(jl13);
        //container1.add(jl14);
        //container1.add(jl15);
        //container1.add(jl16);
        //container1.setBackground(Color.white);
        jf1.setVisible(true);
        jf1.setSize(800,800);
        jf1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        container1.setLayout(null);
        JButton jb1 = new JButton("last");
        JButton jb2 = new JButton("next");
        JButton jb3 = new JButton("last");
        JButton jb4 = new JButton("next");
        JButton jb5 = new JButton("last");
        JButton jb6 = new JButton("next");
        JButton jb7 = new JButton("last");
        JButton jb8 = new JButton("next");
        jb1.setBounds(0,0,50,400);
        jb2.setBounds(300,0,50,400);
        jb3.setBounds(350,0,50,400);
        jb4.setBounds(650,0,50,400);
        jb5.setBounds(0,350,50,400);
        jb6.setBounds(300,350,50,400);
        jb7.setBounds(350,350,50,400);
        jb8.setBounds(650,350,50,400);
        container1.add(jb1);
        container1.add(jb2);
        container1.add(jb3);
        container1.add(jb4);
        container1.add(jb5);
        container1.add(jb6);
        container1.add(jb7);
        container1.add(jb8);
        
        
    }
        public Object maxprice()
    {
        for(int i = 0 ; i < airbnb.numberOfProperties(); i++)
        {
            listings.add(airbnb.getProperty(i).getPrice() * airbnb.getProperty(i).getMinimumNights());                             
                     
        }
    java.util.Iterator<Integer> it = listings.iterator();
    int max = 0;
    while(it.hasNext()){
        int a = it.next();
        if(a >= max){
            max = a;
        }
    }
    return max;
    
}
    
    
    
}