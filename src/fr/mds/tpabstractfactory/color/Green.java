package fr.mds.tpabstractfactory.color;

public class Green implements Color {

	public static final String GREEN = "GREEN";
	
	@Override
	public void fill() {
		System.out.println("Green");
	}

}
