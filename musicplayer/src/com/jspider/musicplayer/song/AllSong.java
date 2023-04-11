package com.jspider.musicplayer.song;

import java.util.ArrayList;

public class AllSong {
	public static ArrayList<Object> arrayList = new ArrayList<>();
	static ArrayList<Object> update = new ArrayList<>();

	static {
		ArrayList<Object> song1 = new ArrayList<>();
		song1.add("Danza Kuduro");
		song1.add("BEATZ");
		song1.add("M.I.A");
		song1.add("4:24");
		ArrayList<Object> song2 = new ArrayList<>();
		song2.add("Ved Lavlay");
		song2.add("Ved");
		song2.add("Ajay-Atul");
		song2.add("5:34");
		ArrayList<Object> song3 = new ArrayList<>();
		song3.add("Malang Sajna");
		song3.add("MS");
		song3.add("Sanchet");
		song3.add("2:31");
		arrayList.add(song1);
		arrayList.add(song2);
		arrayList.add(song3);
		arrayList.add(update);
	}

	public static void addSong(String newSong, String newAlbum, String newSinger, String newTrack) {
		update.add(newSong);
		update.add(newAlbum);
		update.add(newSinger);
		update.add(newTrack);
	}
}
