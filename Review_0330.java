package forReview;

public class Review_0330 {

	public static void main(String[] args) {
		// from JAVA0302, constructor
		System.out.println("Person 인스턴스 생성 전");
		
		System.out.println("-------------------------------");
		
		System.out.println("Person 인스턴스 생성 후 !!");
		Person pigeon = new Person();
		
		System.out.println("\n===NextJavaFile===\n");
		
		Account acc = new Account();
		
		System.out.println("\n===NextJavaFile===\n");
		
		Person pe = new Person("유재석",50);
		Account acc2 = new Account("홍진호","22-2222-22",222);
		
		System.out.println("\n===NextJavaFile===\n");
		
		OverLoadingMethod olm = new OverLoadingMethod();
		olm.add(1, 2);
		olm.add(1.1, 2.2);
		olm.add(1, 2, 3);
		
		System.out.println("\n===NextJavaFile===\n");
		
		Person nm = new Person();
		Person ovm1 = new Person("삼삼");
		Person ovm2 = new Person("넷넷",44);
		
		System.out.println("\n===NextJavaFile===\n");
		
		PassByTest past = new PassByTest();
		Money m = new Money();
		System.out.println("money 초기값: "+m.money);
		past.changePrimitiveType(m.money);
		System.out.println("changePrimitiveType() 호출 후 money: "+m.money);
		past.changeReferenceType(m);
		System.out.println("changeReferenceType() 호출 후 money: "+m.money);
		
		System.out.println("\n===NextJavaFile===\n");
		
		Account acc3 = new Account("삼삼","33-333-33",30000,3333);
		
		System.out.println("\n===NextJavaFile===\n");
		
		VariableArguments varArgs = new VariableArguments();
		varArgs.print2(1,"A","B","C");
		
		System.out.println("\n===NextJavaFile===\n");

		StaticMethod();
		System.out.println("main(): "+StaticMember.str);
		
		System.out.println("\n===NextJavaFile===\n");
		
		StaticMethod.staticMethod();
//		StaticMethod.normalMethod();
		
		System.out.println("\n===NextJavaFile===\n");
		
		Parent p = new Parent();
		Child c = new Child();
		
		p.parentPrn();
		System.out.println(p.num);
		c.parentPrn();
		c.childPrn();
		c.c_showNum();
		
		System.out.println("\n===NextJavaFile===\n");
		
		Student stu = new Student();
		stu.eat();
		stu.sleep();
		
		System.out.println("\n===NextJavaFile===\n");
		
		stu.checkSuper();
		
		System.out.println("\n===NextJavaFile===\n");
		
		System.out.println(Math.PI);
		
		System.out.println("\n===NextJavaFile===\n");
		
		//0403
		
		Finals fi = new Finals();
		System.out.println(fi.finalMember);
		System.out.println(fi.normalMember);
//		fi.finalMember = 30; // final, 변경 불가
		fi.normalMember = 40; // 변경 가능
		fi.finalMethod();
		fi.normalMethod();
		
		System.out.println(Math.PI);
		// final 상수의 대표적인 예시, PI값. (원주율)
		
		System.out.println("\n===NextJavaFile===\n");
		
		Parent rc_P = new Parent();
		Child rc_C = new Child();
		
		rc_P.parentPrn();
		rc_C.parentPrn();
		rc_C.childPrn();
		
		Parent rc_P2 = new Child(); // 업캐스팅
		rc_P2.parentPrn();
//		rc_P2.chilcPrn(); // 업캐스팅으로 인한 참조영역 축소
		// Child 생성자를 통하여 선언 되었으나, 데이터타입이 Parent이므로
		// Child 클래스의 메서드를 참조하지 못한다.
		
		Child rc_C2 = (Child)rc_P2; // 다운캐스팅
		// Parent 타입이 Child타입보다 상위 타입임 ! > 강제형변환 필요
		rc_C2.parentPrn();
		rc_C2.childPrn();
		// Child 클래스의 메서드가 참조 불가능이던 rc_P2 를 대입한 Child타입 rc_C2
		// > 타입이 Child 이므로 >> Child 클래스의 메서드가 다시 이용 가능해졌다 !
			
		System.out.println("\n===NextJavaFile===\n");
		

		
		
		

	}// main() method end
	
	public static void StaticMethod(){
		System.out.println(StaticMember.str);
		StaticMember sm = new StaticMember();
		System.out.println(sm.str2);
		System.out.println("This is Static - Method.");
	} //StaticMethod() method end

}// public class end


class Person{
	String name;
	int age;
	public Person(){
		System.out.println("생성자 Person 호출됨!");
		name="비둘기";
		age=99;
		showPersonInfo();
	}
	
