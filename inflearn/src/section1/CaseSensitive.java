package section1;

import java.util.Scanner;

public class CaseSensitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		String str = in.next();
		
		char[] str2 = str.toCharArray();
		
		String result = "";
		for (int i =0; i < str.length();i++) {
			if (Character.isUpperCase(str2[i])) {
				 result = result + Character.toLowerCase(str2[i]);
			} else {
				result = result + Character.toUpperCase(str2[i]);
			}
		}
		System.out.println(result);
		
	}

}
