/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * |_Circle
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 12.
 * </pre> 
 *
 * @auther : 박준래
 * @version : 1.8
 */
public class Circle extends Figure {

	private int radius;
	
	public Circle(int radius){
		super(0,0);
		this.radius = radius;
	}
	
	public Circle(int centerX, int centerY, int radius){
		super(centerX, centerY);
		this.radius = radius;
	}
	
	protected void printCenter(){
		System.out.print("원 ");
		super.printCenter();
	}
	
	protected double calcArea(){
		return this.radius * this.radius * 3.14;
	}
}
