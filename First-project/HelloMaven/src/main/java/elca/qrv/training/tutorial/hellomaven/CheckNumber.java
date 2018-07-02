package elca.qrv.training.tutorial.hellomaven;

import org.apache.commons.lang3.StringUtils;

public class CheckNumber {

	public static void main(String[] args) {
		String text1 = "0123a4";
		String text2 = "01234";
		
		boolean result1 = StringUtils.isNumeric(text1);
	}
}
