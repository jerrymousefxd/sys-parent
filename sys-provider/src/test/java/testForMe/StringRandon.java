package testForMe;

import org.apache.commons.lang.RandomStringUtils;

public class StringRandon {
	public static void main(String[] args) {
		while(true){
			String randomNumeric = RandomStringUtils.randomNumeric(4);
			if(randomNumeric.startsWith("0")){
				System.out.println(randomNumeric);
				break;
			}
			System.out.println(randomNumeric);
		}
	}
}
