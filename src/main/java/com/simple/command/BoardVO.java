package com.simple.command;

public class BoardVO {
	
	private String bno;
	private String name;
	private String title;
	private String content;
	
	public BoardVO(String bno, String name, String title, String content) {
		this.bno = bno;
		this.name = name;
		this.title = title;
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getBno() {
		return bno;
	}

	public void setBno(String bno) {
		this.bno = bno;
	}
	
	
	
	
}
