package bakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 데이터 입력 공백단위로 받으려면 토큰 사용
		StringTokenizer st = new StringTokenizer(br.readLine());
		Sort sort = new Sort();
		
		//sort.problem_2750(br, bw, st);
		sort.problem_2751(br, bw, st);
	}

}
