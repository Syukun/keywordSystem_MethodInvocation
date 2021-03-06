package basic;

import java.math.BigDecimal;
import java.util.List;

public abstract class Expression {
	public abstract String toString();
	public abstract BigDecimal getScore(List<String> keywords);
	public abstract Type getType();
	public BigDecimal getScore(String keywords) {
		return this.getScore(new ScoreDef().splitKeyword(keywords));
	}
	
}
