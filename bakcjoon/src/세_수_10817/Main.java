package ¼¼_¼ö_10817;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String numArr[] = br.readLine().split(" ");

		int A = Integer.parseInt(numArr[0]);
		int B = Integer.parseInt(numArr[1]);
		int C = Integer.parseInt(numArr[2]);
		if ((A >= B && A <= C) || (A >= C && A <= B)) {
			bw.write(String.valueOf(A));
		} else if ((B >= A && B <= C) || (B >= C && B <= A)) {
			bw.write(String.valueOf(B));
		} else if ((C >= A && C <= B) || (C <= A && C >= B)) {
			bw.write(String.valueOf(C));
		} else {
			
		}

		bw.flush();
		bw.close();
		br.close();

	}
}
