package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int type = 1;
		int distance = 10;
		
		if(type == 1){
			int flag1 = ((distance-1)/10) * 300 + 850;
			System.out.println("<<고속도로 통행료 계산>>");
			System.out.println("거리 : "+distance +" km");
			System.out.println("차종 : 고속버스");
			System.out.println("통행료 : "+flag1+"원");
		}
		else if(type == 2){
			int flag2 = ((distance-1)/10) * 200 + 300;
			System.out.println("<<고속도로 통행료 계산>>");
			System.out.println("거리 : "+distance);
			System.out.println("차종 : 경차");
			System.out.println("통행료 : "+flag2+"원");
		}
		else {
			int flag3 = ((distance-1)/10) * 200 + 600;
			System.out.println("<<고속도로 통행료 계산>>");
			System.out.println("거리 : "+distance);
			System.out.println("차종 : 경차");
			System.out.println("통행료 : "+flag3+"원");
		}
	}
}