	public Person(String name) {
		System.out.println("<Overloading Method>");
		this.name = name;
		age = 33;
		showPersonInfo();
	}
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
		showPersonInfo();
	}

	public void showPersonInfo() {
		System.out.println("이름: "+name);
		System.out.println("나이: "+age+ "세");
	}
	
	public void eat() {
		System.out.println("eat()");
	}
	public void sleep() {
		System.out.println("sleep()");
	}

	
}// Person class end

class Account{
	String accountNo;
	String ownerName;
	int balance;
	int numPw;
	public Account(){
		accountNo = "999-9999-999";
		ownerName = "비둘기";
		balance = 999;
		showAccountInfo();
	}
	
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
		showAccountInfo();
	}
	
	public Account(String accountNo, String ownerName, int balance, int numPw) {
		this(accountNo,ownerName,balance);
		this.numPw = numPw;
		showAccountInfo();
		
	}
	
	
	
	public void showAccountInfo() {
		System.out.println("계좌번호: "+accountNo);
		System.out.println("예금주명: "+ownerName);
		System.out.println("계좌잔고: "+balance+ "원");
		System.out.println("비밀번호: "+numPw);
	}
} // Account class end

class OverLoadingMethod{
	public void add(int n1, int n2) {
		System.out.println("DATA TYPE = int");
		System.out.println(n1+n2);
	}
	public void add(double n1, double n2) {
		System.out.println("DATA TYPE = double");
		System.out.println(n1+n2);
	}
	public void add(int n1, int n2 ,int n3) {
		System.out.println("DATA TYPE = int");
		System.out.println(n1+n2+n3);
	}
	
}// OverLoadingMethod class end

class PassByTest{
	public void changePrimitiveType(int money) {
		money -= 5000;
		System.out.println("changePrimitiveType() 메서드의 money = "+ money);
		System.out.println("참조값은 건드리지 않음!");
	}
	
	public void changeReferenceType(Money m) {
		m.money -= 5000;
		System.out.println("changeReferenceType() 메서드의 money = "+ m.money);
		System.out.println("참조값의 수정 발생!");
	}
	
}//PassByTest class end

class Money{
	int money = 10000;
}// Money class end

class VariableArguments{
	public void print(String...names) {
			// basic
	}
	public void print2(int num, String...names) {
				for(int i=0;i<names.length;i++) {
			System.out.println("조 번호: "+num+", 이름: " +names[i]+" ");
		}
		System.out.println();
	}

}// VariableArguments class end

class StaticMember{
	static String str = "This is Static - String.";
	String str2 = "This is Member - String.";
}//StaticMember class end

class StaticMethod{
	private int normalVar = 10;
	private static int staticVar = 20;
	
	public void normalMethod() {
		System.out.println("일반 메서드 normalMethod()");
	}
	public static void staticMethod() {
		System.out.println("Static메서드 staticMethod()");
	}
	
	
	public void setNormalVar(int normalVar) {
		this.normalVar = normalVar;
	}
	public static void setStaticVar(int staticVar) {
		StaticMethod.staticVar = staticVar;
	}

} //StaticMethod class end

class Parent {
	int num = 10;
	public Parent() {
		System.out.println("Parent class 기본생성자");
	}
	public void parentPrn() {
		System.out.println("superclass - parentPrn()");
	}
	public void p_showNum() {
		System.out.println("inheritance num = "+ num);
	}
}// Parent class end

class Child extends Parent{
	int myNum = 20;
	public void childPrn() {
		System.out.println("subclass - childPrn()");
	}
	public void c_showNum() {
		p_showNum();
		System.out.println("myNum = "+myNum);
	}
	public Child() {
		super();
		System.out.println("Child class 기본생성자");
	}
}// Child class end

class Student extends Person {
	String name="학생1";
	public Student() {
		System.out.println("Student() 생성자");
	}
	public void study() {
		System.out.println("study()");
	}
	@Override
	public void sleep() {
		System.out.println("sleep(), Override!");
	}
	public void checkSuper() {
		System.out.println("super.name = "+ super.name);
		System.out.println("this.name = "+ this.name);
	}
}// Student class end

// 0322_final


//0403

class Finals{
	final int finalMember = 10;
	int normalMember = 20;
	public final int finalMethod() {
//		finalMember = 30; // final값 변경 불가
		System.out.println(finalMember);
		return finalMember;
	}// finalMethod() method end
	public int normalMethod() {
		System.out.println(normalMember);
		return normalMember;
	}//normalMethod() method end
}// Finals class end

class subFinals extends Finals{
	
	public void subFinalsMethod() {
//		finalMember = 30; // final값 변경 불가
		normalMember = 40;
		finalMethod();
		normalMethod();
	}//subFinalsMethod() method end

	@Override
	public int normalMethod() {
		// TODO Auto-generated method stub
		finalMethod(); // 사용은 가능하다.
		return super.normalMethod();
	}
//	@Override
//	public int finalMethod() { // final 메서드 오버라이딩 불가
//		// TODO Auto-generated method stub
//		return super.finalMethod();
//	}
	

	

}//subFinals class end











































