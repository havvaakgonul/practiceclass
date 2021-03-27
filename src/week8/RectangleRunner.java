package week8;

public class RectangleRunner {

	public static void main(String[] args) {
		
		Rectangle rectangle=new Rectangle(5,10);
		System.out.println("Rectangle width: "+ rectangle.getWidth());
		System.out.println("Rectangle length "+rectangle.getLength());
		System.out.println("Rectangle area: "+ rectangle.getArea());
	
		Cuboid cuboid=new Cuboid(5,10,5);
		System.out.println("Cuboid widht: "+cuboid.getWidth());
		System.out.println("Cuboid length "+ cuboid.getLength());
		System.out.println("Cuboid height "+ cuboid.getHeight());
		System.out.println("Cuboid volume "+ cuboid.getVolume());
	}

}
