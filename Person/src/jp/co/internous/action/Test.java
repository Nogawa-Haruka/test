package jp.co.internous.action;

public class Test {
	public static void main (String[]args){
//		インスタンス化　taroは変数名　右辺のPeron()をインスタンス化してtaroに代入　左辺は型
		Person taro = new Person();
//		「.」を使うことでtaroインスタンスのnameを呼び出せる
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="090-1234-5678";
		taro.address="千葉";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		
		Person jiro = new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="080-1234-5678";
		jiro.address="東京";
		
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		
		Person hanaco = new Person();
		hanaco.name="鈴木花子";
		hanaco.age=16;
		hanaco.phoneNumber="070-1234-5678";
		hanaco.address="大阪";
		
		System.out.println(hanaco.name);
		System.out.println(hanaco.age);
		System.out.println(hanaco.phoneNumber);
		System.out.println(hanaco.address);
		
		Person haruka = new Person();
		haruka.name="野川春花";
		haruka.age=25;
		haruka.phoneNumber="03-1234-5678";
		haruka.address="千葉";
		
		System.out.println(haruka.name);
		System.out.println(haruka.age);
		System.out.println(haruka.phoneNumber);
		System.out.println(haruka.address);
		
		Robot aibo = new Robot();
		aibo.name="aibo";
		aibo.talk();
		aibo.walk();
		aibo.run();
		
		Robot asimo = new Robot();
		asimo.name="asimo";
		asimo.talk();
		asimo.walk();
		asimo.run();
		
		Robot pepper = new Robot();
		pepper.name="pepper";
		pepper.talk();
		pepper.walk();
		pepper.run();
	}

}
