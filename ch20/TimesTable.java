package ch20;

public class TimesTable {

	public static void main(String[] args) {
		
		System.out.println("구구단" + "\n");
		
		for (int i = 1; i < 10; i++) {
			
			for (int j = 1; j < 10; j++) {
				
				System.out.println(i + " x " + j + " = " + i * j);
			
			}
			System.out.println();
		}
	}

}