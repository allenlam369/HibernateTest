package model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-07-06T10:29:37.062+0800")
@StaticMetamodel(RwWqiAvg.class)
public class RwWqiAvg_ {
	public static volatile SingularAttribute<RwWqiAvg, RwWqiAvgPK> id;
	public static volatile SingularAttribute<RwWqiAvg, BigDecimal> bod5PtAvg;
	public static volatile SingularAttribute<RwWqiAvg, BigDecimal> dosPtAvg;
	public static volatile SingularAttribute<RwWqiAvg, BigDecimal> nh4PtAvg;
	public static volatile SingularAttribute<RwWqiAvg, Integer> total;
	public static volatile SingularAttribute<RwWqiAvg, String> wqiGradeAvg;
	public static volatile SingularAttribute<RwWqiAvg, BigDecimal> wqiPtAvg;
	public static volatile SingularAttribute<RwWqiAvg, Rstation> rstation;
}
