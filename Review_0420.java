package forReview;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Review_0420 {

	public static void main(String[] args) {
		// 0420
		Stack<String> strSta = new Stack<String>();
		for(int i=1;i<=5;i++) {
			strSta.push(Integer.toString(i));
		}
		
		for(int i=0;i< strSta.size();i++) {
			System.out.println("strSta["+i+"]: "+strSta.get(i));
		}
		System.out.println("strSta에 가장 늦게 들어간 값: "+strSta.peek());
		
		for(int i=0;i<5;i++) {
			System.out.println("strSta의 값이 제거되는 순서: "+strSta.pop());
		}
//		System.out.println("strSta의 가장 위에있는 값"+strSta.peek()); // > 예외 발생.
		
		System.out.println("==========================================================");
		
		Queue<String> strQue = new LinkedList<String>();
		for(int i=1;i<=5;i++) {
			strQue.offer(Integer.toString(i));
		}
		
//		for(int i=0;i< strQue.size();i++) {
//			System.out.println("strQue["+i+"]: "+strQue.());
//		} // 값은 어떻게 불러오나
		System.out.println("strQue에 가장 늦게 들어간 값: "+strQue.peek());
		
		for(int i=0;i<5;i++) {
			System.out.println("strQue의 값이 제거되는 순서: "+strQue.poll());
		}
		System.out.println("strQue에 가장 늦게 들어간 값: "+strQue.peek()); // null 반환.

		System.out.println("==========================================================");
		
		
	}// main() method end

}// public class end


