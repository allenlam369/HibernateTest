package model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-07-06T10:29:37.064+0800")
@StaticMetamodel(WpcoSz.class)
public class WpcoSz_ {
	public static volatile SingularAttribute<WpcoSz, String> szId;
	public static volatile SingularAttribute<WpcoSz, String> chineseName;
	public static volatile SingularAttribute<WpcoSz, String> marineInland;
	public static volatile SingularAttribute<WpcoSz, String> szName;
	public static volatile SingularAttribute<WpcoSz, BigDecimal> validCode;
	public static volatile SingularAttribute<WpcoSz, Timestamp> validDate;
	public static volatile SingularAttribute<WpcoSz, String> validUser;
	public static volatile SingularAttribute<WpcoSz, BigDecimal> wcszCode;
	public static volatile SingularAttribute<WpcoSz, String> wpcoSubleg;
	public static volatile SingularAttribute<WpcoSz, WpcoWcz> wpcoWcz;
}
