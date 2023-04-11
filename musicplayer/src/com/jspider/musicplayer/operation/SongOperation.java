package com.jspider.musicplayer.operation;

import java.util.ArrayList;

import java.util.Scanner;

import com.jspider.musicplayer.main.MusicPlayer;
import com.jspider.musicplayer.song.AllSong;

public class SongOperation extends AllSong {

	@SuppressWarnings("resource")
	public static void adsong() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Song name: ");
		String song = scanner.nextLine();
		System.out.print("Album name: ");
		String album = scanner.nextLine();
		System.out.print("Singer name: ");
		String singer = scanner.nextLine();
		System.out.print("Track name: ");
		String track = scanner.nextLine();
		AllSong.addSong(song, album, singer, track);
		System.out.println("Song added successfully...: ");
		MusicPlayer.goback();
	}

	public static void playSong() {
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		MusicPlayer.goback();
	}

	public static void chooseplay() {
		for (int i = 1; i < arrayList.size(); i++) {
			System.out.println("Choose " + i + arrayList.get(i));
		}
		System.out.print("Choose to play: ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int choose = scanner.nextInt();
		for (int i = 0; i <= arrayList.size(); i++) {
			if (i == choose) {
				System.out.println("Playing " + arrayList.get(choose));
				break;
			}
		}
		if (choose > arrayList.size()) {
			System.out.println("Invalid Input");
		}
		MusicPlayer.goback();
	}

	public static void removesong() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		for (int i = 1; i < arrayList.size(); i++) {
			System.out.println("Choose " + i + arrayList.get(i));
		}
		System.out.print("Choose to remove: ");
		int choose = scanner.nextInt();
		for (int i = 0; i < arrayList.size();) {
			if (i < choose) {
				try {
					arrayList.remove(choose);
				} catch (Exception e) {

				}
				System.out.println("Remove successfully....");
				break;
			} else {
				System.out.println("Invalid Input1");
				break;
			}
		}
		MusicPlayer.goback();
	}

	public static void playRandom() {
		int max = arrayList.size();
		int min = 1;
		int range = max - min + 1;

		for (int i = 1; i < arrayList.size(); i++) {
			int rand = (int) (Math.random() * range) + min;
			try {
				System.out.println(arrayList.get(rand));
			} catch (Throwable e) {
				System.out.println("add more songs");
			}
		}
		MusicPlayer.goback();
	}

	public static void editSong() {
		for (int i = 1; i < arrayList.size(); i++) {
			System.out.println("Choose " + i + arrayList.get(i));
		}
		System.out.print("Choose to play: ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int choose = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i <= arrayList.size(); i++) {
			if (i == choose) {
				System.out.println("Playing " + arrayList.get(choose));
				break;
			}
		}
		ArrayList<Object> arr = (ArrayList<Object>) arrayList.get(choose);

		System.out.print("Song name: ");
		String song = scanner.nextLine();
		arr.set(0, song);
		System.out.print("Album name: ");
		String album = scanner.nextLine();
		arr.set(1, album);
		System.out.print("Singer name: ");
		String singer = scanner.nextLine();
		arr.set(2, singer);
		System.out.print("Track : ");
		String track = scanner.nextLine();
		arr.set(3, track);

		MusicPlayer.goback();
	}

}
