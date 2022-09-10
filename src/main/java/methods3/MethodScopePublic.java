package methods3;

public class MethodScopePublic {

	public static void main(String[] args) {
		System.out.println("To understand global scope:");
		MethodScopePublicPrivate methodScopePublicPrivate = new MethodScopePublicPrivate();

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
