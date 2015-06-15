/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_PiggyBankTest
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 12.
 * </pre> 
 *
 * @auther : 박준래
 * @version : 1.8
 */
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FamilyMember Father = new FamilyMember("아빠");
		FamilyMember Mother = new FamilyMember("엄마");
		FamilyMember Me = new FamilyMember("나");
		FamilyMember Brother = new FamilyMember("남동생");
		PiggyBank.putMoney(Father, 10000);
		PiggyBank.putMoney(Mother, 5000);
		PiggyBank.putMoney(Me, 2000);
		PiggyBank.putMoney(Brother, 1000);
		
		PiggyBank.printBalance();
		
		PiggyBank.putMoney(Me, 1000);
		
		PiggyBank.printBalance();

	}

}
