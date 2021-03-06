package basic;

import java.math.BigDecimal;
import java.util.List;

public abstract class Name extends Expression {

	public abstract String toString();

	public abstract BigDecimal getScore(List<String> keywords);
	
	public abstract Type getType();

}
