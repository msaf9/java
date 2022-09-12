package methods3;

public class Shadowing {

	public static void main(String[] args) {
		OuterShadowing outerShadowing = new OuterShadowing();
		OuterShadowing.InnerShadowing innerShadowing = outerShadowing.new InnerShadowing();
		innerShadowing.printMethod();
	}

}
