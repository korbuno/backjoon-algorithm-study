package 시험_성적_9498;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		if (N >= 90) {
			bw.write("A");
		} else if (N >= 80) {
			bw.write("B");
		} else if (N >= 70) {
			bw.write("C");
		} else if (N >= 60) {
			bw.write("D");
		} else {
			bw.write("F");
		}

		bw.flush();
		bw.close();
		br.close();

	}
}
