package org.java.create.abstract_factory;

public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shape) {
		
		if ( shape == null ) {
			return null;
		}
		
		if ( shape.equalsIgnoreCase("CIRCLE") ) {
			return new Circle();
		} else if ( shape.equalsIgnoreCase("RECTANGLE") ) {
			return new Rectangle();
		} else if ( shape.equalsIgnoreCase("SQUARE") ) {
			return new Square();
		}
		
		return null;
	}

	@Override
	Color getColor(String color) {
		return null;
	}

}
