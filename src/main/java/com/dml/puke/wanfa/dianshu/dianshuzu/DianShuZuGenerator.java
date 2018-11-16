package com.dml.puke.wanfa.dianshu.dianshuzu;

import java.util.ArrayList;
import java.util.List;

import com.dml.puke.pai.DianShu;

/**
 * 通过点数数量数组生成相关的所有可能点数组
 * 
 * @author Neo
 *
 */
public class DianShuZuGenerator {

	public static List<DanzhangDianShuZu> generateAllDanzhangDianShuZu(int[] dianShuAmountArray) {
		List<DanzhangDianShuZu> danzhangList = new ArrayList<>();
		for (int i = 0; i < dianShuAmountArray.length; i++) {
			int dianshuCount = dianShuAmountArray[i];
			if (dianshuCount >= 1) {
				DanzhangDianShuZu danzhangDianShuZu = new DanzhangDianShuZu(DianShu.getDianShuByOrdinal(i));
				danzhangList.add(danzhangDianShuZu);
			}
		}
		return danzhangList;
	}

	public static List<DuiziDianShuZu> generateAllDuiziDianShuZu(int[] dianShuAmountArray) {
		List<DuiziDianShuZu> duiziList = new ArrayList<>();
		for (int i = 0; i < dianShuAmountArray.length; i++) {
			int dianshuCount = dianShuAmountArray[i];
			if (dianshuCount >= 2) {
				DuiziDianShuZu duiziDianShuZu = new DuiziDianShuZu(DianShu.getDianShuByOrdinal(i));
				duiziList.add(duiziDianShuZu);
			}
		}
		return duiziList;
	}

	public static List<LianduiDianShuZu> generateAllLianduiDianShuZu(int[] dianShuAmountArray, int length) {
		List<LianduiDianShuZu> lianduiList = new ArrayList<>();
		for (int i = 0; i < dianShuAmountArray.length; i++) {
			int danzhangLianXuCount = 0;
			int j = i;
			while (j < 12 && dianShuAmountArray[j] >= 2) {// 3对或者以上的点数相连的牌，如556677；2和大、小王无法参与
				danzhangLianXuCount++;
				j++;
			}
			if (danzhangLianXuCount >= length) {
				DianShu[] lianXuDianShuArray = new DianShu[danzhangLianXuCount];
				for (int k = 0; k < danzhangLianXuCount; k++) {
					lianXuDianShuArray[k] = DianShu.getDianShuByOrdinal(i + k);
				}
				LianduiDianShuZu liandui = new LianduiDianShuZu(lianXuDianShuArray);
				lianduiList.add(liandui);
			}
		}
		return lianduiList;
	}

	public static List<LiansanzhangDianShuZu> generateAllLiansanzhangDianShuZu(int[] dianShuAmountArray, int length) {
		List<LiansanzhangDianShuZu> lianSanZhangList = new ArrayList<>();
		for (int i = 0; i < dianShuAmountArray.length; i++) {
			int danzhangLianXuCount = 0;
			int j = i;
			while (j < 12 && dianShuAmountArray[j] >= 3) {// 3个或者3个以上的点数相连的3张牌，如555666777；2和大、小王无法参与
				danzhangLianXuCount++;
				j++;
			}
			if (danzhangLianXuCount >= length) {
				DianShu[] lianXuDianShuArray = new DianShu[danzhangLianXuCount];
				for (int k = 0; k < danzhangLianXuCount; k++) {
					lianXuDianShuArray[k] = DianShu.getDianShuByOrdinal(i + k);
				}
				LiansanzhangDianShuZu lianSanZhang = new LiansanzhangDianShuZu(lianXuDianShuArray);
				lianSanZhangList.add(lianSanZhang);
			}
		}
		return lianSanZhangList;
	}

	public static List<SanzhangDianShuZu> generateAllSanzhangDianShuZu(int[] dianShuAmountArray) {
		List<SanzhangDianShuZu> sanzhangList = new ArrayList<>();
		for (int i = 0; i < dianShuAmountArray.length; i++) {
			int dianshuCount = dianShuAmountArray[i];
			if (dianshuCount >= 3) {
				SanzhangDianShuZu sanzhangDianShuZu = new SanzhangDianShuZu(DianShu.getDianShuByOrdinal(i));
				sanzhangList.add(sanzhangDianShuZu);
			}
		}
		return sanzhangList;
	}

	public static List<ShunziDianShuZu> generateAllShunziDianShuZu(int[] dianShuAmountArray, int length) {
		List<ShunziDianShuZu> shunziList = new ArrayList<>();
		for (int i = 0; i < dianShuAmountArray.length; i++) {
			int danzhangLianXuCount = 0;
			int j = i;
			while (j < 12 && dianShuAmountArray[j] >= 1) {// 任意5张或者5张以上点数相连的牌，3起最小，到A最大；无2和大、小王
				danzhangLianXuCount++;
				j++;
			}
			if (danzhangLianXuCount >= length) {
				DianShu[] lianXuDianShuArray = new DianShu[danzhangLianXuCount];
				for (int k = 0; k < danzhangLianXuCount; k++) {
					lianXuDianShuArray[k] = DianShu.getDianShuByOrdinal(i + k);
				}
				ShunziDianShuZu shunzi = new ShunziDianShuZu(lianXuDianShuArray);
				shunziList.add(shunzi);
			}
		}
		return shunziList;
	}

	public static List<ZhadanDianShuZu> generateAllZhadanDianShuZu(int[] dianShuAmountArray) {
		List<ZhadanDianShuZu> zhadanList = new ArrayList<>();
		for (int i = 0; i < dianShuAmountArray.length; i++) {
			int dianshuCount = dianShuAmountArray[i];
			if (dianshuCount >= 4) {
				for (int j = 4; j < dianshuCount; j++) {
					ZhadanDianShuZu zhadanDianShuZu = new ZhadanDianShuZu(DianShu.getDianShuByOrdinal(i), j);
					zhadanList.add(zhadanDianShuZu);
				}
			}
		}
		return zhadanList;
	}

}
