package org.dimigo.basic;
/***************************
 * <<첫번째 수행평가>>
 * 내용 : 아이유 프로필 출력하기
 * 작성일 : 2015.03.13
 * @author 박준래
 *
 ***************************/
public class PrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "아이유";
		boolean gender = true;
		int age = 23;
		double high = 161.8;
		float kg = 44.3f;
		char blood = 'A';
		System.out.println("<<아이유 프로필>>");
		System.out.println("이름 : "+name);
		if(gender){
			System.out.println("성별 : 여자");
		}
		else{
			System.out.println("성별 : 남자");
		}
		System.out.println("나이 : "+age+"세");
		System.out.println("키 : "+high+"cm");
		System.out.println("몸무게 : "+kg+"kg");
		System.out.println("혈액형 : "+blood+"형");
	}

}
