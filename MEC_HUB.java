import  java.awt.*;
import java.awt.event.*;

class InitialPage extends Frame implements ActionListener {
  	  InitialPage(){
  	         // Button signup = new Button("Sign Up");
  	         //Font font1 = new Font("SansSerif", Font.BOLD, 20);
  	         Font myFont = new Font("Serif",Font.BOLD,20);
  	         Label iwelcome =  new Label("Welcome to MEC HUB !");
  	         iwelcome.setFont(myFont);
  	         Button ilogin = new Button("Login"); // ilogin = initial login
  	         Button register = new Button("Register");
  	         iwelcome.setBounds(100,25+25,300,30);
  	         ilogin.setBounds(80-10,100,100+10,100);
  	         register.setBounds(180+80-10-10,100,100+10,100);
  	         ilogin.addActionListener(this);
  	         register.addActionListener(this);
  	         
  	         Label connect = new Label("connected to MEC-Hostel");
    		 Label  speed = new Label("Upload :320Kbs Download : 512 Kbs");
    		
    		 connect.setBounds(120+20+40+10,360,300,30);
    		 speed.setBounds(120+40,380,300,20);
  	         
  	         add(speed);
              	 add(connect);
  	         add(ilogin);
  	         add(iwelcome);
  	         add(register);
  	         setSize(400,400);
                 setLayout(null);
                 setVisible(true);
                 setTitle("Welcome");
                           this.addWindowListener(new WindowAdapter(){ public void windowClosing(WindowEvent e){
            System.exit(0); }
        });
  	  }
          
         
          
          public void actionPerformed(ActionEvent e){
                 String st  = e.getActionCommand();
                 if(st.equals("Login")){
                    this.dispose();
                    new LoginPage();
                 }
                 else {
                    this.dispose();
                    new RegistrationPage();
                 }
                 
          }
          
	  public static void  main(String []args){
                new InitialPage();
           }
			
     }

class LoginPage extends Frame implements ActionListener {
           TextField name;
           TextField password;
           
           LoginPage(){
                Button back = new Button("Back");
                back.setBounds(10,30,40,20);
                name = new TextField();
                name.setBounds(60+80,50+80,170,20);
                password = new TextField();
               
                password.setBounds(60+80,50+50+80,170,20);
               password.setEchoChar('*');
                Button login = new Button("Login");
                login.setBounds(100+80,120+40+80,80,30);
                
                back.addActionListener(this);
                login.addActionListener(this);
                
                Label ip,welcome,loginid,loginpass,success;
                
                ip = new Label("your ip is : 10.59.92.105");
                welcome =  new Label("you are conneted to the MEC HUB");
                loginid = new Label("Login ID :");
                loginpass = new Label("Password :");            
    		
    		Label connect = new Label("connected to MEC-Hostel");
    		Label  speed = new Label("Upload :320Kbs Download : 512 Kbs");
    		
    		connect.setBounds(120+20+40+10,360,300,30);
    		speed.setBounds(120+40,380,300,20);
    		
                welcome.setBounds(60+60,25+25,300,30);
                ip.setBounds(60+80,50+25,300,30);
                loginid.setBounds(60,50+50+25,100,30);
                loginpass.setBounds(60,50+50+75,100,30);
              	
              	add(speed);
              	add(connect);
                add(back);
                add(login);
                add(name);
                add(password);
                add(welcome);
                add(ip);
                add(loginid);
                add(loginpass);
                
                setSize(400,400);
                setLayout(null);
                setVisible(true);
                setTitle("Login");
                this.addWindowListener(new WindowAdapter(){ public void windowClosing(WindowEvent e){
            System.exit(0); }
        });
           }
           
           public void actionPerformed(ActionEvent e){
               // name.setText("you have succesfully logged in");
                String st =e.getActionCommand();
                if (st.equals("Login")){
                   Label success;
                   success = new Label("You have logged in successfully !");
           	   success.setBounds(100+20,120+40+80+40,300,30);
           	   add(success);
           	   this.dispose();
           	   new HomePage();
           	 }
           	 else {
           	   this.dispose();
           	   new InitialPage();
           	 }
           }
           
           public static void  main(String []args){
                new LoginPage();
           }
           
     }
     
class RegistrationPage extends Frame implements ActionListener {
             TextField name;
             TextField password;
             TextField confirmpassword;
           
