package model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-07-06T10:29:37.063+0800")
@StaticMetamodel(TenZone.class)
public class TenZone_ {
	public static volatile SingularAttribute<TenZone, String> zoneId;
	public static volatile SingularAttribute<TenZone, String> chineseName;
	public static volatile SingularAttribute<TenZone, BigDecimal> validCode;
	public static volatile SingularAttribute<TenZone, Timestamp> validDate;
	public static volatile SingularAttribute<TenZone, String> validUser;
	public static volatile SingularAttribute<TenZone, String> zoneName;
	public static volatile SingularAttribute<TenZone, BigDecimal> zoneOrder;
}
