package generator;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

import basic.Expression;
import basic.PrimitiveType;
import basic.ScoreDef;
import basic.Type;
import vector.VectorOfElements;

public class StringLiteralGenerator extends ExpressionGenerator {
	
	public Vector<Generator> getSubGenerators() {
		return new Vector<Generator>();
	}
	
	public Vector<Generator> getSubGeneratorsForEachType(Type t){
		return new Vector<Generator>();
	}
	
	@Override	
	public Set<Type> getAllReceiveTypes(){
		Set<Type> allReceiveTypeName = new HashSet<Type>();
		allReceiveTypeName.add(PrimitiveType.STRING);
		return allReceiveTypeName;
	}
	
	public Generator changeProperties(Type t) {
		return this;
	}
	@Override
	public void generateWithSubExps(Expression[] subExps,Vector<Expression> result) {
		result.addAll(VectorOfElements.stringLiteralVector);
	}
	
	public Vector<Expression> generateExpression(int depth, String keywords) {
		Vector<Expression> result = new Vector<Expression>();
		new ExpressionGenerator().generateExpression(depth, keywords);
		result.addAll(this.getTableOneInDepth(depth).get(PrimitiveType.STRING));
		return result;
	}

}
