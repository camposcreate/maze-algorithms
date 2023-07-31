import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class algorithms {
	
	// Breadth-First Search
	public static void floodFill(char[][] bfsGraph, int row, int col, char val) {
		
		// Define data structure
		Queue<int[]> q = new LinkedList<>();
		boolean[][] visited = new boolean[bfsGraph.length][bfsGraph[0].length];
		
		// Starting coordinates
		q.add(new int[] {row, col});
		visited[row][col] = true;
		
		// Found path?
		boolean path = false;
		
		while (!q.isEmpty()) {
			int[] curr = q.poll();
			int r = curr[0];
			int c = curr[1];
			
			// Edge cases -> path found
			if (r == 0 || r == bfsGraph.length - 1 || c == 0 || c == bfsGraph[0].length - 1) {
				System.out.println("Path found!");
				path = true;
				return;
			}
			
			// Get neighbors
			for (int[] neighbors : getNeighbors(bfsGraph, r, c)) {
				int nr = neighbors[0]; // neighbor row
				int nc = neighbors[1]; // neighbor column
				
				// checks if visited and neighbor == O (path available)
				// adds queue and visited arraylist
				if (!visited[nr][nc] && bfsGraph[nr][nc] == val) {
					q.add(neighbors);
					visited[nr][nc] = true;
				}
			} // end for
		} // end while()
		if (!path) {
			System.out.println("Path not found!");
			return;
		}
	} // end floodFill()
	
	public static ArrayList<int[]> getNeighbors(char[][] graph, int r, int c) {
		
		// Defines ArrayList to record neighbor positions
		ArrayList<int[]> neighbor = new ArrayList<>();
		// up, down, left, right
		int[][] indices = {{r-1, c}, {r+1, c}, {r, c-1}, {r, c+1}};
		for (int[] coordinate : indices) {
			int nr = coordinate[0];
			int nc = coordinate[1];
			if (nr >= 0 && nr < graph.length && nc >= 0 && nc < graph.length) {
				neighbor.add(new int[] {nr, nc});
			}
		}
		return neighbor;
		
	}
}
