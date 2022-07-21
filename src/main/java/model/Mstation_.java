package model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-07-06T10:29:37.052+0800")
@StaticMetamodel(Mstation.class)
public class Mstation_ {
	public static volatile SingularAttribute<Mstation, Long> siteId;
	public static volatile SingularAttribute<Mstation, String> active;
	public static volatile SingularAttribute<Mstation, BigDecimal> cmmview;
	public static volatile SingularAttribute<Mstation, BigDecimal> depth;
	public static volatile SingularAttribute<Mstation, BigDecimal> easting;
	public static volatile SingularAttribute<Mstation, BigDecimal> easting1;
	public static volatile SingularAttribute<Mstation, String> environment;
	public static volatile SingularAttribute<Mstation, String> hsName;
	public static volatile SingularAttribute<Mstation, BigDecimal> latitude;
	public static volatile SingularAttribute<Mstation, BigDecimal> longitude;
	public static volatile SingularAttribute<Mstation, String> msDxName;
	public static volatile SingularAttribute<Mstation, BigDecimal> msId;
	public static volatile SingularAttribute<Mstation, String> msName;
	public static volatile SingularAttribute<Mstation, String> msTsName;
	public static volatile SingularAttribute<Mstation, String> mtName;
	public static volatile SingularAttribute<Mstation, BigDecimal> mwId;
	public static volatile SingularAttribute<Mstation, String> mwName;
	public static volatile SingularAttribute<Mstation, String> mwTsName;
	public static volatile SingularAttribute<Mstation, BigDecimal> northing;
	public static volatile SingularAttribute<Mstation, BigDecimal> northing1;
	public static volatile SingularAttribute<Mstation, String> show;
	public static volatile SingularAttribute<Mstation, Timestamp> startDate;
	public static volatile SingularAttribute<Mstation, BigDecimal> stationId;
	public static volatile SingularAttribute<Mstation, String> szId;
	public static volatile SingularAttribute<Mstation, BigDecimal> validCode;
	public static volatile SingularAttribute<Mstation, Timestamp> validDate;
	public static volatile SingularAttribute<Mstation, String> validUser;
	public static volatile SingularAttribute<Mstation, BigDecimal> wczCode;
}
