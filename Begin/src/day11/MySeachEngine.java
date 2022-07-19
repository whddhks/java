package day11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MySeachEngine extends JFrame{
	JPanel p=new JPanel();
	//JTextArea ta=new JTextArea();
	JButton b1,b2,b3,b4;


	public MySeachEngine() {
		super(":::MySeachEngine:::");
		add(p,"Center");
		p.setBackground(Color.PINK);
		
		p.setLayout(null);
		b1=new JButton("Naver");
		b2=new JButton("Google");
		b3=new JButton("Daum");
		b4=new JButton("Yahoo");
		
		b1.setBounds(10,10,230,230);
		b2.setBounds(260,10,230,230);
		b3.setBounds(10,260,230,230);
		b4.setBounds(260,260,230,230);
		
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		
		
		MyEventHandler me=new MyEventHandler();
		b1.addActionListener(me);
		b2.addActionListener(me);
		b3.addActionListener(me);
		b4.addActionListener(me);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	class MyEventHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Object obj=e.getSource();
			if (obj==b1) {
				b1.setBackground(Color.green);
				
			}else if (obj==b2) {
				b2.setBackground(Color.yellow);
			}else if (obj==b3) {
				b3.setBackground(Color.blue);
			}else if (obj==b4) {
				b4.setBackground(Color.red);
			}
		}
	}
	public static void main(String[] args) {
		MySeachEngine my=new MySeachEngine();
		my.setSize(520,540);
		my.setVisible(true);

	}

}
