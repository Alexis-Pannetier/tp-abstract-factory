package fr.mds.tpabstractfactory.model.shape;

import fr.mds.tpabstractfactory.model.Item;

public class Rectangle implements Shape, Item{

	public static final String RECTANGLE = "RECTANGLE";

	@Override
	public void draw() {
		System.out.println("draw a Rectangle");	
	}

	@Override
	public String getName() {
		return this.RECTANGLE;
	}

}
