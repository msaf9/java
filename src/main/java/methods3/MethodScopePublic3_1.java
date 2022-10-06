package methods3;

public class MethodScopePublic3_1 {

	public static void main(String[] args) {
		System.out.println("To understand global scope:");
		MethodScopePublicPrivate3_2 methodScopePublicPrivate = new MethodScopePublicPrivate3_2();

		/*
		 * Scope of thisIsPublicMethod is global.
		 */
		methodScopePublicPrivate.thisIsPublicMethod();

		/*
		 * Scope of thisIsPrivateMethod is particular to the class.
		 * 
		 * methodScope.thisIsPrivateMethod();
		 */
	}

}
