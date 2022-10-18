package arrays4;

public class MultidimensionalArray7 {

	public static void main(String[] args) {
		int [][] multiDimensionalArray = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		for(int i = 0; i< multiDimensionalArray.length; i++) {
			for(int j = 0 ; j< multiDimensionalArray[i].length; j++) {
				System.out.print(multiDimensionalArray[i][j] + " ");
			}
			System.out.println();
		}
	}

}
