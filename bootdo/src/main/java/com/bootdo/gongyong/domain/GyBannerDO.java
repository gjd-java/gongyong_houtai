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
public class GyBannerDO implements Serializable {
	private static final long serialVersionUID = 1L;

	//
	private Integer id;
	//文件类型
	private boolean isimg;
	//文件地址
	private String url;
	//是否有子项内容
	private boolean issubitem;
	//点击跳转链接
	private String link;
	//是否上架
	private boolean isshow;
	//排序
	private String sorts;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isIsimg() {
		return isimg;
	}

	public void setIsimg(boolean isimg) {
		this.isimg = isimg;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isIssubitem() {
		return issubitem;
	}

	public void setIssubitem(boolean issubitem) {
		this.issubitem = issubitem;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public boolean isIsshow() {
		return isshow;
	}

	public void setIsshow(boolean isshow) {
		this.isshow = isshow;
	}

	public String getSorts() {
		return sorts;
	}

	public void setSorts(String sorts) {
		this.sorts = sorts;
	}
}
