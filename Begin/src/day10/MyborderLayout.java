package day10;
import javax.swing.*;
import java.awt.*;
public class MyborderLayout extends JFrame{
	
	JButton[] bt=new JButton[4];
	JPanel p=new JPanel();
	JPanel pN=new JPanel();
	JTextArea t=new JTextArea();
	
	public MyborderLayout() {
		
		super("::MyborderLayout::");
		add(p);
		p.setLayout(new BorderLayout());
		for(int i=0;i<bt.length;i++) {
			bt[i]=new JButton("b"+(i+1));
			//p.add(bt[i]);
		}
		p.add(bt[0],"North");
		p.add(bt[1],"South");
		p.add(bt[2],"West");
		p.add(bt[3],"East");
		p.add(bt[4],"Center");
		//영역을 지정하지 않으면 Centor가 default다 
		//중앙은 다방면 북남은 좌우만 늘어남 동서는 상하만 늘어남
	}

	public static void main(String[] args) {
		MyborderLayout my=new MyborderLayout();
		my.setSize(500,500);
		my.setVisible(true);

	}

}
