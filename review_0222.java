
public class review_0222 {

	public static void main(String[] args) {
		Animal dog = new Animal();
		dog.name = "알쥐";
		dog.age = 2;
		dog.sound ="멍멍";
		dog.movepoint = 10;
		dog.isHungry = true;
		dog.wantPlay = false;
		
		
		dog.petInfo();
		dog.makeSound();
		dog.call();
		dog.feed("시저");
		String trans = dog.call();
		System.out.println("번역: "+trans);
		dog.feed("코코볼");
		dog.play("산책");
		dog.play("달리기");
		
		dog.petInfo();
		dog.bark();
		dog.petInfo();
		dog.play("달리기");
		dog.feed("시저");
		dog.movePointCheck();
		dog.bark();
	}//main() method end
}//review_0222 class end

class Animal{
	String name;
	int age;
	String sound;
	int movepoint;
	boolean isHungry;
	boolean wantPlay;
	
	
	public void petInfo() {
		System.out.println("name: "+ name);
		System.out.println("age: "+age);
		System.out.println("hp: "+movepoint);
	}//petInfo() method end
	
	public void makeSound() {
		System.out.println(name+": "+sound);
	}//makeSound() method end
	
	public int live(int year) {
		int temp = year - age;
		return temp;
	}//live() method end
	
	//알쥐 밥먹이기
	public void feed(String menu) {
		System.out.println("나: "+name+"야 "+menu+"먹자~");
		if(isHungry) {
			System.out.println("냠냠~");
			isHungry = false;
			movepoint += 3;
		}else {
			System.out.println("아직 배불러요..");
			wantPlay = true;
		}
	}//feed() method end
	
	//알쥐 놀아주기
	public void play(String run) {
		System.out.println("나: "+name+"야 "+run+"하자~");
		if(movepoint>0){
			if(wantPlay) {
				System.out.println("헥헥");
				wantPlay = false;
				isHungry = true;
				movepoint -= 1;
			}else {
				System.out.println(run+"는 힘들어요..");
			}
		}else {
			System.out.println("system:"+name+"의 체력이 부족합니다. 밥을 먹이세요.");
		}
	}//play() method end
	
	//알쥐 부르기
	public String call() {
		System.out.println("나: "+name+"야~");
		if(isHungry) {
			System.out.println("(무시)");
			return "...";
		}else {
			System.out.println(sound+"!");
			return "왜?";
		}
	}//call() method end
	//알쥐 체력 보기
	public void movePointCheck() {
		System.out.println("system:"+name+"의 남은 체력은 "+movepoint+" 입니다." );
	}//movePointCheck() method end
	
	//체력만큼 짖기
	public void bark() {
		System.out.println("나: "+name+", 짖어 !!");
//		for(int i=1;i<=movepoint;i++) {
//			System.out.println(name+": "+sound+"!");
//		}
		int j = 0;
		while(j<movepoint) {
			System.out.println(name+": "+sound+"!");
			j++;
		}
		movepoint -= j;
		
		System.out.println(name+ ": 헥헥..");
		wantPlay = false;
	}//bark() method end
	
}//Animal class end
