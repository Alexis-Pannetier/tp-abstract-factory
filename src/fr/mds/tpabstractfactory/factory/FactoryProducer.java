package fr.mds.tpabstractfactory.factory;

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
}
