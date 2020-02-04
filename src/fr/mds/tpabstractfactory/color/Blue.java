package fr.mds.tpabstractfactory.color;

public class Blue implements Color {

	public static final String BLUE = "BLUE";
	
	@Override
	public void fill() {
		System.out.println("Blue");
}

}
