package com.om.spring.bean;

public class YoutubeBean {

	private YoutubeBean() {
	System.out.println
	("Created... \t" + this.getClass().getSimpleName());
	}

	public void play(String name) {
		System.out.println("Playing ...\t " + name);
	}

}
