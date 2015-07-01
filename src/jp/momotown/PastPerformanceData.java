package jp.momotown;

import java.util.Calendar;

public class PastPerformanceData {

	public RaceCourseEnum course;	// 競馬場
	public Calendar date;			// 日付
	public GoingEnum going;			// 馬場状態
	public String raceName;			// レース名
	public int runnners;			// 頭数
	public int distance;			// 距離
	public SurfaceEnum surface;		// 種別

	public PastPerformanceData() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

}
