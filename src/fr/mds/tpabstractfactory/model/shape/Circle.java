package fr.mds.tpabstractfactory.model.shape;

import fr.mds.tpabstractfactory.model.Item;

public class Circle implements Shape, Item{

	public static final String CIRCLE = "CIRCLE";

	@Override
	public void draw() {
		System.out.println("draw a Circle");
	}

	@Override
	public String getName() {
		return this.CIRCLE;
	}

}
