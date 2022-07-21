package model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-07-06T10:29:37.044+0800")
@StaticMetamodel(BmBeachEcAgmRankReport.class)
public class BmBeachEcAgmRankReport_ {
	public static volatile SingularAttribute<BmBeachEcAgmRankReport, BmBeachEcAgmRankReportPK> id;
	public static volatile SingularAttribute<BmBeachEcAgmRankReport, BigDecimal> annualGMean;
	public static volatile SingularAttribute<BmBeachEcAgmRankReport, BigDecimal> annualLogGMean;
	public static volatile SingularAttribute<BmBeachEcAgmRankReport, String> beachGroup;
	public static volatile SingularAttribute<BmBeachEcAgmRankReport, String> beachName;
	public static volatile SingularAttribute<BmBeachEcAgmRankReport, String> chineseName;
	public static volatile SingularAttribute<BmBeachEcAgmRankReport, String> districtName;
	public static volatile SingularAttribute<BmBeachEcAgmRankReport, String> districtNameC;
	public static volatile SingularAttribute<BmBeachEcAgmRankReport, String> districtOrder;
	public static volatile SingularAttribute<BmBeachEcAgmRankReport, String> hotlineDistrict;
	public static volatile SingularAttribute<BmBeachEcAgmRankReport, String> hotlineDistrictC;
	public static volatile SingularAttribute<BmBeachEcAgmRankReport, String> listOrder2;
	public static volatile SingularAttribute<BmBeachEcAgmRankReport, BigDecimal> rank;
	public static volatile SingularAttribute<BmBeachEcAgmRankReport, Integer> sampleCount;
	public static volatile SingularAttribute<BmBeachEcAgmRankReport, String> scName;
}
