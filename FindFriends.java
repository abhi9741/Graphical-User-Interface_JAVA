import java.awt.*;
import java.awt.event.*;

public class FindFriends extends Frame implements ItemListener{
    Choice l;
    Label welMsg;
    Button sendF,sendR,sendM;
    
    FindFriends(){
     
	setVisible(true);
	setSize(900,500);
	setLayout(null);
	setTitle("Find Friends");
	Button back = new Button("Back");
	back.setBounds(40,20,50,20);
	add(back);
	l = new Choice();
	l.add("Dude 1");
	l.add("Dude 2");
	l.add("Dude 3");
	l.add("Dude 4");
	l.add("Dude 5");
	l.add("Dude 6");
	l.addItemListener(this);
	this.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
		    System.exit(0);
		}
	    });
	l.setBounds(30,50,160,40);
	add(l);
    }
    FindFriends(String s){
	setVisible(true);
	setSize(900,500);
	setLayout(null);
	l = new Choice();
	sendF = new Button("Send!");
	sendF.addActionListener(new ActionListener() {
		public final void actionPerformed(final ActionEvent e) {
		    new sendF();
		}
	    });
	sendR = new Button("Gimme!");
	sendR.addActionListener(new ActionListener() {
		public final void actionPerformed(final ActionEvent e) {
		    new sendR();
		}
	    });
	sendM = new Button("Text");
	sendM.addActionListener(new ActionListener() {
		public final void actionPerformed(final ActionEvent e) {
		    new sendM();
		}
	    });
	sendF.setBounds(450+50,80,80,30);
	sendR.setBounds(450+50,130,80,30);
	sendM.setBounds(450+50,180,80,30);
	welMsg = new Label("Target is set to "+s+" :p");
	l.add("Dude 1");
	l.add("Dude 2");
	l.add("Dude 3");
	l.add("Dude 4");
	l.add("Dude 5");
	l.add("Dude 6");
	l.addItemListener(this);
	this.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
		    System.exit(0);
		}
	    });
	welMsg.setBounds(20,200,180,30);
	l.setBounds(30,50,160,40);
	l.select(s);
	add(welMsg);
	add(l);
	add(sendF);
	add(sendR);
	add(sendM);
	Button back = new Button("Back");
	back.setBounds(20,20,20,20);
	back.addActionListener(new ActionListener() {
	public final void actionPerformed(final ActionEvent e) {
	    new HomePage();
	}
    });
	add(back);
    }
    public void paint(Graphics g){
	g.drawLine(220,0,220,500);
    }
    public void itemStateChanged(ItemEvent e){
	new FindFriends(l.getSelectedItem());
	this.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
		    System.exit(0);
		}
	    });
	dispose();
    }
    public static void main(String...args){
	new FindFriends();
    }

}

class sendF extends Frame{
    TextField tf;
    Label l;
    Button b;
    sendF(){
	setVisible(true);
	setLayout(null);
	setSize(400,300);
	tf=new TextField();
	l= new Label("Path: ");
	b= new Button("Send");
	tf.setBounds(80,40,280,30);
	this.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
		    System.exit(0);
		}
	    });
	l.setBounds(20,30,40,30);
	b.setBounds(180,120,60,30);
	add(b);
	add(l);
	add(tf);
	b.addActionListener(new ActionListener() {
		public  void actionPerformed(ActionEvent e) {
		    new Info();
		    dispose();
		}
	    });
	
    }
    public static void main(String...args){
	new sendF();
    }
}

class Info extends Frame{
    Label l;
    Button b;
    Info(){
	setSize(400,100);
	setVisible(true);
	setLayout(null);
	this.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
		    System.exit(0);
		}
	    });
	l = new Label("Dude your task has been done scessfully");
	b = new Button("Yo!");
	l.setBounds(40,20,300,30);
	b.setBounds(180,60,60,30);
	b.addActionListener(new ActionListener() {
		public  void actionPerformed( ActionEvent e) {
		    dispose();
		}
	    });
	add(l);
	add(b);
    }
    public static void main(String...args){
	new Info();
    }
}

class sendR extends Frame{
    TextField tf;
    TextField fname;
    Label l;
    Label name;
    Button b;
    sendR(){
	setVisible(true);
	setLayout(null);
	setSize(400,300);
	tf=new TextField();
	fname=new TextField();
	l= new Label("Name:");
	name = new Label("File");
	b= new Button("Send");
	tf.setBounds(80,40,280,30);
	fname.setBounds(80,80,280,30);
	name.setBounds(20,80,40,30);
	this.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
		    System.exit(0);
		}
	    });
	l.setBounds(20,30,40,30);
	b.setBounds(180,150,60,30);
	add(name);
	add(b);
	add(l);
	add(tf);
	add(fname);
	b.addActionListener(new ActionListener() {
		public  void actionPerformed( ActionEvent e) {
		    new Info();
		    dispose();
		}
	    });
	
    }
}


class sendM extends Frame{
    TextField tf;
    TextField fname;
    Label l;
    Label name;
    Button b;
    sendM(){
	setVisible(true);
	setLayout(null);
	setSize(400,300);
	tf=new TextField();
	fname=new TextField();
	l= new Label("Name :");
	name = new Label("Msg : ");
	b= new Button("Send");
	tf.setBounds(80,40,280,30);
	fname.setBounds(80,80,280,30);
	name.setBounds(20,80,40,30);
	this.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
		    System.exit(0);
		}
	    });
	l.setBounds(20,30,40,30);
	b.setBounds(180,150,60,30);
	add(name);
	add(b);
	add(l);
	add(tf);
	add(fname);
	b.addActionListener(new ActionListener() {
		public  void actionPerformed(ActionEvent e) {
		    new Info();
		    dispose();
		}
	    });
	
    }
}
