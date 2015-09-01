/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 * |_SmartPhoneTest
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 25.
 * </pre> 
 *
 * @auther : 박준래
 * @version : 1.8
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone a[] = {
				new Galaxy("갤럭시 S6","삼성",650000),
				new IPhone("iPhone 6" ,"애플",700000)
		};
		
		for(SmartPhone v : a){
			System.out.println(v.toString());
			v.turnOn();
			v.pay();
			v.useSpecialFunction();
			v.turnOff();
			System.out.println("");
		}
//		SmartPhone g = new Galaxy("갤럭시 S6","삼성",650000);
//		SmartPhone i = new IPhone("iPhone 6" ,"애플",700000);
//		
//		System.out.println(i.toString());
//		i.turnOn();
//		i.pay();
//		i.useSpecialFunction();
//		i.turnOff();
//		System.out.println("");
//		
//		System.out.println(g.toString());
//		g.turnOn();
//		g.pay();
//		g.useSpecialFunction();
//		g.turnOff();
	}

}
