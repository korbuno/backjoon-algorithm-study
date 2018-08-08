package ЦђБе_1546;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		float jumArr[] = new float[N];
		float sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < N; i++) {
			jumArr[i] = Float.parseFloat(st.nextToken());
		}

		Arrays.sort(jumArr);

		for (int i = 0; i < jumArr.length; i++) {
			jumArr[i] = jumArr[i] / jumArr[jumArr.length - 1] * 100;
			sum += jumArr[i];
		}

		bw.write(String.valueOf(sum / (float) N));
		bw.flush();
		bw.close();
		br.close();

	}
}
