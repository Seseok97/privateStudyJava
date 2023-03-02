package java11thisway;

public class arrayReview_0301 {

	public static void main(String[] args) {
		// 배열(array) >> 같은 타입의 데이터 여러개를 하나의 묶음(변수)로 다루는 메모리 공간.
		
		//기존의 방식으로 다수의 변수를 다루는 경우.
		int sc1 = 90;
		int sc2 = 80;
		int sc3 = 70;
		
		int scTotal = sc1 + sc2 + sc3;
		System.out.println(sc1);
		System.out.println(sc2);
		System.out.println(sc3);
		System.out.println(scTotal);
		
		System.out.println("-----------------------");
		
		//배열로 표현해보자.
		int[] scArray = {90, 80, 70};
		// 해당 코드는 아래 코드와 같은 내용이다.
//		int[] scArray;
//		scArray = new int[3];
		// or
//		int[] scArray = new int[3];
		//데이터 초기화(저장)
//		scArray[0] = 90;
//		scArray[1] = 80;
//		scArray[2] = 70;
		
		// +
//		int[] scArray = new int[] {90,80,70};
		
		
		int scTotal2 = 0;
		for(int i = 0;i<scArray.length;i++) {							// 배열의 모든 데이터에 접근하는 기본 공식
			System.out.println(i+"번째 인덱스의 데이터: "+scArray[i]);
			scTotal2 += scArray[i];
		}
		System.out.println("총합: "+scTotal2);
		// 예시는 데이터 수가 적어 당장에 큰 차이가 나지는 않으나, 대량의 데이터를 다루는 경우 꼭 필요하다 !!
		
		//문자열 Array
		String[] strArr = {"a","b","c"};
		for(int i = 0;i<strArr.length;i++) {
			System.out.println((i+1)+"번째 문자열:"+ strArr[i]);
		}
		
		System.out.println("----------------------------");
		
		//Array문 예제 만들어보기.
		// 합계 / 평균 / 최소 / 최대 구하기
		int[] arr1 = {1,7,2,10,8,6,3,5,9,4};
		
		double avg = 0;
		int sum = 0;
		int min = arr1[0];
		int max = arr1[0];
		
		
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(i+"번 인덱스 데이터: "+arr1[i]);
			sum += arr1[i];
			if(min>arr1[i]) {
				min = arr1[i];
			}
			if(max<arr1[i]) {
				max = arr1[i];
			}
		}
		avg = (double)sum/arr1.length;
		
		System.out.println("합계: "+ sum);
		System.out.println("평균: "+ avg);
		System.out.println("최소값: "+ min);
		System.out.println("최대값: "+ max);
		

	}

}
