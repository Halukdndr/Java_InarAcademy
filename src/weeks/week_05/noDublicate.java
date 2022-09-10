package weeks.week_05;

public class noDublicate {

	public static void main(String[] args) {
		String str = "adergbghsaewegehfdzsıytresd  rterterı?? sdf1457875";
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (result.contains("" + ch) == false) {
				result += ch;

			}
		}
		System.out.println(result);

	}

}
