/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * |_Triangle
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 12.
 * </pre> 
 *
 * @auther : 박준래
 * @version : 1.8
 */
public class Triangle extends Figure {

	private int width;
	private int height;
	
	public Triangle(int width , int height){
		super(0,0);
		this.width = width;
		this.height = height;
	}
	
	public Triangle(int centerX,int centerY, int width, int height){
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	protected double calcArea(){
		return this.width * this.height * 1/2;
	}
}
