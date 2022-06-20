package Strings;

public class LexicographicRankOfAString {
	static int count = 0;
	public static void main(String[] args) {
		String str = "ABC";
		String key = "CBA";
		permute(str, 0, key);
	}
	
	static void permute(String str, int i, String key) {
		if(i == str.length()) {
			count++;
			if(str.equals(key)){
				System.out.println(count);
			}
			return;
		}
		
		for(int j = i; j < str.length(); j++) {
			str = swap(str, i, j);
			permute(str, i + 1, key);
			str = swap(str, i, j);
		}
	}
	static String swap(String str, int i, int j) {
		StringBuilder sb = new StringBuilder(str);
		sb.setCharAt(i, str.charAt(j));
		sb.setCharAt(j,  str.charAt(i));
		return sb.toString();
	}
}
