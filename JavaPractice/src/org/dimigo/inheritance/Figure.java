package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * |_Figure
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 12.
 * </pre> 
 *
 * @auther : 박준래
 * @version : 1.8
 */
public class Figure {
	private int centerX;
	private int centerY;
	
	public Figure(int centerX, int centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}
	protected double calcArea(){
		return 0.0;
	}	

}
