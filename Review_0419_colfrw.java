package java11thisway;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Review_0419_colfrw {

	public static void main(String[] args) {
		/*
		 * 컬렉션 프레임워크를 활용하여 로또번호 생성하기.
		 * 
		 */
		Random r = new Random();
		Set<Integer> myNumber = new HashSet<Integer>();
		while(myNumber.size() < 6) {
			myNumber.add(r.nextInt(45)+1);
		}

		System.out.print("나의 로또 번호: ");
		for(int n:myNumber) {
			System.out.print(n+" ");
		}
		System.out.println("\n--------------------------------------");
		
		Set<Integer> lottoNumber = new HashSet<Integer>();

		while(lottoNumber.size() < 6) {
			lottoNumber.add(r.nextInt(45)+1);
		}
		System.out.print("이번주의 로또 번호: ");
		for(int n:lottoNumber) {
			System.out.print(n+" ");
		}
		System.out.println("\n--------------------------------------");
		int count = 0;
		for(int n:lottoNumber) {
			for(int m:myNumber) {
				if(n == m) {
					count++;
				}
			}
		}// for end
		System.out.println("맞춘 숫자의 개수: "+count);

	}// main() method end

}// public class end
