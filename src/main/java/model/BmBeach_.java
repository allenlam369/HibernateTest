package model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-07-06T10:29:37.042+0800")
@StaticMetamodel(BmBeach.class)
public class BmBeach_ {
	public static volatile SingularAttribute<BmBeach, String> beachCode;
	public static volatile SingularAttribute<BmBeach, String> beachName;
	public static volatile SingularAttribute<BmBeach, String> chineseName;
	public static volatile SingularAttribute<BmBeach, String> districtCode;
	public static volatile SingularAttribute<BmBeach, BigDecimal> easting;
	public static volatile SingularAttribute<BmBeach, BigDecimal> latitude;
	public static volatile SingularAttribute<BmBeach, BigDecimal> longitude;
	public static volatile SingularAttribute<BmBeach, BigDecimal> northing;
	public static volatile SingularAttribute<BmBeach, String> rainStationCode;
	public static volatile SingularAttribute<BmBeach, String> remark;
	public static volatile SingularAttribute<BmBeach, String> scName;
	public static volatile SingularAttribute<BmBeach, BigDecimal> siteId;
	public static volatile SingularAttribute<BmBeach, String> szId;
	public static volatile SingularAttribute<BmBeach, String> tideStationCode;
	public static volatile SingularAttribute<BmBeach, BigDecimal> validCode;
	public static volatile SingularAttribute<BmBeach, Timestamp> validDate;
	public static volatile SingularAttribute<BmBeach, String> validUser;
	public static volatile SingularAttribute<BmBeach, BigDecimal> wczCode;
}
