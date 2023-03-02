package java11thisway;

public class ArrayReview_0302 {

	public static void main(String[] args) {
		//학생 이름을 1차원 배열 names에 저장하고,
				//학생 점수를 2차원 배열 scores에 저장하여 다음과 같이 출력하라.
				
				/*			<학생 점수표>
				 * 
				 * 			국어	영어	수학
				 * 홍길동	 80		 70		 80
				 * 이순신	 90		 90		 90
				 * 강감찬	 50		 60		 77
				 * 손영신	 100	 100	 100
				 * 강병수	 80		 80		 60
				 * -----------------------------
				 * 
				 * 학생별 총점을 계산하여 1차원 배열(studentTotal)에 다음과 같이 저장후 출력하시오.
				 * 
				 * <학생별 총점>
				 * 홍길동: 230점 = 0행(0열, 1열, 2열) => studentTotal[0]
				 * 이순신: 270점 = 1행(0열, 1열, 2열) => studentTotal[1]
				 * 강감찬: 187점 = 2행(0열, 1열, 2열) => studentTotal[2]
				 * 손영신: 300점 = 3행(0열, 1열, 2열) => studentTotal[3]
				 * 강병수: 220점 = 4행(0열, 1열, 2열) => studentTotal[4]
				 * 
				 * 총점만 출력 하면 된다.
				 */
				
		String[] names = {"      ","홍길동","이순신","강감찬","손영신","강병수"};
//		String[] subjects = {"국어","영어","수학"}; // 1차접근 ,, 나가리
		String[][] scores = {
				{"국어","영어","수학"},
				{"80", "70", "80"},
				{"90", "90", "90"},
				{"50", "60", "77"},
				{"100", "100", "100"},
				{"80", "80", "60"}
		};
		System.out.println("<학생 점수표>");
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]);
			for(int j=0;j<scores[i].length;j++) {
				System.out.print(scores[i][j]);
			}
			System.out.println();
		}//for end
		// 모양은 아니어도 값은 나왔다 ,,,, ㅠㅠ
		// 내일 강사님 코드 보고 손대보기
		
		System.out.println("-----------------------");
		//합 구하기
		
		int[] studentTotal = new int[5];
		
		for(int i=1;i<scores.length;i++) {
			int sum = 0;
			for(int j=0;j<scores[i].length;j++) {
				sum += Integer.parseInt(scores[i][j]);
			}
			studentTotal[i-1]=sum;
		}
		for(int i=0;i<studentTotal.length;i++) {
			System.out.println(names[i+1]+"의 점수의 합: "+studentTotal[i]);
		}
		
		

	}//main() method end

}
