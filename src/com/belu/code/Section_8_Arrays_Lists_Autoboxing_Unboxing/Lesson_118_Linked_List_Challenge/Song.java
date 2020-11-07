package com.belu.code.Section_8_Arrays_Lists_Autoboxing_Unboxing.Lesson_118_Linked_List_Challenge;

public class Song {
	private String title;
	private double duration;

	public Song(String title, double duration) {
		super();
		this.title = title;
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return this.title + ":" + this.duration;
	}

}
