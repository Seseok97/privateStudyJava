package forReview;

public class SingletonReview_0330 {

	public static void main(String[] args) {
		SingletonClass sc = SingletonClass.getInstance();
		sc.str = "Singleton Pattern Instance str";
		
		SingletonClass sc2 = SingletonClass.getInstance();
		
		System.out.println("sc.str: "+sc.str);
		System.out.println("sc.str2: "+sc2.str);
		
		if(sc == sc2) {
			System.out.println("sc == sc2");
		}else {
			System.out.println("sc != sc2");
		}

	}// main() method end

}//SingletoneReview_0330 class end

class SingletonClass{
	String str;
	
	private SingletonClass() {};
	
	private static SingletonClass instance = new SingletonClass();
	
	public static SingletonClass getInstance() {
		return instance;
	}

} // SingletonClass class end


class SingletonClass2{
	private static SingletonClass2 instance = new SingletonClass2();
	private SingletonClass2() {}
	public static SingletonClass2 getInstance() {
		return instance;
	}
}// SingletonClass2 class end