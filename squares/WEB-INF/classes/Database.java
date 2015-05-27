import java.util.HashMap;

public class Database {
	
	public static HashMap<Integer, Square> map = new HashMap<>();
	public static int currentSquare;

	public static void postSquare(int x, int y, int size, String color) throws Exception {
		map.put(currentSquare, new Square(currentSquare, x, y, size, color));
		currentSquare++;
	}

	public static void putSquare(int id, int x, int y, int size, String color) throws Exception {
		Square square = map.get(id);
		
		square.x     = x;
		square.y     = y;
		square.size  = size;
		square.color = color;

	}

	public static void deleteSquare(int id) {
		map.remove(id);
	}

	public static Square getSquare(int id) {
		return map.get(id);
	}

	public static Square[] getSquares() {
		return map.values().toArray(new Square[00]);
	}

}