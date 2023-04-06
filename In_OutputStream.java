package java11thisway;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class In_OutputStream  {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String str = br.readLine();
		System.out.println("입력받은 문자열: "+str);
		int i = Integer.parseInt(br.readLine());
		System.out.println("입력받은 정수: "+i);
		
		StringTokenizer st = new StringTokenizer(str);
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		System.out.println("공백 앞: "+a);
		System.out.println("공백 뒤: "+b);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("BufferedWriter를 활용하여 출력: "+str+"\n");
		
		// BufferedWriter은 버퍼를 잡아두기 때문에, flush()와 close()를 항상 해주어야 한다!
		bw.flush();
		bw.close();
		
		
		
		
		

	}// main() method end

}// public class end
