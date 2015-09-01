/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 * |_IPhone
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 25.
 * </pre> 
 *
 * @auther : 박준래
 * @version : 1.8
 */
public class IPhone extends SmartPhone {
	IPhone(String model, String company, int price){
		super(model,company,price);
	}
	
	public void pay(){
		System.out.println("애플 페이로 결제합니다.");
	}
	
	public void useAirDrop(){
		System.out.println("AirDrop 기능을 사용합니다.");
	}

}
