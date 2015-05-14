/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * |_Score
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 14.
 * </pre> 
 *
 * @auther : 박준래
 * @version : 1.8
 */
public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 점수 입력 => ");
		int korean = scanner.nextInt();
		System.out.println("수학 점수 입력 => ");
		int math = scanner.nextInt();
		System.out.println("영어 점수 입력 => ");
		int english = scanner.nextInt();
		scanner.close();
		int tot = korean+math+english;
		double avg = tot/3.0;
		StringBuilder a = new StringBuilder();
		a.append("<< 점수 출력 >> \n")
		.append("국어 점수 : "+ korean+"점\n")
		.append("수학 점수 : "+math+"점\n")
		.append("영어 점수 : "+english+"점\n")
		.append("총점 : "+tot+"점\n")
		.append("평균 : " + String.format("%.1f", avg)+"점\n");
		
		System.out.println(a);
	}

}
