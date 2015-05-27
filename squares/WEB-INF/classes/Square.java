public class Square {

	public int id;
	public int x;
	public int y;
	public int size;
	public String color;

	public Square (int id, int x, int y, int size, String color) throws Exception {

		this.x     = x;
		this.y     = y;
		this.size  = size;
		this.color = color;
		
		throw new Exception("Bad square");
	}
}