import fr.mds.tpabstractfactory.factory.AbstractFactory;
import fr.mds.tpabstractfactory.factory.ColorFactory;
import fr.mds.tpabstractfactory.factory.FactoryProducer;
import fr.mds.tpabstractfactory.factory.ShapeFactory;
import fr.mds.tpabstractfactory.model.Item;
import fr.mds.tpabstractfactory.model.color.Blue;
import fr.mds.tpabstractfactory.model.color.Color;
import fr.mds.tpabstractfactory.model.color.Green;
import fr.mds.tpabstractfactory.model.color.Red;
import fr.mds.tpabstractfactory.model.shape.Circle;
import fr.mds.tpabstractfactory.model.shape.Rectangle;
import fr.mds.tpabstractfactory.model.shape.Shape;
import fr.mds.tpabstractfactory.model.shape.Square;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {

		// EXERCICE 1
		// get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory(ShapeFactory.SHAPE);
		// get an object of Shape Circle
		Shape shape1 = shapeFactory.getShape(Circle.CIRCLE);
		 // call draw method of Shape Circle
		shape1.draw();
		// get an object of Shape Rectangle
		Shape shape2 = shapeFactory.getShape(Rectangle.RECTANGLE);
		// call draw method of Shape Rectangle
		shape2.draw();
		// get an object of Shape Square
		Shape shape3 = shapeFactory.getShape(Square.SQUARE);
		// call draw method of Shape Square
		shape3.draw();
		// get color factory
		AbstractFactory colorFactory = FactoryProducer.getFactory(ColorFactory.COLOR);
		// get an object of Color Red
		Color color1 = colorFactory.getColor(Red.RED);
		// call fill method of Red
		color1.fill();
		// get an object of Color Green
		Color color2 = colorFactory.getColor(Green.GREEN);
		// call fill method of Green
		color2.fill();
		// get an object of Color Blue
		Color color3 = colorFactory.getColor(Blue.BLUE);
		// call fill method of Color Blue
		color3.fill();
		// get an object of Shape Circle
		Shape myShape = FactoryProducer.getFactory(ShapeFactory.SHAPE).getShape(Circle.CIRCLE);
		// call draw method of Shape Circle
		myShape.draw();
		
		// EXERCICE 2
		//get directly an item with factory auto selecting
		Item item = FactoryProducer.getItem(Blue.BLUE);
		System.out.println("this is a " + item.getName());
		item = FactoryProducer.getItem(Green.GREEN);
		System.out.println("this is a " + item.getName());
		item = FactoryProducer.getItem(Red.RED);
		System.out.println("this is a " + item.getName());
		item = FactoryProducer.getItem(Square.SQUARE);
		System.out.println("this is a " + item.getName());
		item = FactoryProducer.getItem(Rectangle.RECTANGLE);
		System.out.println("this is a " + item.getName());
		item = FactoryProducer.getItem(Circle.CIRCLE);
		System.out.println("this is a " + item.getName());
		
	}

}
