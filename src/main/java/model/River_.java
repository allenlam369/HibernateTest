package model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-07-06T10:29:37.053+0800")
@StaticMetamodel(River.class)
public class River_ {
	public static volatile SingularAttribute<River, String> rId;
	public static volatile SingularAttribute<River, String> chineseName;
	public static volatile SingularAttribute<River, BigDecimal> riverId;
	public static volatile SingularAttribute<River, String> riverName;
	public static volatile SingularAttribute<River, BigDecimal> validCode;
	public static volatile SingularAttribute<River, Timestamp> validDate;
	public static volatile SingularAttribute<River, String> validUser;
	public static volatile SingularAttribute<River, String> zoneId;
}
