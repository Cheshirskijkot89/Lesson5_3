package chizhenko;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] array1 = new int[15];
		
		for(int i=0;i<array1.length;i++) {
			array1[i] = (int) (Math.random() * 10);
		}
		
		int[] array2 = Arrays.copyOf(array1, 30);
		
		for (int i = 0;i<array1.length;i++) {
			array2[i+15] = array1[i]*2;
		}
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		
	}

}
