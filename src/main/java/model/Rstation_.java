package model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-07-06T10:29:37.061+0800")
@StaticMetamodel(Rstation.class)
public class Rstation_ {
	public static volatile SingularAttribute<Rstation, Long> siteId;
	public static volatile SingularAttribute<Rstation, String> active;
	public static volatile SingularAttribute<Rstation, BigDecimal> activeYear;
	public static volatile SingularAttribute<Rstation, BigDecimal> cmmview;
	public static volatile SingularAttribute<Rstation, BigDecimal> easting;
	public static volatile SingularAttribute<Rstation, BigDecimal> easting1;
	public static volatile SingularAttribute<Rstation, Timestamp> endDate;
	public static volatile SingularAttribute<Rstation, BigDecimal> latitude;
	public static volatile SingularAttribute<Rstation, BigDecimal> longitude;
	public static volatile SingularAttribute<Rstation, BigDecimal> northing;
	public static volatile SingularAttribute<Rstation, BigDecimal> northing1;
	public static volatile SingularAttribute<Rstation, String> rId;
	public static volatile SingularAttribute<Rstation, BigDecimal> riverid;
	public static volatile SingularAttribute<Rstation, String> show;
	public static volatile SingularAttribute<Rstation, Timestamp> startDate;
	public static volatile SingularAttribute<Rstation, BigDecimal> stationId;
	public static volatile SingularAttribute<Rstation, String> statname;
	public static volatile SingularAttribute<Rstation, String> szId;
	public static volatile SingularAttribute<Rstation, BigDecimal> validCode;
	public static volatile SingularAttribute<Rstation, Timestamp> validDate;
	public static volatile SingularAttribute<Rstation, String> validUser;
	public static volatile SingularAttribute<Rstation, BigDecimal> wcszCode;
	public static volatile SingularAttribute<Rstation, BigDecimal> wczCode;
}
