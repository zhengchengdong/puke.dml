package com.dml.puke.wanfa.dianshu.dianshuzu;

import com.dml.puke.pai.DianShu;

/**
 * 炸弹。四个及以上点数一样的。
 * 
 * @author Neo
 *
 */
public class ZhadanDianShuZu extends DanGeDianShuZu {
	private int size;

	public ZhadanDianShuZu() {
	}

	public ZhadanDianShuZu(DianShu dianShu, int size) {
		super(dianShu);
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
