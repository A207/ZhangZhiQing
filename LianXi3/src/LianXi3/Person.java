package LianXi3;

public class Person {
String name;
int age;
String address;

void introduce(){
	System.out.println("�ҽ�"+name+"���ҽ���"+age+"���ˣ�������"+address+"��");
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person person=new Person();//ʵ����һ������
person.name="����";//�����Ը�ֵ
person.age=20;//�����Ը�ֵ
person.address="����";//�����Ը�ֵ
person.introduce();
	}

}
