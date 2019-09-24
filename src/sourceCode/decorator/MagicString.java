package sourceCode.decorator;


interface Shape {
    void draw();
    void resize();
    String description();
    boolean isHide();
}

class Circle implements Shape {
    @Override
    public void draw() {
    System.out.println("Drawing Circle");
    }
    @Override
    public void resize() {
    System.out.println("Resizing Circle");
    }
    @Override
    public String description() {
    return "Circle object";
    }
    @Override
    public boolean isHide() {
    return false;
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
    System.out.println("Drawing Rectangle");
    }
    @Override
    public void resize() {
    System.out.println("Resizing Rectangle");
    }
    @Override
    public String description() {
    return "Rectangle object";
    }
    @Override
    public boolean isHide() {
    return false;
    }
}

abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;
    public ShapeDecorator(Shape decoratedShape) {
          super();
          this.decoratedShape = decoratedShape;
    }
}

enum Color {
    RED,
    GREEN,
    BLUE,
    YELLOW,
    WHITE,
    BLACK,
    ORANGE,
    MAROON
}

enum LineStyle {
    SOLID,
    DASH,
    DOT,
    DOUBLE_DASH,
    DASH_SPACE
}

class FillColorDecorator extends ShapeDecorator {
    protected Color color;
    public FillColorDecorator(Shape decoratedShape, Color color) {
          super(decoratedShape);
          this.color = color;
    }
    @Override
    public void draw() {
          decoratedShape.draw();
          System.out.println("Fill Color: " + color);
    }
    // no change in the functionality
    // we can add in the functionality if we like. there is no restriction
    // except we need to maintain the structure of the Shape APIs
    @Override
    public void resize() {
    decoratedShape.resize();
    }
    @Override
    public String description() {
    return decoratedShape.description() + " filled with " + color + " color.";
    }
    // no change in the functionality
    @Override
    public boolean isHide() {
    return decoratedShape.isHide();
    }
}

class LineColorDecorator extends ShapeDecorator {
    protected Color color;
    public LineColorDecorator(Shape decoratedShape, Color color) {
    super(decoratedShape);
    this.color = color;
    }
    @Override
    public void draw() {
    decoratedShape.draw();
    System.out.println("Line Color: " + color);
    }
    // no change in the functionality
    @Override
    public void resize() {
    decoratedShape.resize();
    }
    @Override
    public String description() {
    return decoratedShape.description() + " drawn with " + color + " color.";
    }
    // no change in the functionality
    @Override
    public boolean isHide() {
    return decoratedShape.isHide();
    }
}

class LineThinknessDecorator extends ShapeDecorator {
    protected double thickness;
    public LineThinknessDecorator(Shape decoratedShape, double thickness) {
              super(decoratedShape);
              this.thickness = thickness;
    }
    @Override
    public void draw() {
              decoratedShape.draw();
              System.out.println("Line thickness: " + thickness);
    }
    // no change in the functionality
    @Override
    public void resize() {
    decoratedShape.resize();
    }
    @Override
    public String description() {
    return decoratedShape.description() + " drawn with line thickness " + thickness + ".";
    }
    // no change in the functionality
    @Override
    public boolean isHide() {
    return decoratedShape.isHide();
    }
}

class LineStyleDecorator extends ShapeDecorator {
    protected LineStyle style;
    public LineStyleDecorator(Shape decoratedShape, LineStyle style) {
    super(decoratedShape);
    this.style = style;
    }
    @Override
    public void draw() {
    decoratedShape.draw();
    System.out.println("Line Style: " + style);
    }
    // no change in the functionality
    @Override
    public void resize() {
    decoratedShape.resize();
    }
    @Override
    public String description() {
    return decoratedShape.description() + " drawn with " + style + " lines.";
    }
    // no change in the functionality
    @Override
    public boolean isHide() {
    return decoratedShape.isHide();
    }
}


public class MagicString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("This is Main()!!");
		 System.out.println("Creating Simple Shape Objects...");
         Shape rectangle = new Rectangle();
         Shape circle = new Circle();
         System.out.println("Drawing Simple Shape Objects...");
         rectangle.draw();
         System.out.println();
         circle.draw();
         System.out.println();
         System.out.println("Creating Decorated Circle with Red Color, Blue Lines in dash pattern and thickness of 2 ...");
         Shape circle1 = new FillColorDecorator(new LineColorDecorator(new LineStyleDecorator(
         new LineThinknessDecorator(new Circle(), 2.0d), LineStyle.DASH), Color.BLUE), Color.RED);
         circle1.draw();
         System.out.println();
         // order of decorator is also not much important here since all are unique functionalities.
         // we can also do this nesting of functionalities in separate statements.
         System.out.println("creating object with similar functionalities in separate statements.");
         Circle c = new Circle();
         LineThinknessDecorator lt = new LineThinknessDecorator(c, 2.0d);
         LineStyleDecorator ls = new LineStyleDecorator(lt, LineStyle.DASH);
         LineColorDecorator lc = new LineColorDecorator(ls, Color.BLUE);
         FillColorDecorator fc = new FillColorDecorator(lc, Color.RED);
         Shape circle3 = fc;
         circle3.draw();
         System.out.println();
         System.out.println("Creating Decorated Circle with Green Color, Black Lines ...");
         Shape circle2 = new FillColorDecorator(new LineColorDecorator(new Circle(), Color.BLACK), Color.GREEN);
         circle2.draw();
         System.out.println();
         System.out.println("Creating Decorated Rectange with Yellow Color, Red Lines in double dash pattern...");
         Shape rectangle1 = new FillColorDecorator(new LineColorDecorator(new Rectangle(), Color.RED), Color.YELLOW);
         rectangle1.draw();
         System.out.println();
         
	}
		
}
