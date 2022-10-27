package test;

abstract class Shape {
	int length,breadth;
	abstract void printArea(int length, int breadth);

}
 
class Rectangle extends Shape{
	void printArea(int l, int b) {
		System.out.println("the area of rectangle is"+(l*b));
	}

}

class Triangle extends Shape{
	void printArea(int l, int b) {
		System.out.println("the area of triangle is"+((l*b)/2));
	}
}

class Circle extends Shape{
	void printArea(int r,int p) {
		System.out.println("the area of circle is"+3.14*(r*r));
	}
}
class ShapeDemo{
    public static void main(String args[]) {
     Rectangle r=new Rectangle();
     Triangle t=new Triangle();
     Circle c=new Circle();
     r.printArea(5,3);
     t.printArea(3,7);
     c.printArea(3,3);
    }
    
}