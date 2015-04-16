/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_Car
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 13.
 * </pre> 
 *
 * @auther : 박준래
 * @version : 1.8
 */
public class Car3 {
		private String company = "현대자동차";
		private String model ="제네시스";
		private String color = "검정색";
		private int Maxspeed = 225;
		private int price = 50000000;
		  
		public Car3() {}
		
		public Car3(String newcompany, String newmodel, String newcolor, int newmaxspeed, int newprice){
			company = newcompany;
			model = newmodel;
			color = newcolor;
			Maxspeed = newmaxspeed;
			price = newprice;
		}
		public Car3(String newcompany, String newmodel, String newcolor, int newmaxspeed){
			this(newcompany,newmodel,newcolor,newmaxspeed,0);
		}
		public Car3(String newcompany, String newmodel, String newcolor){
			this(newcompany,newmodel,newcolor,0,0);
		}
		
		public String getCompany(){
			return company;
		}
		
		public String getModel(){
			return model;
		}
		
		public String getColor(){
			return color;
		}
		
		public int getMaxSpeed(){
			return Maxspeed;
		}
		
		public int getprice(){
			return price;
		}
		/*
		public void setCompany(String newcompany){
			company = newcompany;
		}
		public void setModel(String newmodel){
			model = newmodel;
		}
		public void setColor(String newcolor){
			color = newcolor;
		}
		public void setMaxSpeed(int newMaxspeed){
			Maxspeed = newMaxspeed;
		}
		public void setprice(int newprice){
			price = newprice;
		}*/
}
