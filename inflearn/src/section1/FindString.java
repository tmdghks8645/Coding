package section1;

import java.util.Scanner;

public class FindString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		String str = in.next();
		char c = in.next().charAt(0);
		int result = 0;
		for (int i = 0; i < str.length(); i++) {

			char[] str2 = str.toUpperCase().toCharArray();
			
			if (Character.toUpperCase(c) == str2[i]) {
				result++;
			}

		}

		System.out.println(result);
		return;
	}

}
