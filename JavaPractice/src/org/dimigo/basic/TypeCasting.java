package org.dimigo.basic;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int 급여 = 1700000;
		short 직원수 = 3;
		int 점포수 = 150;
		long 인건비 = (long)급여*12*(long)직원수*(long)점포수;
		System.out.println("<<디미베네 연간 인간비>>");
		System.out.println("월 평균 급여 : "+String.format("%,d",급여) +"원");
		System.out.println("점포내 직원 수 : "+직원수+"명");
		System.out.println("점포수 : "+점포수+"개");
		System.out.println("연간 인건비 : "+String.format("%,d", 인건비)+"원" );
	}

}