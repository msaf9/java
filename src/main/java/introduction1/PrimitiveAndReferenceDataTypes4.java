package introduction1;

import java.util.Arrays;

public class PrimitiveAndReferenceDataTypes4 {

	public static void main(String[] args) {
		
		ReferenceTypeClass4_1 referenceTypeClass = new ReferenceTypeClass4_1();

		int intArray[] = { 1, 2, 3 };
		int classReferenceDataType = referenceTypeClass.classVariable;

		System.out.println("Array:" + Arrays.toString(intArray));
		System.out.println("Class Reference Data Type:" + classReferenceDataType);
	}

}
