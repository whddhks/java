package day11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*jpanel p를 프레임에 붙이고
 * 단 p의 레이아웃변경 행렬 2행2열
 * 네이버green 구글yellow 다음blue 야후magenta 붙인다
 * 누르면 색이바뀌게
 * */
public class MyGui extends JFrame{
	JPanel p,pN;
	JTextArea ta;
	JButton bR,bG,bB,bExit;
	public MyGui() {
		super("::MyGui::");
		p=new JPanel();
		p.setBackground(Color.LIGHT_GRAY);
		add(p,"Center");
		
		p.setLayout(new BorderLayout());
		pN=new JPanel();//FlowLayout
		pN.setBackground(new Color(180,50,100));//rgb
		p.add(pN,"North");
		
		ta=new JTextArea("안녕");
		p.add(new JScrollPane(ta),"Center");
		
		bR=new JButton("Red");
		bG=new JButton("Green");
		bB=new JButton("Blue");
		bExit=new JButton("Exit");
		
		pN.add(bR);
		pN.add(bG);
		pN.add(bB);
		pN.add(bExit);
		//생성자 안에서 이벤트 소스와 이벤트 핸들러를 연결 해줘야한다.
		// -이벤트소스.addXXXListener(이벤트 핸들러객체)
		MyEventHandler handler= new MyEventHandler();//자기꺼라 간단하게
		//MyGui.MyEventHandler handler=this.new MyEventHandler();
		bR.addActionListener(handler);//이벤트
		bG.addActionListener(handler);
		bB.addActionListener(handler);
		bExit.addActionListener(handler);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//생성자~~~
	
	//이벤트 핸들러들은
	//XXXListener상속받아야함
	class MyEventHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			//이벤트가 발생된 객체릐 참조값을 얻어보자.
			Object obj=e.getSource();//이벤트소스에 대한 정보를 반환
			if (obj==bR) {
				//ta.setBackground(Color.blue);
				ta.setForeground(Color.red);
				//이벤트 처리코드가 여기로 들어가야함
			}else if (obj==bG) {
				ta.setForeground(Color.green);
			}else if (obj==bB) {
				ta.setForeground(Color.blue);
			}else if (obj==bExit) {
				System.exit(0);
			}
		}
		
	}/////////////////

	public static void main(String[] args) {
		MyGui mg=new MyGui();
		mg.setSize(500,500);
		mg.setVisible(true);

	}

}
