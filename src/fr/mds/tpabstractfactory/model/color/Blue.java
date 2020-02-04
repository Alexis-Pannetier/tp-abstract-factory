package fr.mds.tpabstractfactory.model.color;

import fr.mds.tpabstractfactory.model.Item;

public class Blue implements Color, Item {

	public static final String BLUE = "BLUE";
	
	@Override
	public void fill() {
		System.out.println("fill a Blue");
}

	@Override
	public String getName() {
		return this.BLUE;
	}

}
