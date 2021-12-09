package scripts;

import java.util.Arrays;

public class Math {
	
	public static int sum(int...ints) {
		return Arrays.stream(ints).sum();
	}
	
	public static double sum(double...doubles) {
		return Arrays.stream(doubles).sum();
	}
	
	public static long sum(long...longs) {
		return Arrays.stream(longs).sum();
	}

}
