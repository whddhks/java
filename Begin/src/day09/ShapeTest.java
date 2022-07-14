package day09;

public class ShapeTest {

	public static void main(String[] args) {
		System.out.println("---각도형의 면적을 구해 봅시다.---");
		System.out.println("가로 : "+7+"세로 : "+8+"--------");
		//사각형
		Rectangle rt=new Rectangle();
		rt.area(7, 8);
		//삼각형
		Triangle ta=new Triangle();
		ta.area(7, 8);
		
		System.out.println("반지름 8인 원의 면적 :");
		//Circle cr=new Circle();은 돌연변이같은 느낌이라 못함
		//추상클래스는 타입 선언은 할 수 있으나, new해서 객체생성은 할수 없다.
		Circle cr=new Subcircle();
		cr.area(8, 0);
		((Subcircle)cr).area(8);//강제형변환
		
		Subcircle sc=new Subcircle();
		sc.area(8);
		
		//1]rt, ta, cr, sc 객페들을 저잘할 배열을 생성하고 저장한뒤
		//	for루프 돌리면서 area()호출해보기 20.30
		Shape[] arr={rt, ta, cr, sc};
		for (int i=0;i<arr.length;i++) {
			if (i<3) {
			Shape sp=arr[i];
			sp.area(20, 30);
			}else if(i>2) {
				((Subcircle)sc).area(20);
			}
			
		}
		
		
		for (Shape shape : arr) {
			if(shape instanceof Subcircle) {
				((Subcircle)shape).area(20);
			}else
				shape.area(20, 30);
		}
		/*Circle[] arr2= {cr, sc};
		for (int i=0;i<arr2.length;i++) {
			
		}
	*/
	}

}
