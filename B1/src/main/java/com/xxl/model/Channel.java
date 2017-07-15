package com.xxl.model;

public enum Channel {

	red("xxl1"),
	green("xxl2");
	private String code;

	private Channel(String _code) {
		this.code = _code;
	}
	
	public static void main(String[] args) {
		System.out.println(Channel.green.code);
	}
}
