import  java.awt.*;
import java.awt.event.*;

public class HomePage extends Frame implements ActionListener {
          
          HomePage(){
              
              Button myfiles = new Button("My Files");
              Button allfiles = new Button("Public Files");
              Button shme = new Button("shared with me");
              Button up = new Button("Upload / Add");
              Button chatroom = new Button("Chatroom");
              Button events = new Button("Live events");
              Button social = new Button("Social");
              Button profile = new Button("abhi9741 | V");
              
              
              Label details1 = new Label("Connected : MEC-Hostel");
              Label details2 = new Label("Upload 32Kbs Download 52Kbs");
              Label details3 = new Label("Friends online-4, Msg-2");
              Label details4 = new Label("Data Usage :320MB");
              
              Label soc = new Label("M-2,R-1");
              Label liv = new Label("E-2,C-3");
              Label cha = new Label("T-5,M-35");
              
              soc.setBounds(340+5,410-6,50,20);
              liv.setBounds(540+5,410-6,50,20);
              cha.setBounds(730+15,410-6,50,20);
              
              details1.setBounds(1,410,200,20);
              details2.setBounds(1,430,200,20);
              details3.setBounds(1,450,200,20);
              details4.setBounds(1,470,200,20);
              
              social.setBounds(200,400,200,100);
              events.setBounds(400,400,200,100);
              chatroom.setBounds(600,400,200,100);
              
              profile.setBounds(700,25,100,30);
              
              profile.addActionListener(this);
              up.addActionListener(this);
              social.addActionListener(this);
              
              myfiles.setBounds(1,1,200,100);
              allfiles.setBounds(1,100,200,100);
              shme.setBounds(1,200,200,100);
              up.setBounds(1,300,200,100);
              
              Button t1 = new Button("");
              Button t2 = new Button("");
              Button t3 = new Button("");
              Button t4 = new Button("");
              Button t5 = new Button("");
              Button t6 = new Button("");
              
              t1.setBounds(200,0,250,200);
              t2.setBounds(450,0,250,200);
              t3.setBounds(200,200,250,200);
              t4.setBounds(450,200,250,200);
              //t5.setBounds(600,50,120,150);
             // t6.setBounds(600,200,200,200);
              
              Label l1=new Label("BlackPanther.Eng 720p.mp4");
              Label ll1=new Label("3.6GB estimated time-1 W");
              Label l2=new Label("Rangasthalam.HDcam.mp4");
              Label ll2=new Label("423MB estimated time-1hr");
              Label l3=new Label("Pari..360p.mp4");
              Label ll3=new Label("676MB est-2hr");
              Label l4=new Label("Pubgmobile mod.apk");
              Label ll4=new Label("96MB estimated time-38mi");
              Label l5=new Label("Os assignment 6.c");
              Label ll5=new Label("230Kb estimated time-1mi");
              Label l6=new Label("Java class lecture12.pdf");
              Label ll6=new Label("24MB estimated time-10mi");
              
              
              l1.setBounds(205,150+4,192+50,20);
              ll1.setBounds(205,170+4,192+50,20);
              l2.setBounds(405+50,150+4,192+50,20);
              ll2.setBounds(405+50,170+4,192+50,20);
              l5.setBounds(205,200+150+4,192+50,20);
              ll5.setBounds(205,200+170+4,192+50,20);
              l4.setBounds(405+50,200+150+4,192+50,20);
              ll4.setBounds(405+50,200+170+4,192+50,20);
              
              
              profile.setBounds(700,25,100,30);
              
              Button ad = new Button("ad");
              ad.setBounds(700,35+30+30+30+30+30+20+30,100,160);
              
              add(ad);
              add(profile);
              add(l1);
              add(ll1);
              add(l2);
              add(ll2);
              add(l4);
              add(ll4);
              add(l5);
              add(ll5);
              add(t1);
              add(t2);
              add(t3);
              add(t4);
              //add(t5);
              //add(t6);
              add(cha);
              add(liv);
              add(soc);
              //add(profile);
              add(social);
              add(chatroom);
              add(events);
              add(details4);
              add(details1);
              add(details2);
              add(details3);
              add(shme);
              add(allfiles);
              add(myfiles);
              add(up);
              
              setSize(800,500);
              setLayout(null);
              setVisible(true);
              setTitle("Home");
              this.addWindowListener(new WindowAdapter(){ public void windowClosing(WindowEvent e){
            System.exit(0); }
        });
           }
           
          public void addBar(){
              Button settings = new Button("Settings");
              Button privacy = new Button("Privacy");
              Button network = new Button("Network");
              Button logout = new Button("Logout");
              Button deactivate = new Button("Deactivate");
              Button close = new Button("^");
              
              close.setBounds(700,35+30+30+30+30+30+20,100,30);
              settings.setBounds(700,35+20,100,30);
              privacy.setBounds(700,35+30+20,100,30);
              network.setBounds(700,35+30+30+20,100,30);
              logout.setBounds(700,35+30+30+30+20,100,30);
              deactivate.setBounds(700,35+30+30+20+30+30,100,30);
              //settings.setBorder(null);
              //privacy.setBorder(null);
              close.addActionListener(this);
              logout.addActionListener(this);
              
              
              add(settings);
              add(privacy);
              add(network);
              add(logout);
              add(deactivate);
              add(close);
              
          }
          
          public void closeBar(){
            this.dispose();
            new HomePage();
            Button ad2 =  new Button("ad");
            ad2.setBounds(700,25+30,100,160);
            add(ad2);
          }
          
          public void actionPerformed(ActionEvent e){
              String st = e.getActionCommand();
              if (st.equals("abhi9741 | V")){
                 this.addBar();
              }
              if (st.equals("^")){
                 this.closeBar();
              }
              if (st.equals("Logout")){
                 this.dispose();
                 new InitialPage();
              }
              if (st.equals("Upload / Add")){
                  this.dispose();
                  new UploadPage();
              }
              if (st.equals("Social")){
                  this.dispose();
                  new FindFriends();
              }
           }
          public static void main(String []args){
              new HomePage();
          }
          
     }
 

