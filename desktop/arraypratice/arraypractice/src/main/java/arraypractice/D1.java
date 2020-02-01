package arraypractice;

public class D1 {
	static int count = 0;

	public static void main(String[] args) {

		int[] number = { 2, 2, 2,2, 3, 4, 5, };
		int mea = number.length;
		for (int i = 0; i < mea; i++) {
			for (int j = i + 1; j < mea; j++) {
				if (number[i] == number[j]) {
					System.out.println("duplicate number " + number[j]);

					count = number[i] + 1;

				}
				//System.out.println("duplicate number " + number[i]);

				// System.out.println(number[i]);
			}
			//System.out.println("duplicate number " + number[i]);
			

		}
		

		System.out.println(count);

	}

}
