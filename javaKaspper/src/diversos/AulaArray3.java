package diversos;

public class AulaArray3 {

	public static void main(String[] args) {

		final int ARRAY_LENGTH = 10;

		int[] array = new int[ARRAY_LENGTH];

		System.out.printf("%s%8s%n", "Indice", "Valor");

		for (int i = 0; i < array.length; i++) {
			array[i] = 2 + 2 * i;
			System.out.printf("%5d%8d%n", i, array[i]);

		}
	}
}