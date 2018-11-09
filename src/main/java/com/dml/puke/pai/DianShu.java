package com.dml.puke.pai;

public enum DianShu {
	san(2), si(3), wu(5), liu(7), qi(11), ba(13), jiu(17), shi(19), J(23), Q(29), K(31), A(37), er(41), xiaowang(
			43), dawang(47);

	/**
	 * 索引，用于查询。索引值为素数，目的是为了组合查询的时候可以运用 “算数基本定理” 生成唯一组合索引。
	 */
	private final int idx;

	DianShu(int idx) {
		this.idx = idx;
	}

	public int idx() {
		return idx;
	}

}
