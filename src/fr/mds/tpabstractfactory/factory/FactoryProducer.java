package fr.mds.tpabstractfactory.factory;

import fr.mds.tpabstractfactory.model.Item;
import fr.mds.tpabstractfactory.model.color.Blue;
import fr.mds.tpabstractfactory.model.color.Green;
import fr.mds.tpabstractfactory.model.color.Red;
import fr.mds.tpabstractfactory.model.shape.Circle;
import fr.mds.tpabstractfactory.model.shape.Rectangle;
import fr.mds.tpabstractfactory.model.shape.Square;

public class FactoryProducer {

	public static AbstractFactory getFactory(String type) {
		AbstractFactory result;
		switch (type) {
		case ShapeFactory.SHAPE:
			result = new ShapeFactory();
			break;
		case ColorFactory.COLOR:
			result = new ColorFactory();
			break;
		default:
			result = null;
			break;
		}
		return result;
	}

	public static Item getItem(String type) {
		Item result;

		switch (type) {
		case Blue.BLUE:
		case Green.GREEN:
		case Red.RED:
			result = (Item) new ColorFactory().getColor(type);
			break;
		case Square.SQUARE:
		case Circle.CIRCLE:
		case Rectangle.RECTANGLE:
			result = (Item) new ShapeFactory().getShape(type);
			break;
		default:
			result = null;
			break;
		}
		return result;
	}
}
