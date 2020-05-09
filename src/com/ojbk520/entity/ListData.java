package com.ojbk520.entity;

public class ListData {
	private String title;
	private String content;

	public ListData(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}

	public ListData() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
