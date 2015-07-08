package LianXi3;

public class Person {
String name;
int age;
String address;

void introduce(){
	System.out.println("我叫"+name+"，我今年"+age+"岁了，我来自"+address+"。");
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person person=new Person();//实例化一个对象
person.name="李四";//给属性赋值
person.age=20;//给属性赋值
person.address="苏州";//给属性赋值
person.introduce();
	}

}
