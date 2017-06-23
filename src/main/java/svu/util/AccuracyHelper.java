package svu.util;

public class AccuracyHelper {

	public static double accuracy(int[] y, int[] y_pred) {
		double sum = 0;
		double n = y.length;
		
		for (int i = 0; i < y.length; i++) {
			if (y_pred[i] == y[i])
				sum++;
		}
		
		return sum / n;
	}

	
}
