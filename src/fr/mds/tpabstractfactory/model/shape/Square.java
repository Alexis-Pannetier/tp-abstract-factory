package fr.mds.tpabstractfactory.model.shape;

import fr.mds.tpabstractfactory.model.Item;

public class Square implements Shape, Item {

	public static final String SQUARE = "SQUARE";

	@Override
	public void draw() {
		System.out.println("draw a Square");
	}

	@Override
	public String getName() {
		return this.SQUARE;
	}

}
