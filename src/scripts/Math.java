package scripts;

import java.util.Arrays;

public class Math {
	
	public static int sum(int...ints) {
		return Arrays.stream(ints).sum();
	}

}