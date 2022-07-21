package model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-07-06T10:29:37.065+0800")
@StaticMetamodel(WpcoWcz.class)
public class WpcoWcz_ {
	public static volatile SingularAttribute<WpcoWcz, String> wczId;
	public static volatile SingularAttribute<WpcoWcz, String> chineseName;
	public static volatile SingularAttribute<WpcoWcz, Timestamp> fad;
	public static volatile SingularAttribute<WpcoWcz, BigDecimal> validCode;
	public static volatile SingularAttribute<WpcoWcz, Timestamp> validDate;
	public static volatile SingularAttribute<WpcoWcz, String> validUser;
	public static volatile SingularAttribute<WpcoWcz, String> wczAbbr;
	public static volatile SingularAttribute<WpcoWcz, BigDecimal> wczCode;
	public static volatile SingularAttribute<WpcoWcz, String> wczLabel;
	public static volatile SingularAttribute<WpcoWcz, String> wczName;
	public static volatile SingularAttribute<WpcoWcz, String> zoneId;
	public static volatile ListAttribute<WpcoWcz, WpcoSz> wpcoSzs;
}
