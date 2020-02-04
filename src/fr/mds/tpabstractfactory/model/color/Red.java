package fr.mds.tpabstractfactory.model.color;

import fr.mds.tpabstractfactory.model.Item;

public class Red implements Color, Item {

	public static final String RED = "RED";

	@Override
	public void fill() {
		System.out.println("fill a Red");
	}

	@Override
	public String getName() {
		return this.RED;
	}

}
