package org.dimigo.basic;
/***************************
 * <<ù��° ������>>
 * ���� : ������ ������ ����ϱ�
 * �ۼ��� : 2015.03.13
 * @author ���ط�
 *
 ***************************/
public class PrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "������";
		boolean gender = true;
		int age = 23;
		double high = 161.8;
		float kg = 44.3f;
		char blood = 'A';
		System.out.println("<<������ ������>>");
		System.out.println("�̸� : "+name);
		if(gender){
			System.out.println("���� : ����");
		}
		else{
			System.out.println("���� : ����");
		}
		System.out.println("���� : "+age+"��");
		System.out.println("Ű : "+high+"cm");
		System.out.println("������ : "+kg+"kg");
		System.out.println("������ : "+blood+"��");
	}

}
