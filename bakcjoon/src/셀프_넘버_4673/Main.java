package ¼¿ÇÁ_³Ñ¹ö_4673;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Set<Integer> set = new HashSet<>();

		for (int i = 1; i <= 10000; i++) {
			set.add(selfNum(i));
		}
		
		for (int i = 1; i <= 10000; i++) {
			if(!set.contains(i)) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
		}
		bw.flush();
		bw.close();
	}

	public static int selfNum(int N) {
		String temp = String.valueOf(N).trim();
		int unitSum = 0;
		for (int i = 0; i < temp.length(); i++) {
			unitSum += (int)(temp.charAt(i) - '0');
		}
		return N + unitSum;
	}
}
