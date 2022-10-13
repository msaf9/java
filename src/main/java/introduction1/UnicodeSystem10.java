package introduction1;

import java.io.UnsupportedEncodingException;

public class UnicodeSystem10 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String string = "Unicode Character: \u00A6";
		byte[] charset = string.getBytes("UTF-8");
		String newString = new String(charset, "UTF-8");
		System.out.println(newString);
	}

}
