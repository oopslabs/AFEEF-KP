package seriesExam203;

import java.util.Scanner;


interface Shape{
	void Area();
	void Perimeter();
	
}

class Triangle implements Shape{
	
	Scanner s=new Scanner(System.in);
	int b,h,a,c;

	
	public void Area() {
		
		System.out.println("Triangle");
		System.out.println("enter the base length: ");
		b=s.nextInt();
		
		System.out.println("enter height: ");
		h=s.nextInt();
		
		double area=(b*h)/2;
		System.out.println("area of triangle is:"+area);
	
	}

	
	public void Perimeter() {
		System.out.println("enter length of side 1: ");
		a=s.nextInt();
		System.out.println("enter length of side 2: ");
		c=s.nextInt();
		
		double pm=a+b+c;
		System.out.println("Perimeter of triangle is: "+pm);
		
	}

	
}

class Circle implements Shape {
	
	Scanner s=new Scanner(System.in);
	int r;
	public void Area() {
		System.out.println("Circle");
		System.out.println("enter radius:");
		r=s.nextInt();
	
		double area=3.14*r*r;
		System.out.println("area of the circle:"+area);
	}

	public void Perimeter() {
		
		double pm=2*3.14*r;
		System.out.println("perimeter of the circle is: "+pm);
	}
	
}

public class QstnOne {
	public static void main(String[] args) {
		
		Triangle T=new Triangle();
		
		
		T.Area();
		T.Perimeter();
		
		
		Circle C=new Circle();
		
		C.Area();
		C.Perimeter();
		
	
		
	}

}
