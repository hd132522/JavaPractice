/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;
/**
 * <pre>
 * org.dimigo.oop
 * |_Question
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 11.
 * </pre> 
 *
 * @auther : 박준래
 * @version : 1.8
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가장 좋아하는 가수는?");
		String answer1 = scanner.nextLine();
		if("안재욱".equals(answer1)){
			System.out.println("정답입니다!!^^");
		}
		else System.out.println("틀렸습니다!!ㅠ");
		
		System.out.println("가장 좋아하는 배우는?");
		String answer2 = scanner.nextLine();
		if("전지현".equals(answer2)){
			System.out.println("정답입니다!!^^");
		}
		else System.out.println("틀렸습니다!!ㅠ");
		
		System.out.println("가장 좋아하는 과목은?");
		String answer3 = scanner.nextLine();
		if("수학".equals(answer3)){
			System.out.println("정답입니다!!^^");
		}
		else System.out.println("틀렸습니다!!ㅠ");
		scanner.close();
	}

}
