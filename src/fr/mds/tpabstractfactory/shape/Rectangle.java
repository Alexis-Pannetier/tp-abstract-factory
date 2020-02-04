package fr.mds.tpabstractfactory.shape;

public class Rectangle implements Shape{

	public static final String RECTANGLE = "RECTANGLE";

	@Override
	public void draw() {
		System.out.println("Rectangle");	
	}

}
