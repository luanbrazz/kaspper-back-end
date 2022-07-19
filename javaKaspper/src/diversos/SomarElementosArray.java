package diversos;

public class SomarElementosArray {

	public static void main(String[] args) {

		int[] array = { 3, 50, 4, 7, 8, 2, 10 };
		int total = 0;
		
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		
		
		System.out.println("A soma dos elementos foi: " + total);
	}

}
