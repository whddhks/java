package day10;
import javax.swing.*;
import java.awt.*;

public class MyApp extends JFrame{
	JPanel p=new JPanel();
	JPanel pN=new JPanel();
	JTextArea ta=new JTextArea();
	JButton bt1,bt2,bt3,bt4;
	

	public MyApp() {
		super("::MyApp::");
		add(p);
		p.setLayout(new BorderLayout());
		
		p.add(pN,"North");
		p.add(ta,"Center");
		
		
		pN.setBackground(Color.RED);
		bt1=new JButton("Login");
		bt2=new JButton("join");
		bt3=new JButton("name");
		bt4=new JButton("password");
		pN.add(bt1);
		pN.add(bt2);
		pN.add(bt3);
		pN.add(bt4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		MyApp my=new MyApp();
		my.setSize(500,500);
		my.setVisible(true);
		

	}

}
