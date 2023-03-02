package java11thisway;

public class acmoReview_0301 {

	public static void main(String[] args) {
		//은행계좌(Account) class 인스턴스(acc) 생성
		Account acc = new Account();
		//setter 처리가 된 요소의 값을 초기화 >> set ~~ 사용
		acc.setNumber("111-1111-11");
		acc.setName("홍길동");
		acc.setBalance(50000);
		//getter를 사용하여 값을 호출. >> get~~ 사용
		System.out.println(acc.getNumber());
		System.out.println(acc.getName());
		System.out.println(acc.getBalance());

	}//main() method end
}//acmoReview_0301 class end

class Account{					// Account class 생성
	private String number;		// 멤버변수 선언
	private String name;
	private int balance;
	
	//getter
	// 해당 클래스를 호출하고, private 상태의 요소를 사용할 수 있도록 값을 리턴 해 주는 역할 > 값 설정
	public String getNumber() {
		return number;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	
	
	//setter
	// getter로 지정된 값을 불러 올 때, 값을 대입하여 사용할 수 있도록 해 주는 역할. 		> 값 초기화
	public void setNumber(String number) {
		this.number = number;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}//Account class end
