package 열_개씩_끊어_출력하기_11721;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer(br.readLine());
		int deleteLine = 10;
		while (true) {
			if (sb.length() < deleteLine) {
				bw.write(sb.toString());
				break;
			}
			bw.write(sb.substring(0, deleteLine));
			bw.newLine();
			sb.delete(0, deleteLine);
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
