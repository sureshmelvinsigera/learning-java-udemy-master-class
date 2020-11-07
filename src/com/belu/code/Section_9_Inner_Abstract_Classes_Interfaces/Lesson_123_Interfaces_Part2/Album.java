package com.belu.code.Section_9_Inner_Abstract_Classes_Interfaces.Lesson_123_Interfaces_Part2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {

	private String name;
	private String artist;
	private ArrayList<Song> songs;

	public Album(String name, String artist) {
		super();
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<>();
	}

	public boolean addSong(String title, double duration) {
		if (findSong(title) == null) {
			this.songs.add(new Song(title, duration));
			return true;
		}
		return false;
	}

	private Song findSong(String title) {
		for (Song song : songs) {
			if (song.getTitle().equals(title)) {
				return song;
			}
		}
		return null;
	}

	public boolean addToPlayList(int trackNumber, List<Song> playList) {
		int index = trackNumber - 1;
		if (index >= 0 && index <= this.songs.size()) {
			playList.add(this.songs.get(index));
			return true;
		}

		System.out.println("this album does not have a track " + trackNumber);
		return false;
	}

	public boolean addToPlayList(String title, List<Song> playList) {
		Song song = findSong(title);
		if (song != null) {
			playList.add(song);
			return true;

		}

		System.out.println("The song " + title + "is not in this album");
		return false;
	}

}
