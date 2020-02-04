package fr.mds.tpabstractfactory.model;

import java.util.ArrayList;
import java.util.List;

public class DrawItem {

	String name;
	List<CombinedItem> items = new ArrayList<CombinedItem>();;
	
	public void print() {
		for (CombinedItem combinedItem : items) {
			System.out.println(combinedItem);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CombinedItem> getItems() {
		return items;
	}

}
