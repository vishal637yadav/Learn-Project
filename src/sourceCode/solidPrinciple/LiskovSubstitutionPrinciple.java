package sourceCode.solidPrinciple;


class Rectangle
{
	protected int width,length;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Rectangle() {}
	
	public Rectangle(int width, int length) {
		super();
		this.width = width;
		this.length = length;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}
	
	public int getArea() {return width*length;}
	
	public boolean isSquare()
	{
		return width==length;
	}
}

class RectangleFactory
{
	public static Rectangle newRectangle(int width,int length)
	{
		return new Rectangle(width,length);
	}
	
	public static Rectangle newSquare(int side)
	{
		return new Rectangle(side,side);
	}
}

class Square extends Rectangle
{
	public Square() {}
	
	public Square(int size)
	{
		width = length = size ;
	}

	@Override
	public void setWidth(int width) {
		// TODO Auto-generated method stub
		super.setLength(width);
		super.setWidth(width);
	}

	@Override
	public void setLength(int length) {
		// TODO Auto-generated method stub
		super.setLength(length);
		super.setWidth(length);
	}
	
}

public class LiskovSubstitutionPrinciple {

	static void userIt(Rectangle r)
	{
		int width = r.getWidth();
		r.setLength(10);
		
		System.out.println("Expected area of "+(width *10)+", got "+r.getArea());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rc = new Rectangle(2,3);
		userIt(rc);
		
		Rectangle sq = new Square();
		sq.setWidth(5);
		userIt(sq);
		
	}

}
