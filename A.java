package sec13.exam03_field_method_access.package1;

public class A {
//�ʵ�
	public int field1;						//public ���� ����			//Type��
	int field2;								//default ���� ����			//Type��
	private int field3;						//private ���� ����			//Type��
	
	//������
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
											//Ŭ���� ������ ��� ���� �������� ������ ���� �ʴ´�.
		method1();
		method2();
		method3();
	}
	
	//�޼ҵ�
	public void method1() {}				//public ���� ����
	void method2() {}						//default ���� ����
	private void method3() {}				//private ���� ����
}
