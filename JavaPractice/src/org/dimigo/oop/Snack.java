/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_Snack
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 18.
 * </pre> 
 *
 * @auther : 박준래
 * @version : 1.8
 */

public class Snack {
	/**
	 * @param name
	 * @param company
	 * @param price
	 * @param number
	 */
	public Snack(String name, String company, int price, int number) {
		super();
		this.name = name;
		this.company = company;
		this.price = price;
		this.number = number;
	}

	public String name;
	public String company;
	public int price;
	public int number;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void printSnack(){
		System.out.println("이름 : "+this.name);
		System.out.println("제조사 : "+this.company);
		System.out.println("가격 : "+String.format("%,d", this.price)+"원");
		System.out.println("개수 : "+this.number+"개");
	}
	
	public int calcPrice(){
		return (this.price* this.number);
	}
	
	
}
