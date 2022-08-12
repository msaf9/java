package introduction1;

import java.util.Arrays;

public class PrimitiveAndReferenceDataTypes4 extends Enum4_3 implements ReferenceTypeInterface4_2 {

	public static void main(String[] args) {

		ReferenceTypeClass4_1 referenceTypeClass = new ReferenceTypeClass4_1();

		int intArray[] = { 1, 2, 3 };
		int classReferenceDataType = referenceTypeClass.classVariable;
		String stringForExample = "This is an example string variable value";

		System.out.println("Array:" + Arrays.toString(intArray));
		System.out.println("Class Reference Data Type:" + classReferenceDataType);
		System.out.println("Interface:" + booleanValueTrue);
		System.out.println("stringForExample:" + stringForExample);
		System.out.println("::ENUM::");
		for (Cities city : Cities.values()) {
			System.out.println(Cities.valueOf(city.toString()).ordinal() + 1 + ". " + city);
		}

		AnnotationClass annotationClass = new AnnotationClass("Name is passed!");
		if (annotationClass.getClass().isAnnotationPresent(Annotation4_4.class)) {
			System.out.println("This is Annotation based.");
		} else {
			System.out.println("This is not Annotation based.");
		}
	}

}
