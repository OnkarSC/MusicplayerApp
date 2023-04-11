package com.jspider.musicplayer.main;

import java.util.Scanner;

import com.jspider.musicplayer.operation.SongOperation;

public class MusicPlayer {

	public static void goback() {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println();
			System.out.println("1. PLAY SONGS");
			System.out.println("2. ADD/REMOVE SONGS");
			System.out.println("3. EDIT SONGS");
			System.out.println("4. EXIT");
			System.out.print("ENTER HERE: ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("1. PLAY ALL SONGS: ");
				System.out.println("2. RANDOM SONGS");
				System.out.println("3. CHOOSE TO PLAY");
				System.out.println("4. BACK TO MENU");
				int choice1 = scanner.nextInt();
				switch (choice1) {
				case 1:
					System.out.println("Playing....");
					SongOperation.playSong();
					break;
				case 2:
					System.out.println("Playing random songs....");
					SongOperation.playRandom();
					break;
				case 3:
					SongOperation.chooseplay();
					break;
				case 4:
					MusicPlayer.goback();
					break;

				default:
					System.out.println("INVALID INPUT");
					break;
				}
				return;
			}
			case 2: {
				System.out.println("1. ADD SONGS: ");
				System.out.println("2. REMOVE SONGS");
				System.out.println("3. BACK TO MENU");
				int choice2 = scanner.nextInt();
				switch (choice2) {
				case 1:
					SongOperation.adsong();
					break;
				case 2:
					SongOperation.removesong();
					break;
				case 3:
					MusicPlayer.goback();
					break;

				default:
					System.out.println("INVALID INPUT");
					continue;
				}
				return;
			}
			case 3:
				SongOperation.editSong();
				return;
			case 4:
				System.out.print("EXIT SUCCESSFULLY");
				return;
			default:
				System.out.println("INVALID INPUT");
				continue;
			}
		}
	}

	public static void main(String[] args) {
		goback();
	}
}
