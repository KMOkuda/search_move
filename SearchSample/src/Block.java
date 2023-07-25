
public class Block {
	int color;
	double x;
	double y;
	
	public Block(){
		
	}
	
	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Block(int color, double x, double y) {
		this.color = color;
		this.x = x;
		this.y = y;
	}
}
