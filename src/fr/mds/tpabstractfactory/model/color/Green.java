package fr.mds.tpabstractfactory.model.color;

import fr.mds.tpabstractfactory.model.Item;

public class Green implements Color, Item {

	public static final String GREEN = "GREEN";
	
	@Override
	public void fill() {
		System.out.println("fill a Green");
	}

	@Override
	public String getName() {
		return this.GREEN;
	}

}
