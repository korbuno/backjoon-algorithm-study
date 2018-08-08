package 평균은_넘겠지_4344;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int count = Integer.parseInt(st.nextToken());
			int jumArr[] = new int[count];
			int sum = 0;

			for (int j = 0; j < jumArr.length; j++) {
				jumArr[j] = Integer.parseInt(st.nextToken());
				sum += jumArr[j];
			}

			float avg = sum / (float) count;
			int belowCount = 0;
			for (int j : jumArr) {
				if (j > avg)
					belowCount++;
			}

			float res = belowCount / (float) count;
			bw.write(String.format("%.3f%%", res * 100));
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();

	}
}
