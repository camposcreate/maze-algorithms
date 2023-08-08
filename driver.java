
public class driver extends algorithms{

	public static void main(String[] args) {
		
		// 5 x 5 grid
		char[][] bfsGraph = {{'X', 'X', 'X', 'X', 'X'},
							{'X', 'O', 'X', 'X', 'X'},
							{'X', 'S', 'O', 'O', 'X'},
							{'X', 'X', 'X', 'O', 'X'},
							{'X', 'X', 'X', 'E', 'X'}};
		
		// Starting coordinates
		int startRow = 0;
		int startCol = 0;
		char value = 'O';
		
		// retrieve starting position 'S'
		for (int i = 0; i < bfsGraph.length; i++) {
			for (int j = 0; j < bfsGraph[i].length; j++) {
				if (bfsGraph[i][j] == 'S') {
					startRow = i;
					startCol = j;
					break;
				}
			}
		} // end for
		
		floodFill(bfsGraph, startRow, startCol, value);

	}

} // end class
