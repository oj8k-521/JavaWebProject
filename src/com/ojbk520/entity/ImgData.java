package com.ojbk520.entity;

public class ImgData {
	public String imgTitle;
	public String imgSrc;
	public String imgHref;

	public ImgData(String imgTitle, String imgSrc, String imgHref) {
		super();
		this.imgTitle = imgTitle;
		this.imgSrc = imgSrc;
		this.imgHref = imgHref;
	}

	public ImgData() {
		super();
	}

	public String getImgTitle() {
		return imgTitle;
	}

	public void setImgTitle(String imgTitle) {
		this.imgTitle = imgTitle;
	}

	public String getImgSrc() {
		return imgSrc;
	}

	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}

	public String getImgHref() {
		return imgHref;
	}

	public void setImgHref(String imgHref) {
		this.imgHref = imgHref;
	}

}
