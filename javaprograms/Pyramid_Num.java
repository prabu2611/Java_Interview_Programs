package prabu.javaprograms;

public class Pyramid_Num {

	public static void main(String[] args) {

		int n = 19;

		for (int i = 1; i <= n; i++) {

			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			for (int j = i - 1; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
	
	

}
