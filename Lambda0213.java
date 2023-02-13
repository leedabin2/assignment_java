package edu.lambda; 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Shape{
	private String type;
	private String color;
	private Double area;

	
	public Shape(String type,String color,Double area) {
		
		this.type = type;
		this.color = color;
		this.area = area;
	}
	public String getType()
	{
		return type;
	}
	
	public String getColor()
	{
		return color;
	}
	public Double getArea()
	{
		return area;
	}
	public String toString()
	{
		return String.format("Shape(%s %s %f)",type,color,area);
	}
	
	public static final List<Shape> shapes = Arrays.asList(new Shape("삼각형","빨간색",10.5),new Shape("사각형","파란색",11.2),
			new Shape("원","파란색",16.5),new Shape("원","빨간색",5.3),new Shape("원","노란색",8.1),new Shape("사각형","파란색",20.7),
			new Shape("삼각형","파란색",3.4),new Shape("사각형","빨간색",12.6) );
}
class ShapeTest extends Shape
{
	 public ShapeTest(String type, String color, Double area) {
		super(type, color, area);
		
	}
	static List<Shape> findShapeByType(List<Shape> shapes, String type) {
		return shapes;
			
		}
	 static List<Shape> findShapeByColorNArea(List<Shape> shapes, String color,double area) {
		return shapes;
			
		}
}
public class Lambda0213 {

	public static void main(String[] args) {

	}

}