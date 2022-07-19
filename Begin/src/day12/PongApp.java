package day12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//class My
/**
 * 퐁시겅을 가진 사람들이 이용할수 있는 애플리케이샨
 * 작성자 :홍길동
 * 작성일 :22-07-09
 * 버전 : 1.1v
 * */ //클래스나 메소드 앞에 붙인다
public class PongApp extends JFrame{
	JPanel p=new JPanel();
	JPanel pN=new JPanel();
	JTextArea ta=new JTextArea();
	JLabel lb;
	JTextField tfName;
	JButton btAdd,btsave;
	
	public PongApp() {
		super("::PongApp::");
		add(p,"Center");
		p.setLayout(new BorderLayout());
		p.add(pN,"North");
		pN.setBackground(Color.cyan);
		p.add(new JScrollPane(ta=new JTextArea()),"Center");
		lb=new JLabel("이름: ");
		tfName=new JTextField(20);
		btAdd=new JButton("등록");
		btsave=new JButton("저장");
		
		pN.add(lb);
		pN.add(tfName);
		pN.add(btAdd);
		pN.add(btsave);
		
		MyEventHandler handler=new MyEventHandler();
		btAdd.addActionListener(handler);
		btsave.addActionListener(handler);
		tfName.addActionListener(handler);//입력후 엔터 치면 ActionEvent발생
		
		
		this.setSize(500,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	/**버튼에 대한 이벤트를 처리하는 클래스*/
	class MyEventHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Object obj=e.getSource();
			if(obj==btAdd || obj==tfName) {
				//setTitle("add");
				//[1]tfname에 입력한 값을 얻어오기 ==API에서 얻어오는거니까 getter
				String name=tfName.getText();
				//ystem.out.println(name);
				name=name.trim();//앞뒤 공백제거해서 재할당
				//public String getText()
				
				//[2]입력한 값이 '성'을 추출하여 '퐁'씨면 XXX님 환영합니다. 
				try {
					char c1=name.charAt(0);
					if (c1=='퐁') {
						setTitle(name+"님 환영합니다.");
						//ta.setText(name);
						ta.append(name+"\n");
					//[3]tfname에서 얻어온 값을 ta에 붙이기
					//public void setText(String t)
					}else if (c1=='콩'){
						//사용자 정의 예외객체를 발생시킨다 == throw new 예외객체
						//예외가 발생되면 해당 예외를 try~~catch 해야한다.
						throw new NotSupportedNameException("콩씨는 절대로 등록할수없다");
					}else {
						throw new NotSupportedNameException("퐁씨가 아닌 성씨분들은 이용에 제한이있습니다.");
					}
				}catch (NotSupportedNameException ex) {
					String msg=ex.getMessage();
					setTitle(msg);
					//메세지 박스띄우기
					JOptionPane.showMessageDialog(p,msg);
								//showinputDialog
				}finally {
					tfName.setText("");
					tfName.requestFocus();
				}
				
			}else if (obj==btsave) {
				//setTitle("save");
				//
			}
					
				
			
		}
	}

	public static void main(String[] args) {
		new PongApp();

	}

}
//C등록R조회(검색)U수정D삭제





