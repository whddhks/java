package day09;
//직삼각형 : 가로*세로/2
//Shape 추상클래스를 상속 박아서 오류없게 메서드 재정의 
public class Triangle extends Shape {
	public void area (int x,int y) {
		int k=(x*y)/2;
		System.out.println("직삼각형의 넓이: "+k);
	}

}
