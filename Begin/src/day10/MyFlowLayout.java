package day10;
import javax.swing.*;
import java.awt.*;
/*LayoutManager
 * - 1]FlowLayout
 * - 2]BorderLayout :동서남북 중앙 영역을 지정해서 배치
 * - 3]GridLayout   :행과열의 형태로 균등하게배치
 * 레이아웃을 변경 : setLayout()이용
 * */

public class MyFlowLayout extends JFrame{
	
	JButton b1,b2,b3,b4;
	JPanel p; //기본 레이아웃은 FlowLayout
			  //중앙정렬

	public MyFlowLayout() {
		super("::MyFlowLayout::");
		p=new JPanel();
		this.add(p);
		p.setBackground(Color.WHITE);
		//p.setLayout(new BorderLayout());
		//p.setLayout(new GridLayout(2,2));
		p.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		b1=new JButton("  File  ");
		b2=new JButton("  Edit  ");
		b3=new JButton(" Source ");
		b4=new JButton("Navigate");
		
		
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	}
	

	public static void main(String[] args) {
		MyFlowLayout my=new MyFlowLayout();
		my.setSize(500,500);
		my.setVisible(true);
		
		
		
		
		
		
		
		
		

	}

}
