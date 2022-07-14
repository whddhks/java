package day09;
//사각형 클래스 
public class Rectangle extends Shape{
	//추상클래스의 영역을 구현해야함
	//아니면 Rectangle에서 오류남
	@Override
	public void area(int x, int y) {
		int k=x*y;
		System.out.println("시각형 면적 : "+k);
		
	}
	

}
