/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 * |_Movie
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 21.
 * </pre> 
 *
 * @auther : 박준래
 * @version : 1.8
 */
public class Movie {
	private String title;
	private int limitAge;
	
	public Movie(){	}
	public Movie(String title, int limitAge){
		this.title = title;
		this.limitAge = limitAge;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * @return the limitAge
	 */
	public int getLimitAge() {
		return limitAge;
	}
	
	
	

}
