/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * |_FigureTest
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 12.
 * </pre> 
 *
 * @auther : 박준래
 * @version : 1.8
 */
public class FigureTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(5);
		Triangle t = new Triangle(10,10,5,8);
		Rectangle r = new Rectangle(20,20,5,8);
		
		System.out.println("원의 넓이 : "+c.calcArea());
		System.out.println("삼각형의 넓이 : "+t.calcArea());
		System.out.println("사각형의 넓이 : "+r.calcArea());
		System.out.println();
		
		c.printCenter();
		t.printCenter();
		r.printCenter();
		
		System.out.println();
		System.out.println("--중심좌표 이동 (x,y축 5씩)");
		System.out.println();
		
		c.moveFigure(5, 5);
		t.moveFigure(5,5);
		r.moveFigure(5, 5);
		
		c.printCenter();
		t.printCenter();
		r.printCenter();
		
		

	}

}
