package com.bootdo.gongyong.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author gjd
 * @email java_develop@aliyun.com
 * @date 2023-02-01 16:51:41
 */
public class GyBannerItemDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//banner id
	private Integer bannerid;
	//数值
	private String num;
	//单位
	private String unit;
	//标题
	private String title;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：banner id
	 */
	public void setBannerid(Integer bannerid) {
		this.bannerid = bannerid;
	}
	/**
	 * 获取：banner id
	 */
	public Integer getBannerid() {
		return bannerid;
	}
	/**
	 * 设置：数值
	 */
	public void setNum(String num) {
		this.num = num;
	}
	/**
	 * 获取：数值
	 */
	public String getNum() {
		return num;
	}
	/**
	 * 设置：单位
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	/**
	 * 获取：单位
	 */
	public String getUnit() {
		return unit;
	}
	/**
	 * 设置：标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：标题
	 */
	public String getTitle() {
		return title;
	}
}
