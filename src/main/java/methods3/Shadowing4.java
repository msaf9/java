package methods3;

public class Shadowing4 {

	public static void main(String[] args) {
		OuterShadowing4_1 outerShadowing = new OuterShadowing4_1();
		OuterShadowing4_1.InnerShadowing innerShadowing = outerShadowing.new InnerShadowing();
		innerShadowing.printMethod();
	}

}
