package fr.mds.tpabstractfactory.factory;

import fr.mds.tpabstractfactory.model.shape.Circle;
import fr.mds.tpabstractfactory.model.shape.Rectangle;
import fr.mds.tpabstractfactory.model.shape.Shape;
import fr.mds.tpabstractfactory.model.shape.Square;

public class ShapeFactory extends AbstractFactory{

	public static final String SHAPE = "SHAPE";
	
	public Shape getShape(String shape) {
		Shape result;
		switch (shape) {
		case Square.SQUARE:
			result = new Square();
			break;
		case Circle.CIRCLE:
			result = new Circle();
			break;
		case Rectangle.RECTANGLE:
			result = new Rectangle();
			break;
		default:
			result = null;
			break;
		}
		return result;
	}
	
}
