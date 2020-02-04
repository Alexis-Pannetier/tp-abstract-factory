package fr.mds.tpabstractfactory.factory;

import fr.mds.tpabstractfactory.color.Blue;
import fr.mds.tpabstractfactory.color.Color;
import fr.mds.tpabstractfactory.color.Green;
import fr.mds.tpabstractfactory.color.Red;

public class ColorFactory extends AbstractFactory {

	public static final String COLOR = "COLOR";
	
	public Color getColor(String color) {
		Color result;
		switch (color) {
		case Blue.BLUE:
			result = new Blue();
			break;
		case Green.GREEN:
			result = new Green();
			break;
		case Red.RED:
			result = new Red();
			break;
		default:
			result = null;
			break;
		}
		return result;
	}

}
