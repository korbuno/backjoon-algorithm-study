package 더하기_사이클_1110;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		String temp = String.valueOf(N);
		String res = "";
		int count = 0;

		while (!res.equals(String.valueOf(N))) {
			if (Integer.parseInt(temp) < 10) {
				temp = "0" + temp;
			}
			int frontNum = Integer.parseInt(temp) / 10;
			int secNum = Integer.parseInt(temp) % 10;
			int sum = frontNum + secNum;
			temp = String.valueOf(secNum) + String.valueOf(sum % 10);
			res = String.valueOf(Integer.parseInt(temp));
			count++;
		}
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
		br.close();
	}
}
