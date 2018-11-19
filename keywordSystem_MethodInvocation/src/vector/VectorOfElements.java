package vector;
import java.util.Vector;

import basic.StringLiteral;
import basic.Type;
import basic.TypeName;

public class VectorOfElements {
	public static Vector<StringLiteral> stringLiteralVector = new Vector<StringLiteral>();
	public static Vector<Type> allTypes = new Vector<Type>();
	public static void initByParsing() {
		initStringLiteralVector();
		initType();
	}
	private static void initType() {
		// TODO Auto-generated method stub
		allTypes.add(new TypeName("String"));
		allTypes.add(new TypeName("boolean"));
	}
	// solve the visibility later
	private static void initStringLiteralVector() {
		stringLiteralVector.add(new StringLiteral("a"));
		stringLiteralVector.add(new StringLiteral("b"));
//		stringLiteralVector.add(new StringLiteral("c"));
	}
	
}