           RegistrationPage(){
                name = new TextField();
                name.setBounds(60+80,50+80,170,20);
                password = new TextField();
                password.setBounds(60+80,50+50+80,170,20);
                password.setEchoChar('*');
                confirmpassword = new TextField();
               confirmpassword.setEchoChar('*');
                confirmpassword.setBounds(60+80,50+50+80+50,170,20);
                
                Button login = new Button("Register");
                login.setBounds(100+80,120+40+80+50-20,80,30);
                
                Button back = new Button("Back");
                back.setBounds(10,30,40,20);
                
                back.addActionListener(this);
                login.addActionListener(this);
                
                Label ip,welcome,loginid,loginpass,success,confirmpass,confirmpass2;
                
                ip = new Label("your ip is : 10.59.92.105");
                welcome =  new Label("you are conneted to the MEC HUB");
                loginid = new Label("Login ID :");
                loginpass = new Label("Password :");            
    		confirmpass = new Label("confirm password :");
    		//confirmpass2 = new Label("password :");
    		
    		Label connect = new Label("connected to MEC-Hostel");
    		Label  speed = new Label("Upload :320Kbs Download : 512 Kbs");
    		
    		connect.setBounds(120+20+40+10,360,300,30);
    		speed.setBounds(120+40,380,300,20);
    		
                welcome.setBounds(60+60,25+25,300,30);
                ip.setBounds(60+80,50+25,300,30);
                loginid.setBounds(60,50+50+25,100,30);
                loginpass.setBounds(60,50+50+75,100,30);
                confirmpass.setBounds(60-40,50+50+75+50,120,30);
              	//confirmpass1.setBounds(60,50+50+80+50+10,100,20);
                
                add(speed);
              	add(connect);
                add(login);
                add(name);
                add(password);
                add(confirmpassword);
                add(welcome);
                add(ip);
                add(loginid);
                add(confirmpass);
                add(loginpass);
                add(back);
                //add(confirmpass);
                //add(confirmpass2);
                
                setSize(400,400);
                setLayout(null);
                setVisible(true);
                setTitle("Registration");
                this.addWindowListener(new WindowAdapter(){ public void windowClosing(WindowEvent e){
            System.exit(0); }
        });
           }
           
           public void actionPerformed(ActionEvent e){
               // name.setText("you have succesfully logged in");
               String st =e.getActionCommand();
               if (st.equals("Register")){
                   String pass,conpass;
                   pass = password.getText();
                   conpass = confirmpassword.getText();
                   Label success;
                   if (pass.equals(conpass)){
                      success = new Label("You have registered successfully !");
           	      success.setBounds(100+20,120+40+80+40+50-10,300,30);
           	      add(success);
           	      this.dispose();
           	      new SucReg();
           	     }
                   else {
           	      success = new Label("Your passwords didnt match, Try again");
           	      success.setBounds(100+20,120+40+80+40+50-10,300,30);
           	      add(success);
           	     }
           	   //this.dispose();
           	   //new RegistrationPage();
           	 }
           	else {
           	   this.dispose();
           	   new InitialPage();   
           	 }
           }
           
           public static void  main(String []args){
                new RegistrationPage();
           }
           
     }
     
class SucReg extends Frame implements ActionListener {
          
          SucReg(){
              Label success = new Label("You have been registered successfully !");
              Button cont = new Button("Continue to home page");
              Button findfriends = new Button("find your friends ");
              
              success.setBounds(80,200,400,30);
              cont.setBounds(120-10,350,200,30);
              findfriends.setBounds(120-10,320,200,30);
           
              cont.addActionListener(this);
              findfriends.addActionListener(this);
           
              add(findfriends);
              add(cont);
              add(success);
           
              setSize(400,400);
              setLayout(null);
              setVisible(true);
              setTitle("Sucess");
              this.addWindowListener(new WindowAdapter(){ public void windowClosing(WindowEvent e){
            System.exit(0); }
        });
           }
          public void actionPerformed(ActionEvent e){
              String st = e.getActionCommand();
              if (st.equals("Continue to home page")){
                  this.dispose();
                  new HomePage();
               }
              else{
                  //continue;
                  this.dispose();
                 // new FindFriends();
                  new FindFriends();
               }
           }
     }
 
class UploadPage extends Frame implements ActionListener {
    UploadPage(){
    Label add = new Label("Add files by giving the path or by selecting from device");
    add.setBounds(100+130+60,100,400,40);
    Label path =new Label("path of the file :");
    path.setBounds(100+100,100+50,400,40);
    TextField path1 = new TextField("");
    path1.setBounds(100+100+100+15,100+50+5,400,30);
        Button up = new Button("Upload");
        up.setBounds(100+100+100+70+70,100+100,100,30);
        Button ad = new Button("ad");
        ad.setBounds(10,70,100+100-20,460);
        Button drag = new Button("Drag and Drap here");
        drag.setBounds(100+100+100-50,100+100+100-50,500,200);
        Button back = new Button("Back");
        back.setBounds(30,30,40,20);
        back.addActionListener(this);
        up.addActionListener(this);
    setSize(800,500);
    setLayout(null);
    setVisible(true);
        add(path1);
    add(add);
    add(path);
        add(up);
        add(ad);
        add(drag);
        add(back);
        setTitle("Upload");
        this.addWindowListener(new WindowAdapter(){ public void windowClosing(WindowEvent e){
            System.exit(0); }
        });
    }
    public void actionPerformed(ActionEvent e){
        String st =e.getActionCommand();
        if (st.equals("Back")){
            this.dispose();
            new HomePage();
        }
        if (st.equals("Upload")){
            new UploadSuccess();
        }
        
    }
    public static void main(String...args){
        new UploadPage();
    }
    }
 
class UploadSuccess extends Frame implements ActionListener{
    UploadSuccess(){
    Label suc = new Label("Your file be uploaded in 1.3 Hrs");
    suc.setBounds(50,50,200,30);
    Button ok = new Button("ok");
    ok.setBounds(150,70+20,40,20);
        ok.addActionListener(this);
    setSize(300,140);
    setLayout(null);
    setVisible(true);
    add(suc);
    add(ok);
    setTitle("Sucess");
    this.addWindowListener(new WindowAdapter(){ public void windowClosing(WindowEvent e){
            System.exit(0); }
        });
    }
    public void actionPerformed(ActionEvent e){
        this.dispose();
    }
}
 
 
