package �Ѽ�_1065;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Integer> list = new LinkedList<>();

		// 1000�̸� �Ѽ� �̸� �غ�
		// 1 ~ 99�� ������ �Ѽ�
		for (int i = 1; i <= 99; i++) {
			list.add(i);
		}		
		for(int i = 111; i < 1000; i++) {
			if(hansooCheck(i)) {
				list.add(i);		
			}
		}
		int N = Integer.parseInt(br.readLine());
		
		while(!list.contains(N)) {
			N--;
		}
		int count = 0;
		for (Integer num : list) {
			count++;
			if(num == N) break;
		}
		
		
		bw.write(String.valueOf(count));
		bw.newLine();
		bw.flush();
		bw.close();
		br.close();

	}

	// �� �ڸ� �� ����, 1000�̸� �̶�� ����
	public static boolean hansooCheck(int num) {
		
		String N = String.valueOf(num);
		int numArr[] = new int[N.length()];
		// �� �ڸ��� ����
		for (int i = 0; i < N.length(); i++) {
			numArr[i] = (int) (N.charAt(i) - '0');
		}
		// ����
		if(numArr[2] - numArr[1] != numArr[1] - numArr[0])
			return false;
		return true;
	}
}
