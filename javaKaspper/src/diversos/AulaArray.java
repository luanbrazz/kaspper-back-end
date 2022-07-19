package diversos;

public class AulaArray {

	public static void main(String[] args) {
		
		int [] array = new int[5];
		
//		int [] outroArray;
//		outroArray = new int[10];
//		
//		String[] a = new String[100], b = new String[40];
		
		array[0] = 12;
		array[1] = 8;
		array[2] = 4;
		array[3] = 7;
		array[4] = 10;
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println();
		
//		int i = 0;
//		while (i <= 4) {
//			System.out.println(array[i]);
//			i ++;
//		}
		
		System.out.printf("%s%8s%n", "Indice", "Valor");
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%5d%8d%n", i, array[i]);
		}
	}

}
