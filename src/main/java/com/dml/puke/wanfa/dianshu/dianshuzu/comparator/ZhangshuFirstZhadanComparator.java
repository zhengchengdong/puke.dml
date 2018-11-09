package com.dml.puke.wanfa.dianshu.dianshuzu.comparator;

import com.dml.puke.wanfa.dianshu.dianshuzu.ZhadanDianShuZu;

/**
 * 炸弹大小，先比较张数再比较点数
 * 
 * @author Neo
 *
 */
public class ZhangshuFirstZhadanComparator implements ZhadanComparator {

	@Override
	public int compare(ZhadanDianShuZu zhadan1, ZhadanDianShuZu zhadan2) {
		if (zhadan1.getSize() < zhadan2.getSize()) {
			return -1;
		} else if (zhadan1.getSize() > zhadan2.getSize()) {
			return 1;
		} else {
			return zhadan1.getDianShu().compareTo(zhadan2.getDianShu());
		}
	}

}
