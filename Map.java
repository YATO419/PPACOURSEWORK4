import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 * 绝对布局
 */
public class Map extends JFrame {
    private AirbnbDataLoader airbnb;
    private AirbnbListing listing;
    private List<AirbnbListing> properties;
    private int counter = 0;
    private AirbnbViewer viewer;
    private String place;
   
    public Map()
    {
        airbnb = new AirbnbDataLoader();
        CreateMap();
    }
    public void CreateMap() {
        setSize(1000,1000);   //设置窗口大小
        setDefaultCloseOperation(EXIT_ON_CLOSE);   //窗口关闭规则
        Container c=getContentPane();  //获取窗口容器
        c.setLayout(null);  //将容器的布局设置为绝对布�?
        JButton b1=new JButton("ENFI");        
        JButton b2=new JButton("BARN");
        JButton b3=new JButton("HRGY");
        JButton b4=new JButton("WALT");
        JButton b5=new JButton("HRRW");
        JButton b6=new JButton("BREN");
        JButton b7=new JButton("CAMD");
        JButton b8=new JButton("ISLI");
        JButton b9=new JButton("HACK");
        JButton b10=new JButton("REDB");
        JButton b11=new JButton("HAVE");
        JButton b12=new JButton("HILL");
        JButton b13=new JButton("EALI");
        JButton b14=new JButton("KENS");
        JButton b15=new JButton("WSTM");
        JButton b16=new JButton("TOWH");
        JButton b17=new JButton("NEWH");
        JButton b18=new JButton("BARK");
        JButton b19=new JButton("HOUN");
        JButton b20=new JButton("HAMM");
        JButton b21=new JButton("WAND");
        JButton b22=new JButton("CITY");
        JButton b23=new JButton("GWCH");
        JButton b24=new JButton("BEXL");
        JButton b25=new JButton("RICH");
        JButton b26=new JButton("MERT");
        JButton b27=new JButton("LAMB");
        JButton b28=new JButton("STHW");
        JButton b29=new JButton("LEWS");
        JButton b30=new JButton("KING");
        JButton b31=new JButton("SUTT");
        JButton b32=new JButton("CROY");
        JButton b33=new JButton("CROM");
        JButton b34=new JButton("STATICS");
        if(color("Kingston upon Thames")>2000)
        {
            b1.setBackground(Color.GREEN);
        }
        if(color("Barnet")>1500)
        {
            b2.setBackground(Color.GREEN);
        }
        if(color("Haringey")>1500)
        {
            b3.setBackground(Color.GREEN);
        }
        if(color("Waltham Forest")>1500)
        {
            b4.setBackground(Color.GREEN);
        }
        if(color("hrrw")>1500)
        {
            b5.setBackground(Color.GREEN);
        }
        if(color("Brent")>3000)
        {
            b6.setBackground(Color.GREEN);
        }
        if(color("Camden")>3000)
        {
            b7.setBackground(Color.GREEN);
        }
        if(color("Islington")>3000)
        {
            b8.setBackground(Color.GREEN);
        }
        if(color("Hackney")>3000)
        {
            b9.setBackground(Color.GREEN);
        }if(color("Redbridge")>3000)
        {
            b10.setBackground(Color.GREEN);
        }
        if(color("Havering")>3000)
        {
            b11.setBackground(Color.GREEN);
        }if(color("hill")>3000)
        {
            b12.setBackground(Color.GREEN);
        }if(color("Ealing")>3000)
        {
            b13.setBackground(Color.GREEN);
        }
        if(color("Kensington and Chelsea")>3000)
        {
            b14.setBackground(Color.GREEN);
        }
        if(color("Westminster")>3000)
        {
            b15.setBackground(Color.GREEN);
        }
        if(color("Tower Hamlets")>3000)
        {
            b16.setBackground(Color.GREEN);
        }
        if(color("Newham")>3000)
        {
            b17.setBackground(Color.GREEN);
        }
        if(color("bark")>3000)
        {
            b18.setBackground(Color.GREEN);
        }
        if(color("Hounslow")>3000)
        {
            b19.setBackground(Color.GREEN);
        }
        if(color("Hammersmith and Fulham")>3000)
        {
            b20.setBackground(Color.GREEN);
        }
        if(color("Wandsworth")>3000)
        {
            b21.setBackground(Color.GREEN);
        }
        if(color("City of London")>3000)
        {
            b22.setBackground(Color.GREEN);
        }
        if(color("gwch")>3000)
        {
            b23.setBackground(Color.GREEN);
        }
        if(color("bexl")>3000)
        {
            b24.setBackground(Color.GREEN);
        }
        if(color("rich")>3000)
        {
            b25.setBackground(Color.GREEN);
        }
        if(color("Merton")>3000)
        {
            b26.setBackground(Color.GREEN);
        }
        if(color("Lambeth")>3000)
        {
            b27.setBackground(Color.GREEN);
        }
        if(color("Southwark")>3000)
        {
            b28.setBackground(Color.GREEN);
        }
        if(color("Lewisham")>3000)
        {
            b29.setBackground(Color.GREEN);
        }
        if(color("king")>3000)
        {
            b30.setBackground(Color.GREEN);
        }
        if(color("sutt")>3000)
        {
            b31.setBackground(Color.GREEN);
        }
        if(color("Croydon")>3000)
        {
            b32.setBackground(Color.GREEN);
        }
        if(color("crom")>3000)
        {
            b33.setBackground(Color.GREEN);
        }
   
        
        
        
        b1.setBounds(400,10,70,40);
        b2.setBounds(300,50,70,40);
        b3.setBounds(370,50,70,40);
        b4.setBounds(440,50,70,40);
        b5.setBounds(160,90,70,40);
        b6.setBounds(230,90,70,40);
        b7.setBounds(300,90,70,40);
        b8.setBounds(370,90,70,40);
        b9.setBounds(440,90,70,40);
        b10.setBounds(510,90,70,40);
        b11.setBounds(580,90,70,40);
        b12.setBounds(160,130,70,40);
        b13.setBounds(230,130,70,40);
        b14.setBounds(300,130,70,40);
        b15.setBounds(370,130,70,40);
        b16.setBounds(440,130,70,40);
        b17.setBounds(510,130,70,40);
        b18.setBounds(580,130,70,40);
        b19.setBounds(210,170,70,40);
        b20.setBounds(280,170,70,40);
        b21.setBounds(350,170,70,40);
        b22.setBounds(420,170,70,40);
        b23.setBounds(490,170,70,40);
        b24.setBounds(560,170,70,40);
        b25.setBounds(230,210,70,40);
        b26.setBounds(300,210,70,40);
        b27.setBounds(370,210,70,40);
        b28.setBounds(440,210,70,40);
        b29.setBounds(510,210,70,40);
        b30.setBounds(260,250,70,40);
        b31.setBounds(330,250,70,40);
        b32.setBounds(400,250,70,40);
        b33.setBounds(470,250,70,40);
        b34.setBounds(600,600,100,50);
      
        //设置按钮b2在容器中的大小位�?
        c.add(b1);
        c.add(b2);  
        c.add(b3);
        c.add(b4);
        c.add(b5);
        c.add(b6);
        c.add(b7);
        c.add(b8);
        c.add(b9);
        c.add(b10);
        c.add(b11);
        c.add(b12);
        c.add(b13);
        c.add(b14);
        c.add(b15);
        c.add(b16);
        c.add(b17);
        c.add(b18);
        c.add(b19);
        c.add(b20);
        c.add(b21);
        c.add(b22);
        c.add(b23);
        c.add(b24);
        c.add(b25);
        c.add(b26);
        c.add(b27);
        c.add(b28);
        c.add(b29);
        c.add(b30);
        c.add(b31);
        c.add(b32);
        c.add(b33);
        c.add(b34);
        b1.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
              
    }
        });
        
        b2.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b10.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b11.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b12.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b13.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b14.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b15.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b16.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b17.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b18.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b19.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b20.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b21.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b22.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b23.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b24.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b25.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b26.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b27.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b28.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b29.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b30.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b31.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b32.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b33.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new AirbnbViewer().CreateAirbnbViewer();
            }
        });
        b34.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                new Statics().CreateStaticsViewer();
            }
        });
        setVisible(true);  //设置窗口可见
    }
    
       public int color(String place)
    {
        counter = 0;
         for(int i = 0 ; i < airbnb.numberOfProperties(); i++){
            
             if((airbnb.getProperty(i).getNeighbourhood().equals(place)))
           {           
             counter++;
           }
          }           
        
        return counter;        
    }   
        
    
    
    public static void main() {
        new Map().CreateMap();
    }
}
