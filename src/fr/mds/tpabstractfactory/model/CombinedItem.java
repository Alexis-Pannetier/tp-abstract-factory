package fr.mds.tpabstractfactory.model;

import fr.mds.tpabstractfactory.model.color.Color;
import fr.mds.tpabstractfactory.model.shape.Shape;

public class CombinedItem {

	Shape shape;
	Color color;

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String toString() {
		return "Shape : " + this.shape.getName() + ", Color : " + this.color.getName();

	}

}
