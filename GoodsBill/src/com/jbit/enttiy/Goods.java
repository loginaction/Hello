package com.jbit.enttiy;

import java.util.Date;

/**
 * Goods entity. @author MyEclipse Persistence Tools
 */

public class Goods implements java.io.Serializable {

	// Fields

	private Long id;
	private String goodsname;
	private Integer billstatus;
	private Integer goodsdistrict;
	private Double goodsprice;
	private Long goodscount;
	private Date creationtime;

	// Constructors

	/** default constructor */
	public Goods() {
	}

	/** full constructor */
	public Goods(String goodsname, Integer billstatus, Integer goodsdistrict,
			Double goodsprice, Long goodscount, Date creationtime) {
		this.goodsname = goodsname;
		this.billstatus = billstatus;
		this.goodsdistrict = goodsdistrict;
		this.goodsprice = goodsprice;
		this.goodscount = goodscount;
		this.creationtime = creationtime;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	public Integer getBillstatus() {
		return this.billstatus;
	}

	public void setBillstatus(Integer billstatus) {
		this.billstatus = billstatus;
	}

	public Integer getGoodsdistrict() {
		return this.goodsdistrict;
	}

	public void setGoodsdistrict(Integer goodsdistrict) {
		this.goodsdistrict = goodsdistrict;
	}

	public Double getGoodsprice() {
		return this.goodsprice;
	}

	public void setGoodsprice(Double goodsprice) {
		this.goodsprice = goodsprice;
	}

	public Long getGoodscount() {
		return this.goodscount;
	}

	public void setGoodscount(Long goodscount) {
		this.goodscount = goodscount;
	}

	public Date getCreationtime() {
		return this.creationtime;
	}

	public void setCreationtime(Date creationtime) {
		this.creationtime = creationtime;
	}

}