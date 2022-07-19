package day12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LambdaGui extends JFrame {
	
	JPanel p=new JPanel();
	JPanel pN=new JPanel();
	JLabel l;
	JButton b1,b2=new JButton();

	public LambdaGui()  {
		super("::LambdaGui::");
		
		add(p,"Center");
		p.setLayout(new BorderLayout());
		p.add(pN,"North");
		l=new JLabel(new ImageIcon("awdawd.PNG"));
		l.setText("Welcome to MyApp");
		l.setHorizontalTextPosition(JLabel.CENTER);
		l.setVerticalTextPosition(JLabel.TOP);
		l.setFont(new Font("sans-serif",Font.BOLD,24));
						//    서체		스타일		크기
		
		//[1]bt1클릭시 l의 글자색을 파알색으로 이름없는 클래스
		
		//[2]bt2 핑크색 lambdar식 이용 이벤트 처리
		p.add(l,"Center");
		b1=new JButton("blue");
		b2=new JButton("Pink");
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			 l.setForeground(Color.blue);
			}
		});
		b2.addActionListener(e->{l.setForeground(Color.pink);});
		
		pN.add(b1);
		pN.add(b2);
		
		this.setSize(500,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new LambdaGui();

	}

}
