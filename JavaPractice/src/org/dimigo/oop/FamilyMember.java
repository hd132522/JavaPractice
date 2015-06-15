/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_FamilyMember
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 12.
 * </pre> 
 *
 * @auther : 박준래
 * @version : 1.8
 */
public class FamilyMember {
		private static int memberCnt;
		private String memberName;
		
		public String getMemberName() {
			return memberName;
		}
		public FamilyMember(String memberName){
			this.memberName = memberName;
			memberCnt++;
		}
		public static void printMemberCnt(){
			System.out.println("가족 총 인원 수 : "+memberCnt+"명");
		}
		
		

}
